package lambda

fun main(args: Array<String>) {
    val students = arrayListOf("Peter", "Alan", "Thomas")
    students.map { it.toUpperCase() }
            .apply { print(this) }
}