package ir.tafreshiali.monshi_plus_domain.payment.gateway


data class SalesGetPaymentGatewayListResponse(
    val PaymentGatewayList: List<PaymentGatewayResponse>,
    val SelectOption: Boolean,
    val Title: String
)
