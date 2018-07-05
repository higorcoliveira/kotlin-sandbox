package collection

fun main(args: Array<String>) {
    val numbers = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("John", "Ada", "Mole")
    val union = numbers + strings // operator overloading

    for (item in union) {
        println(item)
    }
}
