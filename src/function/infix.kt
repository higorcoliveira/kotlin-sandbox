package function

class Product(val name: String, val price: Double)

infix fun Product.moreExpensiveThan(product: Product): Boolean = this.price > product.price

fun main(args: Array<String>) {
    val p1 = Product("ipad", 2349.00)
    val p2 = Product("borracha", 3.00)
    println(p1 moreExpensiveThan p2)
    println(p2.moreExpensiveThan(p1))
}