package collection

fun main(args: Array<String>) {
    val students = arrayListOf("John", "Paul", "Jones", "Joan")

    for (student in students) {
        println(student)
    }

    for ((index, student) in students.withIndex()) {
        println("$index - $student")
    }
}
