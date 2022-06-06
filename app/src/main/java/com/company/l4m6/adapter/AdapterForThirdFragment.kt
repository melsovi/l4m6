package com.company.l4m6.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.company.l4m6.R
import com.company.l4m6.databinding.ItemListHistoryBinding

class AdapterForThirdFragment : RecyclerView.Adapter<AdapterForThirdFragment.ThirdHolder>() {

    private val historyList = arrayListOf<String>()

    class ThirdHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ItemListHistoryBinding.bind(item)

        @SuppressLint("SetTextI18n")
        fun bind(historyList: String) = with(binding) {
            recyclerText.text = "$historyList $adapterPosition"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_history, parent, false)
        return ThirdHolder(view)
    }

    override fun onBindViewHolder(holder: ThirdHolder, position: Int) {
        holder.bind(historyList[position])
    }

    override fun getItemCount() = historyList.size

    @SuppressLint("NotifyDataSetChanged")
    fun addHistory(historyList: String) {
        this.historyList.add(historyList)
        notifyDataSetChanged()
    }

}