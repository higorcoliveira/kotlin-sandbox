package function

fun workRelationship(manager: String, employee: String): String {
    return "$employee is employee of $manager"
}

fun main(args: Array<String>) {
    println(workRelationship("John", "Ada"))
    println(workRelationship(employee = "John", manager = "Ada"))
}
