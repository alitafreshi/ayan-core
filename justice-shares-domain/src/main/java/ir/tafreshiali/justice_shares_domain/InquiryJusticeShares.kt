package ir.tafreshiali.justice_shares_domain

import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse


data class InquiryJusticeSharesDto(
    val Answers: List<String>,
    val NationalID: String
)

data class InquiryJusticeSharesResponse(
    val Advertisement: AdvertisementResponse,
    val Inquiry: InquiryHistoryResponse,
    val Result: JusticeSharesResponse?
)

data class JusticeSharesResponse(
    val CurrentPlan: JusticeSharesPlanResponse?,
    val Deposit: List<DepositResponse>,
    val Member: List<MemberResponse>,
    val PdfFormatUrl: String,
    val Profit: List<ProfitResponse>,
    val Sheba: ShebaResponse
)

data class JusticeSharesPlanResponse(
    val PdfFormatDownloadUrl: String?,
    val PlanDescription: String?,
    val PlanMethod: String?,
    val PlanRegisterDate: DateTimeResponse?
) {
    companion object {
        const val DIRECT = "DIRECT"
        const val INDIRECT = "INDIRECT"
    }
}

data class DepositResponse(
    val Amount: Long,
    val BankNumber: Long,
    val DateTime: DateTimeResponse,
    val Description: String,
    val IsFail: Boolean,
    val Sheba: String,
    val Stage: String
)

data class MemberResponse(
    val FatherName: String,
    val FullName: String,
    val IsDead: Boolean,
    val MemberValue: Long,
    val NationalID: String
)

data class ProfitResponse(
    val Amount: Long,
    val DateTime: DateTimeResponse,
    val Description: String,
    val FinancialYear: Long
)

data class ShebaResponse(
    val BankName: String,
    val MobileNumber: String,
    val NationalID: String,
    val RecordDateTime: DateTimeResponse,
    val Sheba: String,
    val ShebaConfirmationStatus: String
)

data class AdvertisementResponse(
    val Dialog: DialogResponse?,
    val ShowDialog: Boolean,
    val TimeOut: Long,
    val UniqueID: String
)

data class DialogResponse(
    val BannerRedirectUrl: String?,
    val BannerUrl: String?,
    val DataSources: String?,
    val ButtonTextShowDetails: String?,
    val ButtonTextSubscriptionPurchase: String,
    val Message: String,
    val Summary: SummaryResponse?
)

data class SummaryResponse(
    val ExtraInfo: List<KeyValueResponse>,
    val PayableAmount: Long,
    val PayableBills: List<String>?
)

data class KeyValueResponse(
    val Key: String,
    var Value: String?
)