package basic.conversion

fun main(args: Array<String>) {
    val value : Any = "abc"

    if (value is String) { // negando com !is
        println(value)
    }
}
