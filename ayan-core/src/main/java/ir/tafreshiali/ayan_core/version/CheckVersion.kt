package ir.tafreshiali.ayan_core.version


data class CheckVersionDto(
    val ApplicationName: String,
    val ApplicationType: String,
    val CategoryName: String,
    val CurrentApplicationVersion: String,
    val ExtraInfo: Any
)

data class CheckVersionResponse(
    val UpdateStatus: String
)