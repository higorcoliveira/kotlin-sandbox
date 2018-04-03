package function

fun min(a: Int, b: Int): Int = if (a < b) a else b

fun main(args: Array<String>) {
    print("The minor value is ${min(3, 4)}")
}