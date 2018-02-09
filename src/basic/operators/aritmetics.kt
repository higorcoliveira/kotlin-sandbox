package basic.operators

fun main(args: Array<String>) {
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    val sum = v1 + v2 + v3 + v4
    val minus = v1 - v2 - v3 - v4
    val multiplication = v1 * v2
    val division = v4 + v1
    val module = v1 % 2

    println("$sum $minus $multiplication $division $module")
}
