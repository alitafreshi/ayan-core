package ir.tafreshiali.ayan_core_ui.history

import android.os.Parcelable
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse
import ir.tafreshiali.extension.helper.removePishkhanFromString
import kotlinx.parcelize.Parcelize

@Parcelize
data class NameShowName(
    val Name: String,
    val ShowName: String
) : Parcelable {
    companion object {
        const val ValidForPayment = "ValidForPayment"
    }

    val validForPayment: Boolean
        get() = this.Name == ValidForPayment

    val getUsableShowName: String
        get() = this.ShowName.removePishkhanFromString()
}

fun NameShowNameResponse.toNameShowName() = NameShowName(
    Name = Name, ShowName = ShowName
)

