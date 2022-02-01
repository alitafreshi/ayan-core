package ir.tafreshiali.ayan_core.util

sealed class ProgressBarState{

    object Loading: ProgressBarState()

    object Idle: ProgressBarState()
}

