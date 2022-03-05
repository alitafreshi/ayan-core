package ir.tafreshiali.monshi_plus_domain.car.accidents

import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse

data class InquiryDrivingAccidentsResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: AccidentsResponse
)

data class AccidentsResponse(
    val Accidents: List<AccidentResponse>
)

data class AccidentResponse(
    val Cause: String,
    val DateTime: DateTimeResponse,
    val Guilty: String,
    val PlateNumber: String,
    val State: String,
    val Type: String,
    val VIN: String,
    val VehicleColor: String
)