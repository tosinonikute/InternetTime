package com.s.internettime

import java.text.SimpleDateFormat
import java.util.*


@JvmOverloads
fun Date.format(pattern: String, timezone: String = "UTC"): String {
    val format = SimpleDateFormat(pattern, Locale.getDefault())
    format.timeZone = TimeZone.getTimeZone(timezone)
    return format.format(this)
}