package ir.tafreshiali.extension.helper


fun String.removePishkhanFromString() =
    this.replace("با پیشخوان 24", "")
        .replace("پیشخوان 24", "")
        .replace("با پیشخوان24", "")
        .replace("پیشخوان24", "")
        .replace("با پیشخوان", "")
        .replace("پیشخوان", "")
        .trim()


fun String.formatAmount(unit: String = "ریال", isNegative: Boolean = false): String {
    if (this.contains("-")) {
        return this.replace("-", "").formatAmount(isNegative = true)
    }
    var amountString = this
    var mod = amountString.length % 3
    if (mod == 0)
        mod = 3
    while (mod < amountString.length) {
        amountString =
            amountString.substring(0, mod) + "," + amountString.substring(mod, amountString.length)
        mod += 4
    }
    val negativeCare = if (isNegative) " -" else ""
    amountString = "$amountString$negativeCare $unit "
    if (this == "0 ریال") amountString.replace("0", "صفر")
    return amountString.trim()
}

fun String.persianDateSplitter(): String {
    return this.substringAfter("(").substringBefore(")")
}
