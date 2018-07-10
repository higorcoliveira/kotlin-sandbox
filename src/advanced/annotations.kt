package advanced

annotation class Positive
annotation class NotEmpty

class Person(id: Int, name: String) {

    @Positive
    var id: Int = id

    @NotEmpty
    var name: String = name
}

// reflection
// recebe uma instancia e pega o valor do atributo passado dessa instancia
fun getValue(obj: Any, attributeName: String): Any {
    val attribute = obj.javaClass.getDeclaredField(attributeName)
    val isAccessible = attribute.isAccessible

    attribute.isAccessible = true
    val value = attribute.get(obj)
    attribute.isAccessible = isAccessible

    return value
}

// verifica as anotações da classe e faz as validações necessárias
fun validate(obj: Any): List<String> {
    val msgs = ArrayList<String>()
    obj::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val value = getValue(obj, member.name)
            when (annotation) {
                is Positive ->
                    if (value !is Int || value <= 0) {
                        msgs.add("Value '$value' is not a positive number")
                    }
                is NotEmpty ->
                    if (value !is String || value.trim().isEmpty()) {
                        msgs.add("Value '$value' is not a valid string")
                    }
            }
        }
    }
    return msgs
}

fun main(args: Array<String>) {
    val obj1 = Person(1, "Paul")
    println(validate(obj1))

    val obj2 = Person(-11, "")
    println(validate(obj2))
}