package modulo

class Lista (
        val nombre: String,
        val tareas: ArrayList<Tarea> = ArrayList()

) {
    fun verTareas(index: Int): Tarea? {
        return tareas.getOrNull(index)
    }


    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }


    override fun toString(): String {
        var strLista = " "
        tareas.forEachIndexed { index, tarea -> strLista += "${index + 1}: $tarea\n" }
        return """
            LISTA DE TAREAS $nombre:
            $strLista
        """.trimIndent()
    }
}
