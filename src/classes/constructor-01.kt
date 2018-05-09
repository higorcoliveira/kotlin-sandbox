package classes

// jeito java de criar construtor
class Movie {
    val name: String
    val releaseDate: Int
    val gender: String

    constructor(name: String, releaseDate: Int, gender: String) {
        this.name = name
        this.releaseDate = releaseDate
        this.gender = gender
    }
}

fun main(args: Array<String>) {
    val movie = Movie("Lord of the Rings", 2001, "Fantasy")
    println("${movie.name} was launched in ${movie.releaseDate}.")
}
