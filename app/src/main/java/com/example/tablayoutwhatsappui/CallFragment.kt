package com.example.tablayoutwhatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutwhatsappui.databinding.FragmentCallBinding


class CallFragment : Fragment() {
    lateinit var callBinding: FragmentCallBinding
    var callimage = ArrayList<Int>()
    var callname = ArrayList<String>()
    var callmessage = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       callBinding = FragmentCallBinding.inflate(layoutInflater,container,false)
        initview()
        return callBinding.root
    }

    private fun initview() {
        calldata()
        val adapter = CallAdapterClass(callimage, callname, callmessage)
        callBinding.rcvcall.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        callBinding.rcvcall.adapter = adapter


    }

    private fun calldata() {
        callimage.clear()
        callimage.add(R.drawable.ppp)
        callimage.add(R.drawable.sp2)
        callimage.add(R.drawable.sp3)
        callimage.add(R.drawable.sp4)
        callimage.add(R.drawable.sp5)
        callimage.add(R.drawable.sp6)
        callimage.add(R.drawable.sp7)
        callimage.add(R.drawable.sp8)
        callimage.add(R.drawable.sp9)
        callimage.add(R.drawable.sp10)
        callimage.add(R.drawable.sp1)


        callname.clear()
        callname.add("akshay")
        callname.add("sanjay")
        callname.add("himanshu")
        callname.add("dixshit")
        callname.add("vensi")
        callname.add("shruti")
        callname.add("aviraj")
        callname.add("purvish")
        callname.add("dhrasti")
        callname.add("mansi")
        callname.add("shiwam")

        callmessage.clear()
        callmessage.add("12 March,8:47 pm")
        callmessage.add("11 March,9:21 pm")
        callmessage.add("10 March,6:36 pm")
        callmessage.add("8 March,8:23 pm")
        callmessage.add("1 March,3:40 pm")
        callmessage.add("27 February,2:52 pm")
        callmessage.add("25 February,5:40 pm")
        callmessage.add("20 February,2:00 pm")
        callmessage.add("15 February,1:20 am")
        callmessage.add("11 February,9:00 am")
        callmessage.add("6 February,2:00 am")

    }


}