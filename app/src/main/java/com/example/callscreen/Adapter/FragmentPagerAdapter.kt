package com.example.callscreen.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentManager
import com.example.callscreen.Fragment.Fragment1
import com.example.callscreen.Fragment.Fragment2
import com.example.callscreen.Fragment.Fragment3

open class FragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment1()
            }

            1 -> {
                Fragment2()
            }

            else -> {
                Fragment3()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}