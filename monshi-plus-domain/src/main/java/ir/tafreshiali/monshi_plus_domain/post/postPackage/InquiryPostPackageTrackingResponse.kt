package ir.tafreshiali.monshi_plus_domain.post.postPackage

import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse

data class InquiryPostPackageTrackingResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: PostPackageInquiryResultResponse
)

data class PostPackageInquiryResultResponse(
    val AcceptanceDateTime: GeneralDateTimeResponse,
    val Destination: String,
    val Events: List<PostPackageInquiryEventResponse>?,
    val ExtraInfo: String,
    val InsuranceCost: String,
    val PackageNumber: String,
    val PostCost: String,
    val ReceiverName: String,
    val ReceiverZip: String,
    val SenderName: String,
    val SenderZip: String,
    val ServiceType: String,
    val Source: String,
    val SourcePostOffice: String,
    val Weight: String
)

data class PostPackageInquiryEventResponse(
    val DateTime: GeneralDateTimeResponse,
    val EventNumber: String,
    val ExtraInfo: String?,
    val Province: String
)