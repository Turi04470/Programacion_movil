/*
    3  Declarar una variable const val con el valor de PI,
    multiplicarla por 2 veces nuestra variable decimal para
    sacar el perímetro de un círculo.
*/

const val PI: Float = 3.14159f

fun main() {
    val radio: Double = 5.0
    val perimetro: Double = 2 * PI * radio


    /*
        4.     Para el ejemplo anterior, utilizar un String Template para imprimir
        el texto El perímetro del círculo es: [resultado] siendo resultado nuestra variable perímetro.
    */

    println("El perímetro del círculo es: $perimetro")
}
