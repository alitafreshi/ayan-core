package ir.tafreshiali.ayan_core.version

data class GetLastVersionDto(
    val ApplicationName: String,
    val ApplicationType: String,
    val CategoryName: String,
    val CurrentApplicationVersion: String,
    val ExtraInfo: Any
)

data class GetLastVersionResponse(
    val AcceptButtonText: String,
    val Body: String,
    val ChangeLogs: List<String>?,
    val Link: String,
    val LinkType: String,
    val RejectButtonText: String,
    val TextToShare: String,
    val Title: String
)