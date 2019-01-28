package ir.houmansanati.perisantimeago

import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class PersianTimeAgo {
    companion object {
        fun getTimeAgo(dateTimeFormat: String): String {
            val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val past = format.parse(dateTimeFormat)
            val now = Date()
            val seconds = TimeUnit.MILLISECONDS.toSeconds(now.time - past.time)
            val minutes = TimeUnit.MILLISECONDS.toMinutes(now.time - past.time)
            val hours = TimeUnit.MILLISECONDS.toHours(now.time - past.time)
            val days = TimeUnit.MILLISECONDS.toDays(now.time - past.time)
            val months = days / 30
            val years = months / 12


            if (seconds < 60) {
                return seconds.toString() + " ثانیه"
            } else if (minutes < 60) {
                return minutes.toString() + " دقیقه"
            } else if (hours < 24) {
                return hours.toString() + " ساعت"
            } else if (days < 30) {
                return days.toString() + " روز"
            } else if (months < 12) {
                return months.toString() + " ماه"
            } else return years.toString() + " سال"
        }
    }
}