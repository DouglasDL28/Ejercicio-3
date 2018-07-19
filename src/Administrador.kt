package modulo

class Administrador (
        val listas: ArrayList<Lista> = ArrayList()


        ) {
    fun verListas() {
        encendido = true
    }

    fun apagar() {
        encendido = false
    }

    fun cambiar_AM () {
        banda = "AM"
    }

    fun cambiar_FM () {
        banda = "FM"
    }

    fun subir_volumen (cambio_vol: Int) {volumen = volumen + cambio_vol}

    fun bajar_volumen (cambio_vol: Int) {volumen = volumen - cambio_vol}

    fun subirEstacion (cambio_estacion: Double){estacion = estacion + cambio_estacion}

    fun bajarEstacion (cambio_estacion: Double) {estacion = estacion - cambio_estacion}

    override fun toString(): String {
        return """
            Radio:
                Volumen: $volumen
                Estación: $estacion
                Encendido: $encendido
        """.trimIndent()
    }

}