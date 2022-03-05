package ir.tafreshiali.monshi_plus_domain.bills.payment

data class BillsGetPaymentGatewayListDto(
    val QueueUniqueID: String,
    val InquiryTypeName: String?,
    val BillCount: Long
)