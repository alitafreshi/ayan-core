package ir.tafreshiali.monshi_plus_domain.car.revokedPlate

import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse


data class InquiryRevokedPlateNumbersResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: RevokedPlateNumberResponse
)

data class RevokedPlateNumberResponse(
    val Description: String,
    val LastUpdate: DateTimeResponse,
    val PlateNumbers: List<PlateNumberResponse>,
    val Total: Long
)

data class PlateNumberResponse(
    val City: String,
    val DateTime: DateTimeResponse,
    val Location: String,
    val PlateNumber: String
)
