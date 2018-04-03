package function

/**
 * Unit eh o equivalente ao void do Java, com a diferença que ele eh um objeto
  */
fun printMax1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun printMax2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun printMax3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun printMax4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun printMax5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    printMax1(2, 1)
    printMax2(2, 1)
    printMax3(2, 1)
    printMax4(2, 1)
    printMax5(2, 1).run { 2 > 1 }.run { print("Result: $this") }
}
