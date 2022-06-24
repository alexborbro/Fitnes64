package com.alexbor.fitnes64.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexbor.fitnes64.R
import com.alexbor.fitnes64.databinding.ActivityMainBinding
import com.alexbor.fitnes64.databinding.FragmentDaysBinding


class DaysFragment : Fragment() {

    private lateinit var binding: FragmentDaysBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false )
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = DaysFragment()
    }
}