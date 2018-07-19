package modulo

class Lista (
        val nombre: String,
        val tareas: ArrayList<Tarea> = ArrayList()

) {
    fun crearTarea(nombre: String) {
     val nueva_tarea = Tarea(nombre = nombre)

    }
}
