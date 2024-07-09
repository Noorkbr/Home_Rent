package com.example.homerent.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homerent.Data.PlaceListData
import com.example.homerent.databinding.BestPlacesBinding


class PlaceListAdapter(private val list: List<PlaceListData>) :
    RecyclerView.Adapter<PlaceListAdapter.WorkoutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            BestPlacesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlaceListAdapter.WorkoutViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                itemImagex.load(it.image)
                itemTitlex.text = it.title
                itempricex.text = it.price
    }




        }
    }

    inner class WorkoutViewHolder(val binding: BestPlacesBinding) :
        RecyclerView.ViewHolder(binding.root)
}





