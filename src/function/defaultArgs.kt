package function

fun potency(base: Int = 2, exponent: Int = 1): Int {
    return Math.pow(base.toDouble(), exponent.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(potency(2, 3))
    println(potency(10))
    println(potency(base = 10))
    println(potency(exponent = 8))
}
