package function

class Operation {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, function: (Int, Int) -> Int): Int {
    return function(a, b)
}

fun main(args: Array<String>) {
    // funcao classe
    println(calc(2, 3, Operation()::sum))
    // funcao top-level
    println(calc(2, 3, ::sum))
}