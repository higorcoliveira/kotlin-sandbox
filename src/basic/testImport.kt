package basic

/**
 * Ja existem importacoes padrao do java no kotlin, como exemplo java.lang
 */
import basic.anotherPackageA.CoinFace.HEAD
import basic.anotherPackageA.Thing
import basic.anotherPackageA.anotherFunction as myFunction

fun main(args: Array<String>) {
    println(myFunction("OK"))

    val thing = Thing("Ball")
    println(thing.name)

    println(HEAD)

    println(basic.anotherPackageB.sum(1, 2))
    println(basic.anotherPackageB.subtract(1, 2))
}
