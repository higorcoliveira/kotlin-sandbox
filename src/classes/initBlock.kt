package classes

class Movie3(name: String, launchYear: Int, gender: String) {
    val name: String
    val launchYear: Int
    val gender: String

    init {
        this.name = name
        this.launchYear = launchYear
        this.gender = gender
    }
}

fun main(args: Array<String>) {
    val movie3 = Movie3("Godfather", 1972, "Drama")
    println("The ${movie3.gender} ${movie3.name} was release in ${movie3.launchYear}")
}