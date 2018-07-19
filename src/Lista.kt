package modulo

class Lista (
        val nombre: String,
        val tareas: ArrayList<Tarea> = ArrayList()

) {
    fun verTareas() {
        println("Tareas: ")
        for (i in tareas.indices) {
         println("${i+1}. ${tareas[i].Nombre} Completo: ${tareas[i].Completo}")
     }

    }

    fun agregarTarea(tarea: Tarea){
        tareas.add(tarea)
    }
}
