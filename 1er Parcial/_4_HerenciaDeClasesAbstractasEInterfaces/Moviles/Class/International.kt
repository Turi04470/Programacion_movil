package org.example.Class

import org.example.Interfaces.IPromotion

class International(override val country: String, override val city: String) : Travel(), Travel.Cancellable {

    override fun getPrice(numDays: Int): Int {
        val basePrice = getBasePrice(city)
        val total = basePrice * numDays
        val taxPercentage = getTaxPercentage(country)
        val taxAmount = total * taxPercentage / 100
        return total + taxAmount
    }

    private fun getBasePrice(city: String): Int {
        return when (city) {
            "Munich" -> 980
            "Berlín" -> 820
            "Francfort" -> 850
            "Santiago" -> 643
            "Valparaíso" -> 721
            "Vancouver" -> 620
            "Ottawa" -> 680
            "Montreal" -> 600
            else -> 0 // Ciudad no válida
        }
    }

    private fun getTaxPercentage(country: String): Int {
        return when (country) {
            "Alemania" -> 16
            "Chile" -> 5
            "Canadá" -> 10
            else -> 0 // País no válido
        }
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price == 0) {
            println("Lo sentimos, no hacemos viajes a esta ciudad.")
        } else {
            println("Tu viaje a $city, $country cuesta \$$price")
        }
    }

    override fun cancelReservation() {
        if (reserved) {
            reserved = false
            paidAmount = 0
            println("Reserva cancelada para $city, $country")
        } else {
            println("No hay ninguna reserva para cancelar.")
        }
    }
}
