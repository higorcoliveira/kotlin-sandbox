package advanced.inherited

class Ferrari: Car(maxSpeed = 350), Sport {
    override var nitro: Boolean = false
        get() = field
        set(value) { field = value }

    override fun boost() {
        super.changeSpeedBy(if (nitro) 50 else 25)
    }

    override fun breakk() {
        super.changeSpeedBy(-25)
    }
}
