package com.example.tablayoutwhatsappui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayoutwhatsappui.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        initview()
        setContentView(binding.root)

    }

    private fun initview() {
        binding.tablout.addTab(binding.tablout.newTab().setText("Chat"))
        binding.tablout.addTab(binding.tablout.newTab().setText("Status"))
        binding.tablout.addTab(binding.tablout.newTab().setText("Calls"))


        var adapter = MyTablayoutAdapter(supportFragmentManager, binding.tablout.getTabCount())
        binding.viewpager.adapter = adapter

        binding.viewpager.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding.tablout))
        binding.tablout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewpager.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })


    }
}