package collection

fun Any.print() = println(this) // funcao que facilita a impressao do valor

fun main(args: Array<String>) {
    val set = hashSetOf(3, 'a', "text", true, 3.14)

    set.add(3).print()
    set.add(10).print()

    set.size.print()

    set.remove('a').print()
    set.contains("text").print()

    val numbers = setOf(1, 2, 3) // read only

    (set + numbers).print()
    (set - numbers).print()

    set.intersect(numbers).print() // nao muda o conjunto
    set.retainAll(numbers) // altera o conjunto
    set.print()
}