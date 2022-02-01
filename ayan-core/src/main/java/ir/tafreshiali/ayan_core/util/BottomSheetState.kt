package ir.tafreshiali.ayan_core.util

sealed class BottomSheetState {
    object Loading : BottomSheetState()
    object Info : BottomSheetState()
    object MobileOperator : BottomSheetState()
    object Idle : BottomSheetState()

}
