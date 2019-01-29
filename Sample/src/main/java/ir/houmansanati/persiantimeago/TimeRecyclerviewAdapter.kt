package ir.houmansanati.persiantimeago


import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ir.houmansanati.perisantimeago.PersianTimeAgo

class TimeRecyclerviewAdapter(context: Context,times_ago : List<String>) : RecyclerView.Adapter<TimeViewHolder>() {
    private val context: Context
    private val times_ago: List<String>

    init {
        this.context = context
        this.times_ago = times_ago
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): TimeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_show_time, viewGroup, false)
        return TimeViewHolder(view)
    }

    override fun onBindViewHolder(timeViewHolder: TimeViewHolder, i: Int) {
        val txt_time = times_ago.get(timeViewHolder.adapterPosition)
        timeViewHolder.time.text = PersianTimeAgo(context).getTimeAgo(txt_time)
    }

    override fun getItemCount(): Int {
        return times_ago.size
    }
}
