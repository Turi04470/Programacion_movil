package org.example.Class

abstract class Travel {
    abstract val country: String
    abstract val city: String

    protected abstract fun getPrice(numDays: Int): Int

    abstract fun quotePrice(numDays: Int)

    fun reserve(numDays: Int) {
        if (reserved) {
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if (amount == 0) {
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }


    protected var reserved = false
    protected var paidAmount = 0

    interface Cancellable {
        fun cancelReservation()
    }
}
