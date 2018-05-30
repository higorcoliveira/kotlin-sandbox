package lambda

class Product(val name: String, val price: Double)

val stuff = listOf(
        Product("Pencil", 2.90),
        Product("Eraser", 0.50),
        Product("Notebook", 5.00)
)

fun main(args: Array<String>) {
    val sumTotal = { total: Double, current: Double -> total + current }
    val totalPrice = stuff.map { it.price }.reduce(sumTotal)

    println("Total price is $ $totalPrice")
}