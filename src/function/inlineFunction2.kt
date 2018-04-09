package function

inline fun <T> executeWithLog(functionName: String, function: () -> T): T {
    println("Entering on method $functionName")
    try {
        return function()
    } finally {
        println("Method $functionName finished")
    }
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val result = executeWithLog("sum2") { // lambda
        sum2(4, 5) // segundo parametro da funcao inline
    }
    println(result)
}
