package com.bibekanandan892.webviewtest.ticket_status


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PsgnDtl(
    @SerialName("bookingBerthNo")
    val bookingBerthNo: String? = "",
    @SerialName("bookingCoachId")
    val bookingCoachId: String? = "",
    @SerialName("bookingStatus")
    val bookingStatus: String? = "",
    @SerialName("bookingStatusIndex")
    val bookingStatusIndex: String? = "",
    @SerialName("childBerthFlag")
    val childBerthFlag: String? = "",
    @SerialName("currentBerthNo")
    val currentBerthNo: String? = "",
    @SerialName("currentCoachId")
    val currentCoachId: String? = "",
    @SerialName("currentStatus")
    val currentStatus: String? = "",
    @SerialName("currentStatusIndex")
    val currentStatusIndex: String? = "",
    @SerialName("dropWaitlistFlag")
    val dropWaitlistFlag: String? = "",
    @SerialName("fareChargedPercentage")
    val fareChargedPercentage: String? = "",
    @SerialName("insuranceIssued")
    val insuranceIssued: String? = "",
    @SerialName("passengerAge")
    val passengerAge: String? = "",
    @SerialName("passengerBedrollChoice")
    val passengerBedrollChoice: String? = "",
    @SerialName("passengerConcession")
    val passengerConcession: String? = "",
    @SerialName("passengerGender")
    val passengerGender: String? = "",
    @SerialName("passengerIcardFlag")
    val passengerIcardFlag: String? = "",
    @SerialName("passengerName")
    val passengerName: String? = "",
    @SerialName("passengerNationality")
    val passengerNationality: String? = "",
    @SerialName("passengerNetFare")
    val passengerNetFare: String? = "",
    @SerialName("passengerSerialNumber")
    val passengerSerialNumber: String? = "",
    @SerialName("psgnwlType")
    val psgnwlType: String? = "",
    @SerialName("validationFlag")
    val validationFlag: String? = ""
)