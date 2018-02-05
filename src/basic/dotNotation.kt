package basic

fun main(args: Array<String>) {
    val a: Int = 33.dec()
    var b: String = a.toString()

    println(b)
    println("First char of string b: ${b.first()}")
}
