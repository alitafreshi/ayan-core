package ir.tafreshiali.ayan_core.util

import androidx.annotation.StringRes

/** for multi language apps we have two scenarios
 * scenario 1 - a message / text that's comes from server and its completely dynamic
 * scenario 2 - a message / text that's in our local string resources  */
sealed class UiText {
    data class DynamicString(val value: String) : UiText()
    class StringResource(@StringRes val resId: Int, vararg val args: Any) : UiText()
}