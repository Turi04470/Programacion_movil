import Vehiculo

fun main() {
    val miCoche = Vehiculo("Rojo", "Toyota", "Corolla", "ABC123")

    println("Checando estado inicial del coche:")
    miCoche.checarEstado()

    println("\nEncendiendo el coche...")
    miCoche.encender()

    println("\nChecando estado después de encender el coche:")
    miCoche.checarEstado()

    println("\nRecargando gasolina...")
    miCoche.recargar(20.0)

    println("\nChecando estado después de recargar gasolina:")
    miCoche.checarEstado()
}
