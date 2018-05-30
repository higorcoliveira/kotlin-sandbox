package lambda

fun main(args: Array<String>) {
    println("Type your message: ")

    val entry = readLine()
    val message = entry.takeIf { it?.trim() != "" } ?: "No message..."

    println(message)
}
