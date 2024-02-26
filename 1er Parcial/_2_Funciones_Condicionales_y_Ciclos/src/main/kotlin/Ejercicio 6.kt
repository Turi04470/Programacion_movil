fun identificarTipoDato(dato: Any) {
    val tipo: String = when (dato) {
        is String -> "String"
        is Int -> "Int"
        is Double -> "Double"
        else -> "Otro"
    }

    println("El dato $dato es de tipo $tipo")
}

fun main() {
    // Pruebas con diferentes tipos de datos
    identificarTipoDato("Hola")    // String
    identificarTipoDato(10)        // Int
    identificarTipoDato(3.14)      // Double
    identificarTipoDato(true)      // Otro
}
