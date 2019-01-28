package ir.houmansanati.persiantimeago

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class TimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var time: TextView
    init {
        time = itemView.findViewById(R.id.txt_time)
    }
}
