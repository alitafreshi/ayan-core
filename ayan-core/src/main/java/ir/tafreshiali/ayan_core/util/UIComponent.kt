package ir.tafreshiali.ayan_core.util


/**
 * A class for declaring different ui component / widgets like (bottom sheet / toasts / dialogs etc) */

sealed class UIComponent {

    /**
     * one of the benefit of defining ui app / base ui components is that you can trail / track specific data that you need
     * here for retrying different failed requests we need to  trail / track related event that cause the app to show [ErrorBottomSheet]
     * so we use click on [errorButton] / try button the event relaunch so the request send again to the server
     * @param errorTitle
     * @param errorButton
     * @param errorDescription
     * @param stateEvent */
    data class ErrorBottomSheet<StateEvent>(
        val errorTitle: String = "خطا",
        val errorDescription: String,
        val errorButton: String = "تلاش مجدد",
        val stateEvent: StateEvent
    ) : UIComponent()

    data class InfoBottomSheet(
        val infoTitle: String = "توجه",
        val infoDescription: String,
        val infoButton: String = "باشه"
    ) : UIComponent()

    data class None(
        val message: String,
    ) : UIComponent()
}
