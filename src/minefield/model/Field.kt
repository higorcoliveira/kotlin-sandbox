package minefield.model

// comportamentos do campo
enum class FieldEvent{ OPENING, MARKED, MARKOFF, EXPLOSION, RESET }

data class Field(val row: Int, val column: Int) {

    private val neighbors = ArrayList<Field>()
    private val callbacks = ArrayList<(Field, FieldEvent) -> Unit>()

    // campos de estado mutáveis
    var marked: Boolean = false
    var opened: Boolean = false
    var mined: Boolean = false

    // read only
    val markoff: Boolean get() = !marked
    val closed: Boolean get() = !opened
    val secured: Boolean get() = !mined
    val goalReached: Boolean get() = secured && opened || mined && marked
    val qtMinedNeighbors: Int get() = neighbors.filter { it.mined }.size
    val securedNeighborhood: Boolean get() = neighbors.map { it.secured }
            .reduce{ result, secured -> result && secured }

    fun addNeighboor(neighbor: Field) {
        neighbors.add(neighbor)
    }

    // registra todos os eventos que ocorrem conforme cliques nos campos
    fun onEvent(callback: (Field, FieldEvent) -> Unit) {
        callbacks.add(callback)
    }

    fun open() {
        if (closed) {
            opened = true
            if (mined) {
                callbacks.forEach { it(this, FieldEvent.EXPLOSION)}
            } else {
                callbacks.forEach { it(this, FieldEvent.OPENING)}
                // recursão para abrir os vizinhos seguros
                neighbors.filter { it.closed && it.secured && securedNeighborhood }.forEach { it.open() }
            }
        }
    }

    fun changeMarked() {
        if (closed) {
            marked = !marked
            val event = if (marked) FieldEvent.MARKED else FieldEvent.MARKOFF
            callbacks.forEach { it(this, event) }
        }
    }

    fun mining() {
        mined = true
    }

    fun reset() {
        opened = false
        mined = false
        marked = false
        callbacks.forEach { it(this, FieldEvent.RESET) }
    }
}