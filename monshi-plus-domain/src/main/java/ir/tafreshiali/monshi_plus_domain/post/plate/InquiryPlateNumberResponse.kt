package ir.tafreshiali.monshi_plus_domain.post.plate

import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse

data class InquiryPlateNumberResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: PlateNumberResultResponse
)

data class PlateNumberResultResponse(
    val DateTimeIssue: GeneralDateTimeResponse,
    val PackageNumber: String
)