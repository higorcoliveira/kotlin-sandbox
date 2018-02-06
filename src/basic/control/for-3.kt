package basic.control

fun main(args: Array<String>) {
    for (i in 0..10000 step 5) {
        println(i)
    }

    for (i in 10000 downTo 0 step 5) {
        println(i)
    }
}
