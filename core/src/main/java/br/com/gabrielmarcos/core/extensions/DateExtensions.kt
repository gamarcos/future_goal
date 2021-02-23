package br.com.gabrielmarcos.core.extensions

import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*

private const val DATE_FORMAT = "dd/MM/yyyy"

fun getInstantDate(): String = Calendar.getInstance().toInstant().toString()

fun instantToStringDate(instant: String): String {
    val newInstantDate = Date.from(Instant.parse(instant))
    val simpleDateFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
    return simpleDateFormat.format(newInstantDate)
}

fun stringToInstant(date: String): String {
    val format =  SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
    val formatter = format.parse(date)
    val calendar = Calendar.getInstance()
    calendar.time = formatter
    return calendar.time.toInstant().toString()
}