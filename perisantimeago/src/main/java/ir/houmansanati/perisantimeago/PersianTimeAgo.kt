package ir.houmansanati.perisantimeago

import android.content.Context
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class PersianTimeAgo(context: Context) {
    private val context: Context

    init {
        this.context = context
    }

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
            if (seconds < 30)
            {
                return context.getString(R.string.moments_ago)
            }
            else
            return seconds.toString() + context.getString(R.string.seconds_ago)
        } else if (minutes < 60) {
            return minutes.toString() + context.getString(R.string.minutes_ago)
        } else if (hours < 24) {
            return hours.toString() + context.getString(R.string.houres_ago)
        } else if (days < 30) {
            if (days % 7 == 0L)
            {
                val weeks = days / 7
                return weeks.toString() + context.getString(R.string.weeks_ago)
            }
            else
            return days.toString() + context.getString(R.string.days_ago)
        } else if (months < 12) {
            return months.toString() + context.getString(R.string.months_ago)
        } else return years.toString() + context.getString(R.string.years_ago)
    }
}