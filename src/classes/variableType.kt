package classes

val global = "Good morning"

fun topLevel() {
    val local = "John Doe"
    println("$global $local")
}

class Thing {
    var variable: String = "Good night" // variavel de instancia

    companion object { // singleton
        @JvmStatic val classConstant = "Mary Doe"
    }

    fun justDo() {
        val local: Int = 7

        if (local > 3) {
            val varBlock = "Paul Doe"
            println("$variable, $classConstant, $local, $varBlock")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Thing().justDo()
    println(Thing.classConstant)
}
