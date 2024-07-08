package com.example.homerent

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitglow.base.BaseFragment
import com.example.homerent.databinding.FragmentLandingBinding


class LandingFragment : BaseFragment<FragmentLandingBinding>(FragmentLandingBinding::inflate) {
    override fun setListener() {
        binding.getstartedbtn.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity2::class.java))
            requireActivity().finish()
        }


    }

    override fun allObserver() {

    }
}