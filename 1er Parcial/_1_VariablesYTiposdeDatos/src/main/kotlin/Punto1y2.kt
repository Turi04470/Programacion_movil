fun main(args: Array<String>) {

    //1.     Para un número decimal, qué tipo de dato se asigna por defecto? Imprimirlo.
    val number=12.23;
    println("Tipo de dato por defecto: ${number::class.simpleName}")


    //2.     Volver flotante a la variable decimal.
    val numberFloat=number.toFloat()
    println("variable convertida ${numberFloat::class.simpleName}")



}