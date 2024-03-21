package org.example.Class

import org.example.Interfaces.IPromotion
import org.example.Interfaces.Cancellable

class NationalLowSeason(city: String) : National(city), IPromotion, Cancellable {
    override val discount = 10 // es porcentaje, o sea 10%
    override val typeDiscount = 0 // 0 para porcentaje, 1 para cantidad

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

    override fun cancelReservation() {
        if (reserved) {
            reserved = false
            paidAmount = 0
            println("Reserva cancelada para $city")
        } else {
            println("No hay ninguna reserva para cancelar.")
        }
    }
}
