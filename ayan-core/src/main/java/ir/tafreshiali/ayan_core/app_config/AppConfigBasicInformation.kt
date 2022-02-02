package ir.tafreshiali.ayan_core.app_config

import ir.tafreshiali.ayan_core.payment.TypeResponse

data class AppConfigBasicInformationResponse(
    val AboutUs: List<AboutUResponse>,
    val ContactUs: List<ContactUResponse>,
    val FrequentlyAskedQuestionsCategories: List<FrequentlyAskedQuestionsCategoryResponse>,
    val Support: List<SupportResponse>,
    val TermsAndConditions: List<TermsAndConditionResponse>
)

data class AboutUResponse(
    val Key: String,
    val Value: String
)

data class ContactUResponse(
    val Key: String,
    val Value: String
)

data class FrequentlyAskedQuestionsCategoryResponse(
    val Services: List<Service>,
    val Type: TypeXResponse
)

data class SupportResponse(
    val Key: String,
    val Value: String
)

data class TermsAndConditionResponse(
    val Key: String,
    val Value: String
)

data class Service(
    val QuestionList: List<QuestionResponse>,
    val Type: TypeResponse
)

data class TypeXResponse(
    val Name: String,
    val ShowName: String
)

data class QuestionResponse(
    val Key: String,
    val Value: String
)