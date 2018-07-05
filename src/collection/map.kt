package collection

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "John")
    map.put(10020030041, "Peter")
    map.put(10020030042, "Mary")
    map.put(10020030041, "Peter Jr")

    for (entry in map) {
        println(entry)
    }

    for (name in map.values) {
        println(name)
    }

    for (code in map.keys) {
        println(code)
    }

    for ((code, name) in map) {
        println("$code: $name")
    }
}
