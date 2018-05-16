package classes

class Customer2 {
    constructor(name: String) {
        this.name = name
    }
     var name: String
        get() = "My name is ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonymous"
        }
}

fun main(args: Array<String>) {
    val c1 = Customer2("")
    println(c1.name)

    val c2 = Customer2("John")
    println(c2.name)
}