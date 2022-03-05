package ir.tafreshiali.monshi_plus_domain.bills.payment

data class BillsPaymentGetLinkDto(
    val Bills: List<String>,
    val GatewayID: Long,
    val MobilePhone: String? = null
)