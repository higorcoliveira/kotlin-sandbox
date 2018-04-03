package function

fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this[1] else null

fun main(args: Array<String>) {
    val list = listOf("John", "Ada", "Mole")
    println(list.secondOrNull())

    val listWithOne = listOf("Jonh")
    println(listWithOne.secondOrNull())
}
