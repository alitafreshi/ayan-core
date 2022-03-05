package ir.tafreshiali.monshi_plus_domain.bills

import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse

data class InquiryBillResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: BillResultResponse
)

data class BillResultResponse(
    val Bills: List<BillResponse>
)

data class BillPaymentExtraInfoResponse(
    val Key: String,
    val Value: String
)

data class BillResponse(
    val Detail: BillDetailResponse,
    val ExtraInfo: String?,
    val Header: BillHeaderResponse,
    val PaymentExtraInfo: BillPaymentExtraInfoResponse,
    val PaymentStatus: NameShowNameResponse
)

data class BillHeaderResponse(
    val Amount: Long,
    val Fee: Long,
    val RecordNumber: String,
    val TotalAmount: Long,
    val Type: NameShowNameResponse,
    val UniqueID: String
)


data class BillDetailResponse(
    val Address: String,
    val CurrentDateTime: DateTimeResponse?,
    val FullName: String,
    val PaymentDateTime: DateTimeResponse,
    val PreviousDateTime: DateTimeResponse?
)