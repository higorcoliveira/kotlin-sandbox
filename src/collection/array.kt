package collection

fun main(args: Array<String>) {
    val numbers = Array(10) { i -> i * 10 }

    for (number in numbers) {
        println(number)
    }
}
