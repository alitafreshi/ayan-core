package ir.tafreshiali.ayan_core.inquiry_history

data class InquiryBookmarkItemDto(
    val Favorite: Boolean,
    val NotificationPermission: Boolean,
    val InquiryTypeName: String,
    val Note: String,
    val UniqueID: String,
    val Action: String? = null
) {
    companion object {
        const val NotificationPermissionAction = "NotificationPermission"
    }
}