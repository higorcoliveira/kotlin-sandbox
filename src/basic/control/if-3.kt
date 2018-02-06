package basic.control

fun main(args: Array<String>) {
    val num1: Int = 10
    val num2: Int = 3

    // kotlin permite que se atribua o resultado de um if a uma variavel
    // ate a versao atual nao existe operador ternario
    val greater = if (num1 > num2) {
        println("Processando if...")
        num1
    } else {
        println("Processando else...")
        num2
    }
    println(greater)
}