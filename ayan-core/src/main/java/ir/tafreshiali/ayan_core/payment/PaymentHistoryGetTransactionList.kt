package ir.tafreshiali.ayan_core.payment

import ir.tafreshiali.extension.helper.removePishkhanFromString


data class PaymentHistoryGetTransactionListDto(
    val TransactionCategoryTypeName: String,
    val TransactionTypeName: String
)

data class PaymentHistoryGetTransactionListOutput(
    val TotalAmountOfTransactions: Long,
    val TotalNumberOfTransactions: Long,
    val Transactions: List<Transaction>?
)

data class Transaction(
    val Amount: Long,
    val DateTime: GeneralDateTimeResponse,
    val SearchKeywords: String,
    val Status: NameShowNameResponse,
    val Icon: NameShowNameResponse?,
    val Title: String,
    val Type: TypeResponse,
    val UniqueID: String
)

data class TypeResponse(
    val Category: NameShowNameResponse,
    val Name: String,
    val ShowName: String
)

data class NameShowNameResponse(
    val Name: String,
    val ShowName: String
) {
    companion object {
        const val ValidForPayment = "ValidForPayment"
    }

    val validForPayment: Boolean
        get() = this.Name == ValidForPayment

    val getUsableShowName: String
    get() = this.ShowName.removePishkhanFromString()
}

data class GeneralDateTimeResponse(
    val Gregorian: AyanCoreDateTimeResponse,
    val Lunar: AyanCoreDateTimeResponse,
    val Persian: AyanCoreDateTimeResponse,
    val Time: String
) {
    override fun toString() = "$Persian $Time"

    fun toFullDate() = "${Persian.DayString} ${Persian.Day} ${Persian.MonthString} ${Persian.Year}"
}

data class AyanCoreDateTimeResponse(
    val Day: Int,
    val DayString: String,
    val DateFormatted: String,
    val Month: Int,
    val MonthString: String,
    val Year: Int
) {
    override fun toString() = DateFormatted
}