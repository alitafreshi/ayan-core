package ir.tafreshiali.monshi_plus_domain.payment.gateway

data class PaymentGatewayResponse(
    val Default: Boolean,
    val ID: Long,
    val ShowName: String,
    val Icon: String,
    var selected: Boolean = false
)
