package classes

/**
 * Descomentando essa variável e comentando a variável estática discount
 * dentro da classe OrderItem é a melhor prática
 */
//var discount: Double = 0.0

// variável dentro de uma classe
class OrderItem(val name: String, var price: Double) {
    companion object {
        fun create(name: String, price: Double) = OrderItem(name, price)
        @JvmStatic var discount: Double = 0.0
    }

    fun priceWithDiscount(): Double {
        return price - price * discount
    }
}

fun main(args: Array<String>) {
    val item1 = OrderItem.create("TV 50 inches", 2989.90)
    var item2 = OrderItem("Notebook Acer", 3000.00)
    OrderItem.discount = 0.10

    println(item1.priceWithDiscount())
    println(item2.priceWithDiscount())
}