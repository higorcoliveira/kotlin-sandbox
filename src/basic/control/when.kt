package basic.control

fun main(args: Array<String>) {
    val grade = 2

    when (grade) { //equivalente ao switch do java
        10, 9 -> print("Very good")
        8, 7 -> print("Good")
        6, 5, 4 -> print("Bad")
        in 0..3 -> print("Not approved")
        else -> print("Invalid grade")
    }
}
