package ir.tafreshiali.justice_shares_domain

import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse


data class InquiryJusticeSharesValueDto(
    val NationalID: String,
    val OtpCode: String?
)

data class InquiryJusticeSharesValueResponse(
    val Advertisement: AdvertisementResponse,
    val Inquiry: InquiryHistoryResponse,
    val Result: JusticeSharesValueResponse?
)

data class JusticeSharesValueResponse(
    val Assets: List<AssetResponse>,
    val Description: String?,
    val Payments: List<JusticeSharePaymentResponse>,
    val Profile: ProfileResponse,
    val TotalAmountOfAssets: Long,
    val TotalNumberOfAssets: Long
)

data class AssetResponse(
    val AssetCount: Long,
    val AssetName: String,
    val AssetTotalValue: Long,
    val AssetUnitValue: Long
)

data class JusticeSharePaymentResponse(
    val DepositAmount: Long,
    val DepositDate: String,
    val DepositStatus: String,
    val FirstName: String,
    val ID: Double,
    val Iban: String,
    val LastName: String,
    val NationalCode: String,
    val ProfitType: String,
    val Symbol: String,
    var Stage: Int
)

data class ProfileResponse(
    val BankName: String,
    val City: String,
    val FatherName: String,
    val FullName: String,
    val MobileNumber: String,
    val NationalID: String,
    val Province: String,
    val Sheba: String
)