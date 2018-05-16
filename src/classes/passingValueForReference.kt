package classes

// ERROR!!
//fun forReference(velocity: Int) {
//    velocity++
//}

data class Car(var brand: String, var model: String, var velocity: Int = 0)

fun forReference(car: Car) {
    car.velocity++
}

fun main(args: Array<String>) {
    var car1 = Car("Ford", "Fusion")

    var car2 = car1 // mesmo endereço de memória
    car2.model = "Edge"
    println(car1)

    car1 = Car("Audi", "A4") // nova referência
    forReference(car1)
    forReference(car2)

    println(car1)
    println(car2)
}