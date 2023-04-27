package com.bibekanandan892.webviewtest.ticket_status


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TicketSuccessStatusDto(
    @SerialName("arrivalTime")
    val arrivalTime: String? = "",
    @SerialName("avlForVikalp")
    val avlForVikalp: Boolean? = false,
    @SerialName("boardingDate")
    val boardingDate: String? = "",
    @SerialName("boardingStn")
    val boardingStn: String? = "",
    @SerialName("boardingStnName")
    val boardingStnName: String? = "",
    @SerialName("bookedQuota")
    val bookedQuota: String? = "",
    @SerialName("bookingDate")
    val bookingDate: String? = "",
    @SerialName("canSpouseFlag")
    val canSpouseFlag: Boolean? = false,
    @SerialName("cateringCharge")
    val cateringCharge: Int? = 0,
    @SerialName("clientTransactionId")
    val clientTransactionId: String? = "",
    @SerialName("complaintFlag")
    val complaintFlag: Int? = 0,
    @SerialName("departureTime")
    val departureTime: String? = "",
    @SerialName("destArrvDate")
    val destArrvDate: String? = "",
    @SerialName("destStn")
    val destStn: String? = "",
    @SerialName("distance")
    val distance: Int? = 0,
    @SerialName("fromStn")
    val fromStn: String? = "",
    @SerialName("fromStnName")
    val fromStnName: String? = "",
    @SerialName("fuelAmount")
    val fuelAmount: Double? = 0.0,
    @SerialName("gstCharge")
    val gstCharge: GstCharge? = GstCharge(),
    @SerialName("gstFlag")
    val gstFlag: Boolean? = false,
    @SerialName("informationMessage")
    val informationMessage: List<String?>? = listOf(),
    @SerialName("insuranceCharge")
    val insuranceCharge: Double? = 0.0,
    @SerialName("insuredPsgnCount")
    val insuredPsgnCount: Int? = 0,
    @SerialName("journeyClass")
    val journeyClass: String? = "",
    @SerialName("journeyDate")
    val journeyDate: String? = "",
    @SerialName("journeyLap")
    val journeyLap: Int? = 0,
    @SerialName("journeyQuota")
    val journeyQuota: String? = "",
    @SerialName("lapNumber")
    val lapNumber: Int? = 0,
    @SerialName("mahakalFlag")
    val mahakalFlag: Boolean? = false,
    @SerialName("mealChoiceEnable")
    val mealChoiceEnable: Boolean? = false,
    @SerialName("mealTransaction")
    val mealTransaction: MealTransaction? = MealTransaction(),
    @SerialName("mlJourneyType")
    val mlJourneyType: Int? = 0,
    @SerialName("mlReservationStatus")
    val mlReservationStatus: Int? = 0,
    @SerialName("mlTimeDiff")
    val mlTimeDiff: Int? = 0,
    @SerialName("mlTransactionStatus")
    val mlTransactionStatus: Int? = 0,
    @SerialName("mlUserId")
    val mlUserId: Int? = 0,
    @SerialName("monthBkgTicket")
    val monthBkgTicket: Int? = 0,
    @SerialName("multiLapFlag")
    val multiLapFlag: Boolean? = false,
    @SerialName("numberOfAdults")
    val numberOfAdults: Int? = 0,
    @SerialName("numberOfChilds")
    val numberOfChilds: Int? = 0,
    @SerialName("numberOfpassenger")
    val numberOfpassenger: Int? = 0,
    @SerialName("otpAuthenticationFlag")
    val otpAuthenticationFlag: Int? = 0,
    @SerialName("pnrNumber")
    val pnrNumber: String? = "",
    @SerialName("psgnDtlList")
    val psgnDtlList: List<PsgnDtl?>? = listOf(),
    @SerialName("reasonIndex")
    val reasonIndex: Int? = 0,
    @SerialName("reasonType")
    val reasonType: String? = "",
    @SerialName("reservationCharge")
    val reservationCharge: Int? = 0,
    @SerialName("reservationId")
    val reservationId: String? = "",
    @SerialName("resvnUptoStn")
    val resvnUptoStn: String? = "",
    @SerialName("resvnUptoStnName")
    val resvnUptoStnName: String? = "",
    @SerialName("rrHbFlag")
    val rrHbFlag: String? = "",
    @SerialName("sai")
    val sai: Boolean? = false,
    @SerialName("scheduleArrivalFlag")
    val scheduleArrivalFlag: Boolean? = false,
    @SerialName("scheduleDepartureFlag")
    val scheduleDepartureFlag: Boolean? = false,
    @SerialName("sectorId")
    val sectorId: Boolean? = false,
    @SerialName("serverId")
    val serverId: String? = "",
    @SerialName("serviceChargeTotal")
    val serviceChargeTotal: Double? = 0.0,
    @SerialName("serviceTax")
    val serviceTax: Double? = 0.0,
    @SerialName("superfastCharge")
    val superfastCharge: Int? = 0,
    @SerialName("tatkalFare")
    val tatkalFare: Int? = 0,
    @SerialName("ticketStatus")
    val ticketStatus: String? = "",
    @SerialName("ticketType")
    val ticketType: String? = "",
    @SerialName("timeDiff")
    val timeDiff: Int? = 0,
    @SerialName("timeStamp")
    val timeStamp: String? = "",
    @SerialName("timeTableFlag")
    val timeTableFlag: Int? = 0,
    @SerialName("totalCollectibleAmount")
    val totalCollectibleAmount: Double? = 0.0,
    @SerialName("totalFare")
    val totalFare: Int? = 0,
    @SerialName("totalRefundAmount")
    val totalRefundAmount: Double? = 0.0,
    @SerialName("trainName")
    val trainName: String? = "",
    @SerialName("trainNumber")
    val trainNumber: String? = "",
    @SerialName("trainOwner")
    val trainOwner: Int? = 0,
    @SerialName("travelnsuranceRefundAmount")
    val travelnsuranceRefundAmount: Double? = 0.0,
    @SerialName("wpServiceCharge")
    val wpServiceCharge: Double? = 0.0,
    @SerialName("wpServiceTax")
    val wpServiceTax: Double? = 0.0
)