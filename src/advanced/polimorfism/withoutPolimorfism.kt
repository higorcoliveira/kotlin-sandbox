package advanced.polimorfism

class Pasta2(val weight: Double)
class Rice2(val weight: Double)

class Person2(var weight: Double) {
    fun eat(pasta: Pasta2) {
        weight += pasta.weight
    }

    fun eat(rice: Rice2) {
        weight += rice.weight
    }
}

fun main(args: Array<String>) {
    val pasta = Pasta2(0.3)
    val rice = Rice2(0.3)

    val john = Person2(80.5)
    john.eat(pasta)
    john.eat(rice)

    println(john.weight)
}