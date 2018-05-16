package classes

class Product(var name: String, var price: Double, var discount: Double, var active: Boolean) {
    val inactive: Boolean get() = !active
    val priceWithDiscount: Double get() = price * (1 - discount)
}

fun main(args: Array<String>) {
    val p1 = Product("iPad", 2349.90, 0.20, active = true)
    println(p1.priceWithDiscount)

    val p2 = Product("galaxy Note 7", 2699.90, 0.50, active = false)
    println("${p2.name}\n\tFrom: R$ ${p2.price} \n\tFor: R$ ${p2.priceWithDiscount}")

    if (p2.inactive) {
        p2.price = 0.0
        println("After inactivate: R$ ${p2.priceWithDiscount}")
    }
}