package ir.tafreshiali.monshi_plus_domain.app_config

import ir.tafreshiali.ayan_core.key_value.AdvanceKeyValue
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse

data class AppConfigResponse(
    val AboutUs: List<AdvanceKeyValue>,
    val ContactUs: List<ContactUResponse>,
    val ForbiddenServices: List<NameShowNameResponse>,
    val FrequentlyAskedQuestions: FrequentlyAskedQuestionsResponse,
    val Others: List<AdvanceKeyValue>,
    val PopUpMessage: PopUpMessageResponse,
    val ServerTime: GeneralDateTimeResponse,
    val ServerTimeEpoch: Long,
    val SpecialEvent: SpecialEventResponse,
    val Support: String,
    val TermsAndConditions: List<AdvanceKeyValue>,
    val TotalNumberOfUnreadMessages: Long,
    val VehiclePlateLetterMappingsVersion01: List<AdvanceKeyValue>,
    val VehiclePlateLetterMappingsVersion02: List<AdvanceKeyValue>,
    val VehiclePlateLetterMappingsVersion03: List<AdvanceKeyValue>,
    val VehiclePlateLetterMappingsVersion04: List<AdvanceKeyValue>
)

data class ContactUResponse(
    val Key: String,
    val Value: String
)

data class FrequentlyAskedQuestionsResponse(
    val Categories: List<FrequentlyAskedQuestionsCategoryResponse>
)

data class PopUpMessageResponse(
    val DateTime: GeneralDateTimeResponse,
    val ID: Long,
    val TextPreview: String,
    val ThumbnailBase64Format: String,
    val Title: String,
    val Unread: Boolean
)

data class SpecialEventResponse(
    val Animation: String,
    val BackgroundTexture: String,
    val Description: String,
    val EventBar: EventBarResponse,
    val LogoMain: String,
    val LogoSetting: String,
    val Postcards: List<String>,
    val Title: String
)

data class FrequentlyAskedQuestionsCategoryResponse(
    val Name: String,
    val Services: List<ServiceResponse>,
    val ShowName: String
)

data class ServiceResponse(
    val QuestionList: List<AdvanceKeyValue>,
    val Service: AdvanceKeyValue
)

data class EventBarResponse(
    val GradientColorEnd: String,
    val GradientColorStart: String,
    val Items: List<EventBarItemResponse>,
    val Weight: Long
)

data class EventBarItemResponse(
    val Animation: String,
    val Event: String,
    val Link: String,
    val Text: String
)
