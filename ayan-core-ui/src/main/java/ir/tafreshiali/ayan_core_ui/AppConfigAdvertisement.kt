package ir.tafreshiali.ayan_core_ui

import android.os.Parcelable
import ir.tafreshiali.ayan_core.advertisement.AppConfigAdvertisementResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class AppConfigAdvertisement(
    val Active: Boolean,
    val Sources: List<Source>
) : Parcelable


fun AppConfigAdvertisementResponse.toAppConfigAdvertisement() = AppConfigAdvertisement(
    Active = Active,
    Sources = Sources.toSourceList()
)


@Parcelize
data class Source(
    val Key: String,
    val Value: String
) : Parcelable

//TODO MUST FIX THIS RENAME THE SOURCE IN CORE LIB TO SOURCE RESPONSE
fun ir.tafreshiali.ayan_core.advertisement.Source.toSource() = Source(
    Key = Key,
    Value = Value
)

fun List<ir.tafreshiali.ayan_core.advertisement.Source>.toSourceList() = buildList {
    this@toSourceList.forEach { item ->
        add(item.toSource())
    }
}



