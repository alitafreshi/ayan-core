package ir.tafreshiali.ayan_core_ui.history

import android.os.Parcelable
import ir.tafreshiali.ayan_core.payment.AyanCoreDateTimeResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class AyanCoreDateTime(
    val Day: Int?,
    val DayString: String?,
    val DateFormatted: String?,
    val Month: Int?,
    val MonthString: String?,
    val Year: Int?
) : Parcelable

fun AyanCoreDateTimeResponse?.toAyanCoreDateTime()= this?.let {
    AyanCoreDateTime(
        Day = Day,
        DayString = DayString,
        DateFormatted = DateFormatted,
        Month = Month,
        MonthString = MonthString,
        Year = Year
    )
}



