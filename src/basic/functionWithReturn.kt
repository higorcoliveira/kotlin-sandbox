package basic

fun main(args: Array<String>) {
    print(sumWithReturn(4))
}

fun sumWithReturn(a: Int, b: Int = 1): Int {
    return a + b
}