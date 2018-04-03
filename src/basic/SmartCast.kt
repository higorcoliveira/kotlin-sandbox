package basic

fun imsmart(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun imsmart2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Nenhum tipo conhecido...")
    }
}

fun main(args: Array<String>) {
    imsmart("Ola")
    imsmart(9)

    imsmart2("Ola")
    imsmart2(7)

    imsmart2(true)
}
