package advanced

class Box<T>(val obj3ct: T) {
    private val obj3cts = ArrayList<T>()

    init {
        add(obj3ct)
    }

    fun add(newObject: T) {
        obj3cts.add(newObject)
    }

    override fun toString(): String = obj3cts.toString()
}

fun main(args: Array<String>) {
    val stuffs = Box("Pen")
    stuffs.add("Pencil")
    stuffs.add("Eraser")

    println(stuffs)

    val numbers = Box(1)
    numbers.add(3)
    numbers.add(4)

    println(numbers)
}