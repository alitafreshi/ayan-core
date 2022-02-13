package ir.tafreshiali.ayan_core.util

sealed class BottomSheetState {
    object Loading : BottomSheetState()
    object Confirm : BottomSheetState()
    object Idle : BottomSheetState()

}
