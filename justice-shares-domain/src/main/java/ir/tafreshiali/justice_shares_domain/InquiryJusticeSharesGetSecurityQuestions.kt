package ir.tafreshiali.justice_shares_domain

data class InquiryJusticeSharesGetSecurityQuestionsDto(
    val NationalID: String
)

data class InquiryJusticeSharesGetSecurityQuestionsResponse(
    val Questions: List<QuestionResponse>
)

data class QuestionResponse(
    val Body: String,
    val Choices: List<String>,
    val Title: String
)