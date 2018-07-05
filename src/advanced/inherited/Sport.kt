package advanced.inherited

interface Sport {
    var nitro: Boolean

    fun enableNitro() {
        nitro = true
    }

    fun disableNitro() {
        nitro = false
    }
}