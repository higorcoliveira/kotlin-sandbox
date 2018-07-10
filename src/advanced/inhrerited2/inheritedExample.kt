package advanced.inhrerited2

open class Animal(val name: String)

class Dog : Animal {
    private val height: Double

    constructor(name: String, height: Double) : super(name) {
        this.height = height
    }

    constructor(name: String) : this(name, 0.0) // chamando construtor da mesma classe

    override fun toString(): String = "$name has $height inches..."
}

fun main(args: Array<String>) {
    val dogAlemao = Dog("Spyke", 84.3)
    val yorkshire = Dog("Lady Di")

    println(dogAlemao)
    println(yorkshire)
}