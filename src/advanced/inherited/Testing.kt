package advanced.inherited

fun main(args: Array<String>) {
    val car = Ferrari()
    car.boost()
    println(car)

    car.enableNitro()
    car.boost()
    println(car)

    car.breakk()
    car.breakk()
    println(car)
}
