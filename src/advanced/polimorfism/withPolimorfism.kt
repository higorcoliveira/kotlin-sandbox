package advanced.polimorfism

open class Food(val weight: Double)
class Pasta(weight: Double) : Food(weight)
class Rice(weight: Double): Food(weight)
class Egg(weight: Double): Food(weight)

class Person(var weight: Double) {

    fun eat(food: Food) {
        weight += food.weight
    }
}

fun main(args: Array<String>) {
    val pasta = Pasta(0.3)
    val rice = Rice(0.3)
    val egg = Egg(0.2)

    val john = Person(80.5)
    john.eat(pasta)
    john.eat(rice)
    john.eat(egg)

    println(john.weight)
}