package com.bibekanandan892.webviewtest.ticket_status


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MealTransaction(
    @SerialName("bookingMode")
    val bookingMode: Int? = 0,
    @SerialName("bookingSource")
    val bookingSource: Int? = 0,
    @SerialName("mealBooked")
    val mealBooked: Boolean? = false,
    @SerialName("reservationId")
    val reservationId: Int? = 0,
    @SerialName("ticketId")
    val ticketId: Int? = 0,
    @SerialName("tktCanStatus")
    val tktCanStatus: Int? = 0
)