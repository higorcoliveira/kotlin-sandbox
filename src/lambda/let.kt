package lambda

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for(item in listWithNulls) {
        item?.let { // o operador null safe impede que elementos nulos chamem o let
            println(it)
        } // ao contrario do apply, o resultado do let nao eh o mesmo objeto, e sim um Unit
    }
}
