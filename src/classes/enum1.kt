package classes

enum class WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main(args: Array<String>) {
    print("The best day of the week is ${WeekDay.SATURDAY}")
}