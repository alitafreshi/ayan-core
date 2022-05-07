package ir.tafreshiali.ayan_core_ui.history

import android.os.Parcelable
import ir.tafreshiali.ayan_core.key_value.KeyValueResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class KeyValue(
    val Key: String,
    var Value: String?
) : Parcelable


fun KeyValueResponse.toKeyValue() = KeyValue(Key = Key, Value = Value)


fun List<KeyValueResponse>.toKeyValueList() = buildList {
    this@toKeyValueList.forEach { item ->
        add(item.toKeyValue())
    }
}

