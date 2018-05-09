package classes

class Fridge(val brand: String, val liters: Int)

data class TV(val brand: String, val inches: Int)

fun main(args: Array<String>) {
    val g1 = Fridge("Brastemp", 320)
    val g2 = Fridge("Brastemp", 320)

    println(g1 == g2) // classe normal nao implementa o equals por default
    println(g1.toString())

    val tv1 = TV("Samsung", 32)
    val tv2 = TV("Samsung", 32)

    // toString e copy sao metodos implementados para data class
    println(tv1 == tv2)
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(inches = 42))

    // Destructuring
    val (brand, inches) = tv1
    println("$brand, $inches")
}
