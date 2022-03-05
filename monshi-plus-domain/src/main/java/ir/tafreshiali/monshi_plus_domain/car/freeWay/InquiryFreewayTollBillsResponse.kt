package ir.tafreshiali.monshi_plus_domain.car.freeWay

import ir.tafreshiali.monshi_plus_domain.bills.BillHeaderResponse
import ir.tafreshiali.monshi_plus_domain.payment.PaymentExtraInfoResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.payment.GeneralDateTimeResponse
import ir.tafreshiali.ayan_core.payment.NameShowNameResponse

data class InquiryFreewayTollBillsResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: FreeWayResultResponse
)

/**
 * the whole result about plate that server send to the client for the Free way Toll Bills request
 * @param Categories lis of type [FreeWayTollCategoryResponse]
 * @param MultipleSelect of type [Boolean]
 * @param Payable of type [Payable]
 * @param TotalAmountOfBills the total payable price for the Inquiry plate in Rial
 * @param TotalNumberOfBills the total number of bills that generated for the Inquiry plate
 * @param UnderReview of type [UnderReview]*/
data class FreeWayResultResponse(
    val Categories: List<FreeWayTollCategoryResponse>,
    val MultipleSelect: Boolean,
    val Payable: PayableBillsResponse,
    val TotalAmountOfBills: Long?,
    val TotalNumberOfBills: Long?,
    val UnderReview: UnderReviewBillsResponse
)

/**
 * TODO IMPORTANT NOTE THIS FILED IS DEPRECATED INSTEAD USE [PayableBillsResponse] OBJ
 * @param Bills a list of type [FreeWayBillResponse]
 * @param Title of type [String]*/
data class FreeWayTollCategoryResponse(
    val Bills: List<FreeWayBillResponse>?,
    val Title: String?
)

/**
 * @param Categories a list of type [FreeWayTollCategoryResponse]
 * @param TotalAmountOfBills the total payable price for the Inquiry plate in Rial
 * @param TotalNumberOfBills the total number of bills that generated for the Inquiry plate */
data class PayableBillsResponse(
    val Categories: List<FreeWayTollCategoryResponse>,
    val TotalAmountOfBills: Long,
    val TotalNumberOfBills: Long
)

/**
 * The status of bills does not change immediately after payment so the bills that their status
 * Therefore, bills whose status is not clear are included in this section
 * @param Categories a list of type [FreeWayTollCategoryResponse]
 * @param TotalAmountOfBills the total payable price for the Inquiry plate in Rial
 * @param TotalNumberOfBills the total number of bills that generated for the Inquiry plate */
data class UnderReviewBillsResponse(
    val Categories: List<FreeWayTollCategoryResponse>,
    val TotalAmountOfBills: Long,
    val TotalNumberOfBills: Long
)

/**
 * the actual bill obj in server response
 * @param Detail of type [FreeWayDetailResponse]
 * @param ExtraInfo of type [String]
 * @param Header of type [Header]
 * @param PaymentExtraInfo of type [PaymentExtraInfo]
 * @param PaymentStatus of type [NameShowNameResponse]
 * @param isSelected of type [Boolean]*/
data class FreeWayBillResponse(
    val Detail: FreeWayDetailResponse,
    val ExtraInfo: String,
    val Header: BillHeaderResponse,
    val PaymentExtraInfo: PaymentExtraInfoResponse,
    val PaymentStatus: NameShowNameResponse,
    var isSelected: Boolean = true
)

/**
 * the detail about each bill individual
 * @param DateTimeIssue of type [GeneralDateTimeResponse] the date the bill was created
 * @param DateTimeTraverse of type [GeneralDateTimeResponse] The date of the car passing through the tolls
 * @param Freeway name of the free way of type [String]*/
data class FreeWayDetailResponse(
    val DateTimeIssue: GeneralDateTimeResponse,
    val DateTimeTraverse: GeneralDateTimeResponse,
    val Freeway: String
)