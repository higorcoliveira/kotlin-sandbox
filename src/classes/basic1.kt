package classes

class Customer {
    var name: String = ""
}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.name = "John"
    print("Customer name is ${customer.name}")
}