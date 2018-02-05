package basic

fun main(args: Array<String>) {
    val optional: String? = null
    val mandatory: String = optional ?: "Default value"

    println(mandatory)
}
