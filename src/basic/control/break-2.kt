package basic.control

fun main(args: Array<String>) {
    external@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) break@external
            println("$i $j")
        }
    }
}
