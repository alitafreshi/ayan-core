package ir.tafreshiali.monshi_plus_domain.car.carTollBills

import ir.tafreshiali.monshi_plus_domain.bills.BillHeaderResponse
import ir.tafreshiali.monshi_plus_domain.payment.PaymentExtraInfoResponse
import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse


data class InquiryMunicipalityCarTollBillsResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: MunicipalityResponse
)

data class MunicipalityResponse(
    val AdditionalData: List<String>,
    val Bills: List<BillMunicipalityResponse>?
)

data class BillMunicipalityResponse(
    val Detail: DetailMunicipalityResponse,
    val ExtraInfo: String?,
    val Header: BillHeaderResponse,
    val PaymentExtraInfo: PaymentExtraInfoResponse,
    val PaymentStatus: NameShowNameResponse
)

data class DetailMunicipalityResponse(
    val DateTimeIssue: DateTimeResponse
)
