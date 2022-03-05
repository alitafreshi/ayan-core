package ir.tafreshiali.monshi_plus_domain.payment.gateway

import ir.tafreshiali.monshi_plus_domain.payment.gateway.PaymentGatewayResponse

data class SalesGetPaymentGatewayListResponse(
    val PaymentGatewayList: List<PaymentGatewayResponse>,
    val SelectOption: Boolean,
    val Title: String
)
