package log.zug.main.modeljson.const

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import log.zug.main.R

class StateAdapter internal constructor(
    context: Context?,
    states: ArrayList<courseValute>,
    val onClickListener: (courseValute) -> Unit
) :
    RecyclerView.Adapter<StateAdapter.ViewHolder>() {
    private val inflater: LayoutInflater
    private val states: ArrayList<courseValute>

    init {
        this.states = states
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.item_recy2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val state = states[holder.adapterPosition]
        holder.name.text = state.name
        holder.course.text = state.cource
        holder.itemView.setOnClickListener {
            onClickListener(states[position])
        }
    }

    override fun getItemCount(): Int {
        return states.size
    }

    class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView
        val course: TextView

        init {
            name = view.findViewById<View>(R.id.Tv1) as TextView
            course = view.findViewById<View>(R.id.Tv2) as TextView
        }
    }
}