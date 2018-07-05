package advanced

import collection.print

private val insideFile = 1
//protected val protectedNotSupported = 1 // so e possivel dentro de classe
internal val insideProject = 1
val publicVar = 1 // palavra chave public e redundante

open class Capsule { // permite herança com a palavra chave open
    private val insideObject = 1
    protected val byInherited = 1
    internal val insideProject = 1
}

// serve tambem para funções

class ChildCapsule : Capsule() {
    fun checkAccess() {
        println(byInherited)
        println(insideProject)
        println(publicVar)
    }
}

fun checkAccess() {
    println(Capsule().insideProject)
    println(publicVar)
}