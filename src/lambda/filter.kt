package lambda

data class Student(val name: String, val grade: Double)

fun main(args: Array<String>) {
    val students = arrayListOf(
            Student("Peter", 7.5),
            Student("John", 8.0),
            Student("Ane", 4.1)
    )

    val approved = students.filter { it.grade >= 7.0 }.sortedBy { it.name }

    println(approved)
}