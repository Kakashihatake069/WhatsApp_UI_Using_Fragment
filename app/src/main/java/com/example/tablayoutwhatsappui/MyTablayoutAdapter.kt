package com.example.tablayoutwhatsappui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyTablayoutAdapter(supportFragmentManager: Any?, var tabcount: Int) : FragmentPagerAdapter(
    supportFragmentManager as FragmentManager
) {
    override fun getCount(): Int {
        return tabcount
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 ->{

                return ChatFragment()
            }
            1 ->{
                return StatusFragment()
            }
            2 ->{
                return CallFragment()
            }
            else ->{
                return CallFragment()
            }

        }

    }
}