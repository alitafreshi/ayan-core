package ir.tafreshiali.ayan_core.util

sealed class AppDialogState {
    object InquiryHistory : AppDialogState()
    object UpdateVersion : AppDialogState()
    object Idle : AppDialogState()
}
