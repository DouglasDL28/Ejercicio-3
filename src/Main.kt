import modulo.*

var listas: ArrayList<Lista> = ArrayList()

// Menú cuando no existen listas.
val menu_noLista = """
    Menu (si no hay lista):
        1. Crear una lista.
        2. Salir.

        Seleccione una opción (1-2)
""".trimIndent()

//Menú cuando existen listas pero no se ha seleccionado una.
val menu_noSeleccion = """
    1. Crear lista.
    2. Ver listas.
    3. Seleccionar lista.

    Seleccione una opcion (1-3)
""".trimIndent()

// Menu cuando ya se seleccionó una lista.
val menu_conSeleccion = """
    1. Deseleccionar lista.
    2. Agregar una tarea.
    3. Completar una tarea.
    4. Ver todas las tareas.
    5. Salir.

    Seleccione una opción (1-5)
""".trimIndent()

fun main(args: Array<String>) {

        while (listas.isEmpty()) {
            println(menu_noLista)

            var opcion = readLine()!!.toInt()

            when (opcion) {
                1 -> {
                    println("Ingrese el nombre de la lista: ")
                    val nombre = readLine()!!
                    val lista = Lista(nombre)
                    listas.add(lista)
                }
            }
        }

        do {
            println(menu_noSeleccion)
            var opcion = readLine()!!.toInt()
            when (opcion) {
                1 -> {}
            }
        } while (!listas.isEmpty())



}