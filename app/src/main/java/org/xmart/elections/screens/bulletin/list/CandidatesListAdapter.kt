package org.xmart.elections.screens.bulletin.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.xmart.elections.R
import org.xmart.elections.models.Candidate
import org.xmart.elections.views.CandidateView

class CandidatesListAdapter(
    private val items: ArrayList<Candidate>,
    private val chosenCandidateListener: ((candidate: Candidate) -> Unit)
): RecyclerView.Adapter<CandidatesListAdapter.CandidateItemViewHolder>() {

    private var selectedItemPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidateItemViewHolder {
        return CandidateItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_candidate, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CandidateItemViewHolder, position: Int) {
        holder.setCandidate(items[position], selectedItemPosition)
        holder.itemView.setOnClickListener {
            if (selectedItemPosition != position) {
                chosenCandidateListener.invoke(items[position])
                selectedItemPosition = position
                notifyDataSetChanged()
            }
        }
    }

    class CandidateItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun setCandidate(candidate: Candidate, selectedPosition: Int) {
            (itemView as CandidateView).apply {
                setCandidateInfo(candidate)
                isSelected = selectedPosition == adapterPosition
            }
        }


    }

}