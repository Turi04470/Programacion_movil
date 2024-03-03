class Person(
        val nombre: String,
        val apellidos: String,
        val sexo: String,
        val altura: Double
) {
    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Apellidos: $apellidos")
        println("Sexo: $sexo")
        println("Altura: $altura")
    }
}

fun main() {
    val persona = Person("Juan", "Pérez", "Masculino", 1.75)
    persona.mostrarDatos()
}
