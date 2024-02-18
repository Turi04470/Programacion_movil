/*
La ecuación de la pendiente se obtiene por la siguiente expresión:
m = y2-y1/x2-x1
* */



//5. Expresarla ahora con operadores.
//6.Resolver el valor de la pendiente, tomando en cuenta que P1(4,3), P2(-3,-2)

fun main() {
    // Puntos
    val x1 = 4.0
    val y1 = 3.0
    val x2 = -3.0
    val y2 = -2.0



    var pendiente = y2 - y1 /x2 - x1


    println("La pendiente es: $pendiente")




    //7. Del ejercicio anterior, responder: ¿Por qué el resultado obtenido difiere del resultado esperado?
    //Mala gerarquia de operaciones por la falta de parentesis


    //8. Encontrar una solución para que se refleje el resultado.
    pendiente = (y2 - y1) / (x2 - x1)

    // Imprimiendo la pendiente
    println("La pendiente correcta es: $pendiente")
}
