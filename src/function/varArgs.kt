package function

// no java utiliza ...
fun sort(vararg numbers: Int): IntArray {
    return numbers.sortedArray()
}

fun main(args: Array<String>) {
    for (n in sort(3, 4, 13, 456, 10, 1000, 68)) {
        print("$n ")
    }
}
