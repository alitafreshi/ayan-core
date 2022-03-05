package ir.tafreshiali.monshi_plus_domain.payment

import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse

data class PaymentExtraInfoResponse(
    val DateTime: GeneralDateTimeResponse,
    val TraceNumber: String
)