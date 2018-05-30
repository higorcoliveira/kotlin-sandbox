package lambda

data class House(var address: String = "", var number: Int = 0)

fun main(args: Array<String>) {
    var house = House()

    house.run {
        address = "Street ABC"
        number = 1544
    } // run nao retorna o objeto House, eh a diferença basica com o apply

    println(house)
}
