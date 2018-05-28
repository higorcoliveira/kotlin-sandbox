package lambda

interface Operation {
    fun execute(a: Int, b: Int): Int
}

class Multiply: Operation {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculator {
    fun calculate(a: Int, b: Int): Int {
        return a + b
    }


    fun calculate(a: Int, b: Int, operator: Operation): Int {
        return operator.execute(a, b)
    }

    // utilizando lambda
    fun calculate(a: Int, b: Int, operator: (Int, Int) -> Int): Int {
        return operator(a, b)
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator()
    val result1 = calculator.calculate(3, 4)
    val result2 = calculator.calculate(3, 4, Multiply())

    val minus = { a: Int, b: Int -> a - b }
    val result3 = calculator.calculate(3, 4 , minus)

    println(result1)
    println(result2)
    println(result3)
}