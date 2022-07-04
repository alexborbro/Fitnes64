package com.alexbor.fitnes64.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexbor.fitnes64.R
import com.alexbor.fitnes64.adapters.DayModel
import com.alexbor.fitnes64.adapters.DaysAdapter
import com.alexbor.fitnes64.adapters.ExercisesModel
import com.alexbor.fitnes64.databinding.ActivityMainBinding
import com.alexbor.fitnes64.databinding.FragmentDaysBinding
import com.alexbor.fitnes64.utils.FragmentManager
import com.alexbor.fitnes64.utils.MainViewModel


class DaysFragment : Fragment(), DaysAdapter.Listener {

    private lateinit var binding: FragmentDaysBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        val adapter = DaysAdapter(this@DaysFragment)
        rcViewDays.layoutManager = LinearLayoutManager(activity as AppCompatActivity)
        rcViewDays.adapter = adapter
        adapter.submitList(fillDaysArray())

    }

    private fun fillDaysArray(): ArrayList<DayModel> {
        val tempArray = ArrayList<DayModel>()
        resources.getStringArray(R.array.day_exercises).forEach {
            tempArray.add(DayModel(it, false))
        }
        return tempArray
    }

    private fun fillExerciseList(day: DayModel){
        val tempList = ArrayList<ExercisesModel>()
        day.exercises.split(",").forEach {
            val exerciseList = resources.getStringArray(R.array.exercise)
            val exercise = exerciseList[it.toInt()]
            val exerciseArray = exercise.split("|")
            tempList.add(ExercisesModel(exerciseArray[0], exerciseArray[1], exerciseArray[2]))
        }
        model.mutableListExercise.value = tempList
        model.mutableListExercise.observe(viewLifecycleOwner, {

        })
    }


    companion object {

        @JvmStatic
        fun newInstance() = DaysFragment()
    }

    override fun onClick(day: DayModel) {
        fillExerciseList(day)
        FragmentManager.setFragment(ExercisesListFragment.newInstance(),
            activity as AppCompatActivity)
    }
}