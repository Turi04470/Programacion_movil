import org.example.Class.*

fun main() {
    // Ejemplo de viaje nacional en temporada alta
    val nationalTrip = National("Guadalajara")
    nationalTrip.quotePrice(4) // Cotizar el precio del viaje
    nationalTrip.reserve(4) // Reservar el viaje

    println("----------------------------------")

    // Ejemplo de viaje nacional en temporada baja con promoción
    val nationalLowSeasonTrip = NationalLowSeason("CDMX")
    nationalLowSeasonTrip.quotePrice(5) // Cotizar el precio del viaje
    nationalLowSeasonTrip.reserve(5) // Reservar el viaje
    nationalLowSeasonTrip.cancelReservation() // Cancelar la reserva

    println("----------------------------------")

    // Ejemplo de viaje internacional a Alemania
    val internationalTripToGermany = International("Alemania", "Munich")
    internationalTripToGermany.quotePrice(7) // Cotizar el precio del viaje
    internationalTripToGermany.reserve(7) // Reservar el viaje

    println("----------------------------------")

    // Ejemplo de viaje internacional a Canadá
    val internationalTripToCanada = International("Canadá", "Vancouver")
    internationalTripToCanada.quotePrice(3) // Cotizar el precio del viaje
    internationalTripToCanada.reserve(3) // Reservar el viaje
    internationalTripToCanada.cancelReservation() // Cancelar la reserva
}
