package basic.operators

data class Car(val brand: String, val model: String)

fun main(args: Array<String>) {
    val (brand, model) = Car("Ford", "Fusion")
    println("$brand $model")

    val (husband, woman) = listOf("John", "Ada")
    println("$husband e $woman")

    val (_, _, thirdPlace) = listOf("Kimi", "Hamilton", "Alonso")
    println("$thirdPlace finished in third place...")
}
