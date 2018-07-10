package advanced

data class Dot(val x: Int, val y: Int) {
    operator fun plus(other: Dot): Dot = Dot(x + other.x, y + other.y) // sobrecarga do operador
    operator fun unaryMinus(): Dot = Dot(-x, -y) // sobrecarga do operador
}

fun main(args: Array<String>) {
    val dot1 = Dot(10, 20)
    val dot2 = Dot(10, 20)

    println(-dot1)
    println(dot1 + dot2)
}