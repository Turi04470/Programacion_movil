class Vehiculo(
    var color: String,
    var marca: String,
    var modelo: String,
    var placas: String,
    var encendido: Boolean = false,
    var gasolina: Double = 2.0
) {
    fun encender() {
        if (!encendido) {
            encendido = true
            println("El vehículo ha sido encendido.")
        } else {
            println("El vehículo ya está encendido.")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println("El vehículo ha sido apagado.")
        } else {
            println("El vehículo ya está apagado.")
        }
    }

    fun recargar(litros: Double) {
        gasolina += litros
        println("Se han recargado $litros litros de gasolina.")
    }

    fun checarEstado() {
        println("Estado del vehículo:")
        println("Color: $color")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Placas: $placas")
        println("Encendido: ${if (encendido) "Sí" else "No"}")
        println("Gasolina: $gasolina litros")
    }
}
