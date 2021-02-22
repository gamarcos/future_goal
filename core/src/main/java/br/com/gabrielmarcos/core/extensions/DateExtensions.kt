package br.com.gabrielmarcos.core.extensions

import android.text.format.DateFormat
import java.util.*

fun getTimestamp(): Long = (System.currentTimeMillis()/1000)

fun timestampToDate(timestamp: String): String {
    val calendar = Calendar.getInstance(Locale.ENGLISH)
    calendar.timeInMillis = timestamp.toLong() * 1000L
    return DateFormat.format("dd-MM-yyyy", calendar).toString()
}