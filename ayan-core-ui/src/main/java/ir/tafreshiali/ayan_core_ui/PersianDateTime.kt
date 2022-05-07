package ir.tafreshiali.ayan_core_ui

import android.os.Parcelable
import ir.tafreshiali.ayan_core.date_time.PersianDateTimeResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersianDateTime(
    val DateFormatted: String,
    val Day: Int,
    val DayString: String,
    val Month: Int,
    val MonthString: String,
    val Year: Int
) : Parcelable

fun PersianDateTimeResponse.toPersianDateTime() = PersianDateTime(
    DateFormatted = DateFormatted,
    Day = Day,
    DayString = DayString,
    Month = Month,
    MonthString = MonthString,
    Year = Year,
)
