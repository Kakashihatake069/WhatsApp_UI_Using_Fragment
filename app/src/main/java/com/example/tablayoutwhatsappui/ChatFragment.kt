package com.example.tablayoutwhatsappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutwhatsappui.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    lateinit var chatBinding: FragmentChatBinding

    var imagelist = ArrayList<Int>()
    var namelist = ArrayList<String>()
    var messagelist = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        chatBinding = FragmentChatBinding.inflate(layoutInflater,container,false)
        initview()
        return chatBinding.root

    }

    private fun initview() {

        datainfo()
        val adapter = ChatAdapterclass(imagelist,namelist,messagelist)
        chatBinding.rcvchat.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        chatBinding.rcvchat.adapter = adapter
    }

    private fun datainfo() {
        imagelist.clear()
        imagelist.add(R.drawable.ppp)
        imagelist.add(R.drawable.sp2)
        imagelist.add(R.drawable.sp3)
        imagelist.add(R.drawable.sp4)
        imagelist.add(R.drawable.sp5)
        imagelist.add(R.drawable.sp6)
        imagelist.add(R.drawable.sp7)
        imagelist.add(R.drawable.sp8)
        imagelist.add(R.drawable.sp9)
        imagelist.add(R.drawable.sp10)
        imagelist.add(R.drawable.sp1)


        namelist.clear()
        namelist.add("Bunty")
        namelist.add("Sanjay")
        namelist.add("Himanshu")
        namelist.add("Dixshit")
        namelist.add("Vensi")
        namelist.add("Shruti")
        namelist.add("Aviraj")
        namelist.add("Purvish")
        namelist.add("Dhrasti")
        namelist.add("Mansi")
        namelist.add("Shiwam")

        messagelist.clear()
        messagelist.add("jldi niche auv...")
        messagelist.add("Recycle view no photo muklne bhai.")
        messagelist.add("Bro copy wala function Adapter ma work kr raha hai ")
        messagelist.add("Task ho gaya")
        messagelist.add("Photo")
        messagelist.add("lab ma cho..")
        messagelist.add("chal bahar javana")
        messagelist.add("allu puri khavi che.")
        messagelist.add("dhrasti taru hair dryer apne")
        messagelist.add("aje bahar khava giye")
        messagelist.add("ala phone uchak ne")




    }


}
