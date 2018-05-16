package classes

enum class WeekDay2 (val id: Int, val named: String, val util: Boolean) {
    SUNDAY(1, "Sunday", false),
    MONDAY(2, "Monday", true),
    TUESDAY(3, "Tuesday", true),
    WEDNESDAY(4, "Wednesday", true),
    THURSDAY(1, "Thursday", true),
    FRIDAY(1, "Friday", true),
    SATURDAY(1, "Saturday", false)
}

fun main(args: Array<String>) {
    for (day in WeekDay2.values()) {
        println("${day.named} is a day ${if(day.util) "of business" else "of weekend"}")
    }
}