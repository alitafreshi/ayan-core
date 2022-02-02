package ir.tafreshiali.ayan_core

data class LoginDto(
    val AdditionalData: String? = null,
    val ApplicationName: String,
    val Channel: String? = null,
    val MobileNumber: String? = null,
    val ReferenceToken: String? = null,
    val Version: String
)

data class LoginOutput(
    val Token: String
)