package basic.control

fun main(args: Array<String>) {
    val grade: Double = 9.3

    // usando o operador range
    if (grade in 9..10) {
        println("Very good")
    } else if (grade in 7..8) {
        println("Good")
    } else if (grade in 4..6) {
        println("Bad")
    } else {
        println("Not approved")
    }
}