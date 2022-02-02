package ir.tafreshiali.justice_shares_domain

data class InquiryJusticeSharesValueRequestOtpDto(
    val NationalID: String
)

data class InquiryJusticeSharesValueRequestOtpResponse(
    val OtpRequired: Boolean
)