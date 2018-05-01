package classes

/**
 * Construtores em kotlin sao menos verbosos do que em Java
 */
class Person1(var name: String)

class Person2(val name: String)

class Person3(name: String) {
    val name: String = name
}

fun main(args: Array<String>) {
    val p1 = Person1(name = "John")
    p1.name = "William"
    println("${p1.name} knows kotlin")

    val p2 = Person2("Mary")
    val p3 = Person3(name = "Peter")

    println("${p2.name} and ${p3.name} are cool")
}