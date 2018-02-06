package basic.control

fun main(args: Array<String>) {
    var option: Int = 1

    while (option != -1) {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0

        println("You choose the option $option")
    }

    println("Exit...")
}
