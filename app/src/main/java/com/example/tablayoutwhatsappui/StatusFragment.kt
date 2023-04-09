package com.example.tablayoutwhatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutwhatsappui.databinding.FragmentChatBinding
import com.example.tablayoutwhatsappui.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    lateinit var statusBinding: FragmentStatusBinding

    var imagestatus = ArrayList<Int>()
    var namestatus = ArrayList<String>()
    var messagestatus = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        statusBinding = FragmentStatusBinding.inflate(layoutInflater,container,false)
        initview()
        return statusBinding.root
    }

    private fun initview() {
        statusinfo()
        val adapter = StatusAdapterClass(imagestatus, namestatus, messagestatus)
        statusBinding.rcvstatus.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        statusBinding.rcvstatus.adapter = adapter
    }

    private fun statusinfo() {
        imagestatus.clear()
        imagestatus.add(R.drawable.ppp)
        imagestatus.add(R.drawable.sp2)
        imagestatus.add(R.drawable.sp3)
        imagestatus.add(R.drawable.sp4)
        imagestatus.add(R.drawable.sp5)
        imagestatus.add(R.drawable.sp6)
        imagestatus.add(R.drawable.sp7)
        imagestatus.add(R.drawable.sp8)
        imagestatus.add(R.drawable.sp9)
        imagestatus.add(R.drawable.sp10)
        imagestatus.add(R.drawable.sp1)


        namestatus.clear()
        namestatus.add("akshay")
        namestatus.add("sanjay")
        namestatus.add("himanshu")
        namestatus.add("dixshit")
        namestatus.add("vensi")
        namestatus.add("shruti")
        namestatus.add("aviraj")
        namestatus.add("purvish")
        namestatus.add("dhrasti")
        namestatus.add("mansi")
        namestatus.add("shiwam")

        messagestatus.clear()
        messagestatus.add("5 minutes ago")
        messagestatus.add("12 minutes ago")
        messagestatus.add("15 minutes ago")
        messagestatus.add("25 minutes ago")
        messagestatus.add("36 minutes ago")
        messagestatus.add("40 minutes ago")
        messagestatus.add("2 hour ago")
        messagestatus.add("5 hour ago")
        messagestatus.add("2 days ago")
        messagestatus.add("4 days ago")
        messagestatus.add("5 days ago")
    }


}