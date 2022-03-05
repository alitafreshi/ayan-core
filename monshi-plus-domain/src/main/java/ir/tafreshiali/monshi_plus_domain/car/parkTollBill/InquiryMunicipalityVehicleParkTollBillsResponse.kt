package ir.tafreshiali.monshi_plus_domain.car.parkTollBill

import ir.tafreshiali.monshi_plus_domain.bills.BillHeaderResponse
import ir.tafreshiali.monshi_plus_domain.payment.PaymentExtraInfoResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse

data class InquiryMunicipalityVehicleParkTollBillsResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: ParkTollResponse
)

data class ParkTollResponse(
    val AdditionalData: List<String>,
    val Bills: List<BillParkTollResponse>
)

data class BillParkTollResponse(
    val Detail: DetailParkTollResponse,
    val ExtraInfo: String,
    val Header: BillHeaderResponse,
    val PaymentExtraInfo: PaymentExtraInfoResponse,
    val PaymentStatus: NameShowNameResponse
)

data class DetailParkTollResponse(
    val Date: GeneralDateTimeResponse,
    val Street: String,
    val TimeEnd: String,
    val TimeStart: String
)