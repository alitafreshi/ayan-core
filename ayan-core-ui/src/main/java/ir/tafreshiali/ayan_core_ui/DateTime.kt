package ir.tafreshiali.ayan_core_ui

import android.os.Parcelable
import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class DateTime(
    val Persian: PersianDateTime,
    val Time: String,
    val TimeZone: String
) : Parcelable


fun DateTimeResponse.toDateTime() = DateTime(
    Persian = Persian.toPersianDateTime(),
    Time = Time,
    TimeZone = TimeZone
)
