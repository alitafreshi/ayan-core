package ir.tafreshiali.ayan_core.util


sealed class DataState<T> {

    data class Error<T>(
        val uiComponent: UIComponent
    ) : DataState<T>()

    data class Data<T>(
        val data: T? = null
    ) : DataState<T>()

    data class Loading<T>(
        //val progressBarState: ProgressBarState = ProgressBarState.Idle
        val bottomSheetState: BottomSheetState = BottomSheetState.Idle
    ) : DataState<T>()
}

