package com.alexbor.fitnes64.utils

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexbor.fitnes64.adapters.ExercisesModel

class MainViewModel: ViewModel() {
    val mutableListExercise = MutableLiveData<ArrayList<ExercisesModel>>()
}