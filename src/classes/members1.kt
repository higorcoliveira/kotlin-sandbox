package classes

class Date(var day: Int, var month: Int, var year: Int) {
    fun format(): String {
        return "$day/$month/$year"
    }
}

fun main(args: Array<String>) {
    var birthDay: Date = Date(day = 11, month = 10, year = 1995)

    println("${birthDay.day}/${birthDay.month}/${birthDay.year}")
    with(birthDay) { println("${day}/${month}/${year}")}
    println(birthDay.format())
}