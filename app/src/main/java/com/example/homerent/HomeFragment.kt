package com.example.homerent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitglow.base.BaseFragment
import com.example.homerent.Adapters.ListTrendAdapter
import com.example.homerent.Adapters.PlaceListAdapter
import com.example.homerent.Data.ListTrendData
import com.example.homerent.Data.PlaceListData
import com.example.homerent.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var lisTrendAdapter: ListTrendAdapter
    private lateinit var placeListAdapter: PlaceListAdapter



    val trendItem = listOf(
        ListTrendData(R.drawable.stays, "Stays"),
        ListTrendData(R.drawable.adventures, "Adventures"),
        ListTrendData(R.drawable.experience, "Experience"),


        )
    val trendPlace = listOf(
        PlaceListData(R.drawable.palace,"The Palace Luxury","20000 Tk"),
        PlaceListData(R.drawable.sairu,"Sairu Hill RESORT","10000 Tk"),
        PlaceListData(R.drawable.sultan,"Sultan RESORT","30000 Tk"),
        PlaceListData(R.drawable.teavilla,"Tea Villa Resort","15000 Tk"),




        )

    override fun setListener() {
        setRecycler1Data()
        setRecycler2Data()


    }

    override fun allObserver() {


    }

    private fun setRecycler1Data() {
        lisTrendAdapter = ListTrendAdapter(trendItem)
        binding.trendItemRecycler.adapter = lisTrendAdapter
    }
    private fun setRecycler2Data() {
        placeListAdapter = PlaceListAdapter(trendPlace)
        binding.bestplacesRecycler.adapter = placeListAdapter
    }
}