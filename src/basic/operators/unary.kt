package basic.operators

fun main(args: Array<String>) {
    var a: Int = 1
    var b: Int = 2

    a++
    println(a)
    --a
    println(a)

    println(++a == b--)
    println(a == b)
}
