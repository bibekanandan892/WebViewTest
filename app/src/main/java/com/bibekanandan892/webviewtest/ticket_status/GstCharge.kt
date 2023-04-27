package com.bibekanandan892.webviewtest.ticket_status


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GstCharge(
    @SerialName("cgstRate")
    val cgstRate: Double? = 0.0,
    @SerialName("gstRate")
    val gstRate: Double? = 0.0,
    @SerialName("gstinSuplier")
    val gstinSuplier: String? = "",
    @SerialName("igstRate")
    val igstRate: Double? = 0.0,
    @SerialName("invoiceNumber")
    val invoiceNumber: String? = "",
    @SerialName("irctcCgstCharge")
    val irctcCgstCharge: Double? = 0.0,
    @SerialName("irctcIgstCharge")
    val irctcIgstCharge: Double? = 0.0,
    @SerialName("irctcSgstCharge")
    val irctcSgstCharge: Double? = 0.0,
    @SerialName("irctcUgstCharge")
    val irctcUgstCharge: Double? = 0.0,
    @SerialName("prsCgstCharge")
    val prsCgstCharge: Double? = 0.0,
    @SerialName("prsIgstCharge")
    val prsIgstCharge: Double? = 0.0,
    @SerialName("prsSgstCharge")
    val prsSgstCharge: Double? = 0.0,
    @SerialName("prsSuplierState")
    val prsSuplierState: String? = "",
    @SerialName("prsSuplierStateCode")
    val prsSuplierStateCode: String? = "",
    @SerialName("prsUgstCharge")
    val prsUgstCharge: Double? = 0.0,
    @SerialName("sacCode")
    val sacCode: Int? = 0,
    @SerialName("sgstRate")
    val sgstRate: Double? = 0.0,
    @SerialName("suplierAddress")
    val suplierAddress: String? = "",
    @SerialName("taxableAmt")
    val taxableAmt: Int? = 0,
    @SerialName("totalIrctcGst")
    val totalIrctcGst: Double? = 0.0,
    @SerialName("totalPRSGst")
    val totalPRSGst: Double? = 0.0,
    @SerialName("ugstRate")
    val ugstRate: Double? = 0.0
)