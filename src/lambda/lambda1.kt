package lambda

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y}
    println(sum(4, 6))
}