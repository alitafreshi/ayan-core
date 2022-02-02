package ir.tafreshiali.ayan_core.advertisement

data class AppConfigAdvertisementResponse(
    val Active: Boolean,
    val Sources: List<Source>
)

data class Source(
    val Key: String,
    val Value: String
)