package basic.operators

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial
    println(d1 === d2)

    // Igualdade estrutural (equals do Java)
    println(d1 == d2)
    println(d1.equals(d2))
}
