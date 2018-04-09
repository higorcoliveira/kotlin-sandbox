package function

inline fun transaction(function: () -> Unit) {
    println("opening transaction...")
    try {
        function()
    } finally {
        println("closing transaction")
    }
}

fun main(args: Array<String>) {
    transaction {
        println("Executing SQL 1...")
        println("Executing SQL 2...")
        println("Executing SQL 3...")
    }
}
