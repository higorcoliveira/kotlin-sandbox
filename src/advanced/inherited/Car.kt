package advanced.inherited

open class Car (var currentSpeed: Int = 0, val maxSpeed: Int = 200) {

    protected fun changeSpeedBy(speed: Int) {
        val newSpeed = currentSpeed + speed
        currentSpeed = when(newSpeed) {
            in 0..maxSpeed -> newSpeed
            in maxSpeed + 1..Int.MAX_VALUE -> maxSpeed
            else -> 0
        }
    }

    open fun boost() { // metodo pode ser sobrescrito
        changeSpeedBy(5)
    }

    open fun breakk() { // metodo pode ser sobrescrito
        changeSpeedBy(-5)
    }

    override fun toString(): String {
        return "Speed is $currentSpeed Km/h"
    }
}
