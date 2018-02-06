package basic.control

fun main(args: Array<String>) {
    var students = arrayListOf("John", "Ada", "Mole")

    for ((index, student) in students.withIndex()) {
        println("${index + 1} - $student")
    }
}
