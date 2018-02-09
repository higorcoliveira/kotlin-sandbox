package basic.operators

fun main(args: Array<String>) {
    val workExecuted1: Boolean = true
    val workExecuted2: Boolean = false

    val buyIceCream: Boolean = workExecuted1 || workExecuted2
    val buyTV50: Boolean = workExecuted1 && workExecuted2
    val buyTV32: Boolean = workExecuted1 xor workExecuted2

    println(buyIceCream)
    println(buyTV50)
    println(buyTV32)

    if (!buyIceCream) {
        println("You're a healthy guy")
    }

}
