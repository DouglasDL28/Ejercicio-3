package modulo

class Tarea (
        val Nombre: String,
        var Completo: Boolean = false

) {
    fun completar () {
        Completo = true
    }

}