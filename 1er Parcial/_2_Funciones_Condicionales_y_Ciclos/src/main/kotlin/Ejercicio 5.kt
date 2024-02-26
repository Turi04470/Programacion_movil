fun determinarTipoTriangulo(a: Double, b: Double, c: Double) {
    println("""los valores ingresados son:
        |lado a: ${a}, lado b: ${b}, lado c: ${c}""".trimMargin())

    if (a == b && b == c) {
        println("El triángulo es equilátero.")
    } else if (a == b || a == c || b == c) {
        println("El triángulo es isósceles.")
    } else {
        println("El triángulo es escaleno.")
    }
    println()
}

fun main() {
    // Pruebas
    determinarTipoTriangulo(5.0, 5.0, 5.0) // Equilátero
    determinarTipoTriangulo(4.0, 4.0, 6.0) // Isósceles
    determinarTipoTriangulo(3.0, 4.0, 5.0) // Escaleno
}
