package collection

data class Fruit (var name: String, var price: Double)

fun main(args: Array<String>) {
    var fruits = arrayListOf(Fruit("Banana", 1.50), Fruit("Strawberry", 3.20))

    for (fruit in fruits) {
        println("${fruit.name} - R$ ${fruit.price}")
    }
}
