package ir.tafreshiali.ayan_core.inquiry_history

import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse
import ir.tafreshiali.ayan_core.payment.KeyValueResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse


data class InquiryGetRecentListResponse(
    val Recent: List<InquiryHistoryResponse>
)

data class InquiryHistoryResponse(
    val AutoFill: Boolean,
    val DateTime: GeneralDateTimeResponse,
    var Favorite: Boolean,
    var NotificationFeature: Boolean,
    var NotificationPermission: Boolean,
    val Note: String,
    val QueryValue: String,
    val Description: String?,
    val Query: List<KeyValueResponse>,
    val Type: NameShowNameResponse,
    val UniqueID: String
)