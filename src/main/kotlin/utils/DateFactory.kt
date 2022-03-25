package utils

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class DateFactory {
    companion object {
        val DATE_FORMATER : DateFormat = SimpleDateFormat("dd/MM/yyyy")
        fun of(date : String) : Date {
            return DATE_FORMATER.parse(date)
        }
    }
}