package collection

fun main(args: Array<String>) {
    val even = arrayListOf(2, 4, 6)
    val odd = intArrayOf(1, 3, 5)

    for (n in odd.union(even).sorted()) {
        print("$n ")
    }
}