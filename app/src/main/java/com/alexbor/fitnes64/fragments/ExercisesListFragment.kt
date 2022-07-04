package com.alexbor.fitnes64.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexbor.fitnes64.R
import com.alexbor.fitnes64.adapters.DayModel
import com.alexbor.fitnes64.adapters.DaysAdapter
import com.alexbor.fitnes64.databinding.ActivityMainBinding
import com.alexbor.fitnes64.databinding.ExercisesListFragmentBinding
import com.alexbor.fitnes64.databinding.FragmentDaysBinding


class ExercisesListFragment : Fragment() {

    private lateinit var binding: ExercisesListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ExercisesListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {

        @JvmStatic
        fun newInstance() = ExercisesListFragment()
    }
}