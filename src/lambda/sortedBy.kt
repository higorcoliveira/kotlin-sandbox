package lambda

fun main(args: Array<String>) {
    val names = arrayListOf("John", "Paul", "Ane", "Julia")
    val sorted = names.sortedBy { it }
    val sortedReverse = names.sortedBy { it.reversed() }

    println(sorted)
    println(sortedReverse)
}