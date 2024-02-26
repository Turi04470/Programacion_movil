fun main() {
    val base = 5.0f
    val altura = 3.0f
    val profundidad = 10.0f

    println("Datos iniciales:")
    println("Base del rectángulo: $base")
    println("Altura del rectángulo: $altura")
    println("Profundidad del prisma: $profundidad")

    val areaRectangulo = calcularAreaRectangulo(base, altura)
    val volumenPrisma = calcularVolumenPrisma(areaRectangulo, profundidad)

    println("El área del rectángulo es: $areaRectangulo")
    println("El volumen del prisma rectangular es: $volumenPrisma")
}

fun calcularAreaRectangulo(base: Float, altura: Float): Float {
    return base * altura
}

fun calcularVolumenPrisma(areaBase: Float, profundidad: Float): Float {
    return areaBase * profundidad
}
