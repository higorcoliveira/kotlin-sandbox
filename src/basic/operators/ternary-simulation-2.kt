package basic.operators

fun getResult(grade: Double) : String = if (grade >= 7.0) "Approved" else "Not approved"

fun main(args: Array<String>) {
    println(getResult(6.3))
}