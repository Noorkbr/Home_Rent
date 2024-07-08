package com.example.homerent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitglow.base.BaseFragment
import com.example.homerent.Adapters.ListTrendAdapter
import com.example.homerent.Data.ListTrendData
import com.example.homerent.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var lisTrendAdapter: ListTrendAdapter



    val trendItem = listOf(
        ListTrendData(R.drawable.stays, "Stays"),
        ListTrendData(R.drawable.adventures, "Adventures"),
        ListTrendData(R.drawable.experience, "Experience"),


        )

    override fun setListener() {
        setRecycler1Data()


    }

    override fun allObserver() {


    }

    private fun setRecycler1Data() {
        lisTrendAdapter = ListTrendAdapter(trendItem)
        binding.trendItemRecycler.adapter = lisTrendAdapter
    }
}