package ir.tafreshiali.ayan_core.payment

data class PaymentHistoryGetTransactionInfoDto(
    val UniqueID: String
)

data class PaymentHistoryGetTransactionInfoResponse(
    val Amount: Long,
    val Buttons: List<MessageButtonResponse>?,
    val DateTime: GeneralDateTimeResponse,
    val Description: String?,
    val ExtraInfo: List<KeyValueResponse>?,
    val Details: ArrayList<ArrayList<KeyValueResponse>>?,
    val ReceiptUrl: String?,
    val TraceNumberReviewLink: String?,
    val Status: NameShowNameResponse,
    val TextToShare: String,
    val Icon: NameShowNameResponse?,
    val Title: String,
    val Type: TypeResponse,
    val UniqueID: String
)

data class MessageButtonResponse(
    val Event: String?,
    val GradientColorEnd: String,
    val GradientColorStart: String,
    val Icon: String?,
    val Link: String,
    val Title: String
)

data class KeyValueResponse(
    val Key: String,
    var Value: String?,
    var canCopy: Boolean = false,
    var isLastItem: Boolean = false,
    var textColor: Int = 0
)