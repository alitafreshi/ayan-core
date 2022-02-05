package ir.tafreshiali.extension.helper

fun Long.formatAmount(unit: String = "ریال"): String {
    return this.toString().formatAmount(unit)
}