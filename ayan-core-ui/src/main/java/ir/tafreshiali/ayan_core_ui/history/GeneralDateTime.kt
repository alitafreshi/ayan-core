package ir.tafreshiali.ayan_core_ui.history

import android.os.Parcelable
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse
import kotlinx.parcelize.Parcelize


@Parcelize
data class GeneralDateTime(
    val Gregorian: AyanCoreDateTime?,
    val Lunar: AyanCoreDateTime?,
    val Persian: AyanCoreDateTime?,
    val Time: String?
) : Parcelable


fun GeneralDateTimeResponse?.toGeneralDateTime() = this?.let {
    GeneralDateTime(
        Gregorian = Gregorian.toAyanCoreDateTime(),
        Lunar = Lunar.toAyanCoreDateTime(),
        Persian = Persian.toAyanCoreDateTime(),
        Time = Time,
    )
}


