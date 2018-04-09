package function

fun <E> doFilter(list: List<E>, filter: (E) -> Boolean): List<E> {
    val filteredList = ArrayList<E>()
    for (e in list) {
        if (filter(e)) {
            filteredList.add(e)
        }
    }
    return filteredList
}

fun with3letters(name: String): Boolean {
    return name.length == 3
}

fun main(args: Array<String>) {
    val names = listOf("Ane", "Peter", "Ada", "Art", "Paul")
    println(doFilter(names, ::with3letters))
}