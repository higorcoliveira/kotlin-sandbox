package function

import java.util.*

data class Schedule(val hour: Int, val minute: Int, val second: Int)

// simulando multiplos retornos com destructuring
fun now(): Schedule {
    val now = Calendar.getInstance()

    with(now) { //inline function
        return Schedule(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
    val (h, m, s) = now()
    println("$h:$m:$s")
}