package com.example.homerent.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homerent.Data.ListTrendData
import com.example.homerent.databinding.TrendingItemLayoutBinding

class ListTrendAdapter(private val list: List<ListTrendData>) :
    RecyclerView.Adapter<ListTrendAdapter.WorkoutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            TrendingItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                itemImage.load(it.image)
                itemTitle.text = it.title
            }
        }
    }

    inner class WorkoutViewHolder(val binding: TrendingItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}
