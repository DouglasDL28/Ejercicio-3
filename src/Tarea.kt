package modulo

class Tarea (
        val Nombre: String,
        var Completo: Boolean = false

) {
    fun completar () {
        Completo = true
    }

    override fun toString(): String {
        return """
            TAREA $Nombre:
                Completo: $Completo
        """.trimIndent()
    }

}