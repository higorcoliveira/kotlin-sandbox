package collection

fun main(args: Array<String>) {
    val strings = arrayListOf("Car", "Bike", "Airplane", "Boat")

    for (item in strings) {
        println(item.toUpperCase())
    }
}