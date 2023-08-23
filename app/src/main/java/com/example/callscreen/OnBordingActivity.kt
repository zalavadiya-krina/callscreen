package com.example.callscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.callscreen.Adapter.FragmentPagerAdapter

class OnBordingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording)

        val viewPager = findViewById<ViewPager>(R.id.onbordingviewpager)
        val adapter = FragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
    }
}