package classes

class Movie2(val name: String, val releaseDate: Int, val gender: String)

fun main(args: Array<String>) {
    val movie = Movie2("Lord of the Rings", 2001, "Fantasy")
    println("${movie.name} was launched in ${movie.releaseDate}.")
}
