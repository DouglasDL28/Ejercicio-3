import modulo.*


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
    var listas: ArrayList<Lista> = ArrayList()

        while (listas.isEmpty()) {
            println(menu_noLista)

            var opcion = readLine()!!.toInt()

            when (opcion) {
                1 -> {
                    println("Ingrese el nombre de la lista: ")
                    val nombre = readLine()!!
                    val nueva_lista = Lista(nombre)
                    listas.add(nueva_lista)
                }
            }
        }

        do {
            println(menu_noSeleccion)
            var opcion = readLine()!!.toInt()
            when (opcion) {
                //Crear una lista
                1 -> { println("Ingrese el nombre de la lista: ")
                    val nombre = readLine()!!
                    val nueva_lista = Lista(nombre)
                    listas.add(nueva_lista)
                    println("Se ha creado la lista con éxito.")
                }

                // Ver las listas
                2 -> {
                    for (i in listas.indices) {
                        println("${i + 1} ${listas[i]}" )
                    }
                }

                //Seleccionar lista.
                3 -> {
                    println("Listas: ")
                    for (i in listas.indices) {
                        println("${i + 1} ${listas[i].nombre}")
                    }

                    println("Qué lista desea seleccionar? (1-${listas.count()})")

                    var lista_seleccion = readLine()!!.toInt() - 1

                    // Mostrar menu de selección
                    println(menu_conSeleccion)
                    var opcion_lista = readLine()!!.toInt()

                    when(opcion_lista){
                        // Deseleccionar lista
                        1 -> {}

                        //Agregar una tarea
                        2 -> {
                            val titulo = readLine()!!
                            val nueva_tarea = Tarea(titulo)
                            listas[lista_seleccion].agregarTarea(nueva_tarea)

                            println("La tarea se ha agregado a la lista con éxito.")
                        }

                        //Completar una tarea
                        3 -> {for (i in listas[lista_seleccion].tareas.indices) {
                            println("""
                                ${i + 1}
                            """.trimIndent())
                        }
                            println("Que ")
                        }

                        // Ver todas las tareas en una lista.
                        4 -> {}

                    }





                }
            }
        } while (!listas.isEmpty())



}