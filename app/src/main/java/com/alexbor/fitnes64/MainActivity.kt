package com.alexbor.fitnes64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexbor.fitnes64.fragments.DaysFragment
import com.alexbor.fitnes64.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}