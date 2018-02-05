package basic

fun main(args: Array<String>) {
    var a: Int? = null
    println(a?.inc()) // safe operator

    println(a!!.inc()) // forçando a chamada com variavel nula
}
