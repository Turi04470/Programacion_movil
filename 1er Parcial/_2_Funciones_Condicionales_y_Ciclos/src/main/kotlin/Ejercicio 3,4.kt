fun main() {
    // Ejemplo 1: Llamada a la función con una sola calificación
    println("Promedio con una calificación: ${calcularPromedio(calificacion3 = 7f)}")

    // Ejemplo 2: Llamada a la función con dos calificaciones
    println("Promedio con dos calificaciones: ${calcularPromedio(6f, calificacion3 = 10f)}")

    // Ejemplo 3: Llamada a la función con tres calificaciones
    println("Promedio con tres calificaciones: ${calcularPromedio(7f, 8f, 10f)}")
}

fun calcularPromedio(calificacion1: Float = 8f, calificacion2: Float = 8f, calificacion3: Float): Float {
    val promedio = (calificacion1 + calificacion2 + calificacion3) / 3
    return promedio
}
