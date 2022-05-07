package ir.tafreshiali.ayan_core_ui.history

import android.os.Parcelable
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class InquiryHistory(
    val AutoFill: Boolean,
    val DateTime: GeneralDateTime?,
    var Favorite: Boolean,
    var NotificationFeature: Boolean,
    var NotificationPermission: Boolean,
    val Note: String,
    val QueryValue: String,
    val Description: String?,
    val Query: List<KeyValue>,
    val Type: NameShowName,
    val UniqueID: String
) : Parcelable


fun InquiryHistoryResponse.toInquiryHistory() = InquiryHistory(
    AutoFill = AutoFill,
    DateTime = DateTime.toGeneralDateTime(),
    Favorite = Favorite,
    NotificationFeature = NotificationFeature,
    NotificationPermission = NotificationPermission,
    Note = Note,
    QueryValue = QueryValue,
    Description = Description,
    Query = Query.toKeyValueList(),
    Type = Type.toNameShowName(),
    UniqueID = UniqueID
)

