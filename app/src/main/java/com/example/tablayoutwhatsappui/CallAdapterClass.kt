package com.example.tablayoutwhatsappui

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.flow.callbackFlow
import org.w3c.dom.Text

class CallAdapterClass (var callimage : ArrayList<Int>,var callname : ArrayList<String>,var callmessage : ArrayList<String>): RecyclerView.Adapter<CallAdapterClass.MyViewHolder>(){
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var callimg:ImageView=itemView.findViewById(R.id.callimg)
        var callname:TextView=itemView.findViewById(R.id.callname)
        var callmsg:TextView=itemView.findViewById(R.id.callmsg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.callitemfile,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallAdapterClass.MyViewHolder, position: Int) {
        holder.callimg.setImageResource(callimage[position])
        holder.callname.setText(callname[position])
        holder.callmsg.setText(callmessage[position])


    }

    override fun getItemCount(): Int {
        return callimage.size
    }
}