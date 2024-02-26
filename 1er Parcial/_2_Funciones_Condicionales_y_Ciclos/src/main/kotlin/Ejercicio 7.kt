    fun contarNames(lista: List<String>) {


        val split= mutableListOf<String>()


        // Recorrer la lista y separar los nombres compuestos
        lista.forEach {
            val nombres = it.split(" ")

            //en un lista nueva agregamos los nombres separados
            nombres.forEach {
                split.add(it)
            }

        }


        //Agrupamos los nombres iguales y les asignamos una cantidad
        var conteo = split.groupingBy { it }.eachCount()

        //Recorremos la lista conteo

        conteo.forEach { (name, cant) ->
            println("""${cant}  ${name}""")
        }

    }


    fun main() {
        val nombres = listOf(
            "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés",
            "Romeo", "Ernesto", "Juan Pedro", "Ariadna", "Mireya María",
            "Ana Sofía", "José Juan"
        )

        print(" Contando los nombres")
        contarNames(nombres)

    }
