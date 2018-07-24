package minefield.model

import java.util.*

// resultados do jogo
enum class BoardEvent { VICTORY, LOSE }

class Board(val qtRows: Int, val qtColumns: Int, private val qtMines: Int) {

    private val fields = ArrayList<ArrayList<Field>>()
    private val callbacks = ArrayList<(BoardEvent) -> Unit>()

    // monta o tabuleiro
    init {
        generateFields()
        associateNeighbors()
        spreadMines()
    }

    private fun generateFields() {
        for (row in 0 until qtRows) {
            fields.add(ArrayList())
            for (column in 0 until qtColumns) {
                val newField = Field(row, column)
                newField.onEvent(this::checkIfWasWinOrLose)
                fields[row].add(newField)
            }
        }
    }

    private fun associateNeighbors() {
        forEachField { associateNeighbors(it) }
    }

    private fun associateNeighbors(field: Field) {
        val (row, column) = field
        val rows = arrayOf(row - 1, row, row + 1)
        val columns = arrayOf(column - 1, column, column + 1)

        // trata bordas do tabuleiro
        rows.forEach { r ->
            columns.forEach { c ->
                val actual = fields.getOrNull(r)?.getOrNull(c)
                actual?.takeIf { field != it }?.let { field.addNeighboor(it)}
            }
        }
    }

    private fun spreadMines() {
        val generator = Random()

        var rowSorted = -1
        var columnSorted = -1
        var qtMinesActual = 0

        while (qtMinesActual < this.qtMines) {
            rowSorted = generator.nextInt(qtRows)
            columnSorted = generator.nextInt(qtColumns)

            val fieldSorted = fields[rowSorted][columnSorted]
            if (fieldSorted.secured) {
                fieldSorted.mining()
                qtMinesActual++
            }
        }
    }

    private fun goalAchieved(): Boolean {
        var playerWin = true
        forEachField { if (!it.goalReached) playerWin = false }
        return playerWin
    }

    private fun checkIfWasWinOrLose(field: Field, event: FieldEvent) {
        if (event == FieldEvent.EXPLOSION) {
            callbacks.forEach { it(BoardEvent.LOSE) }
        } else if (goalAchieved()) {
            callbacks.forEach { it(BoardEvent.VICTORY) }
        }
    }

    fun forEachField(callback: (Field) -> Unit) {
        fields.forEach { row -> row.forEach(callback) }
    }

    fun onEvent(callback: (BoardEvent) -> Unit) {
        callbacks.add(callback)
    }

    // reseta o tabuleiro e espalha as minas novamente
    fun reset() {
        forEachField { it.reset() }
        spreadMines()
    }
}