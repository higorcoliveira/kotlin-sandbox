package collection

fun main(args: Array<String>) {
    val approvedWithoutOrder = hashSetOf("John", "Ana", "Paul", "Brian")

    approvedWithoutOrder.forEach { it.print() }

    val approvedWithOrder = linkedSetOf("John", "Ana", "Paul", "Brian")

    println("\nOrdered...")
    approvedWithOrder.forEach { it.print() }

    val approvedWithOrderAndSorted = sortedSetOf("John", "Ana", "Paul", "Brian")

    println("\nOrdered and Sorted...")
    approvedWithOrderAndSorted.forEach { it.print() }

    println("\nCustom ordered...")
    approvedWithoutOrder.sortedBy { it.substring(1) }.print() // ordenando pela segunda letra
}
