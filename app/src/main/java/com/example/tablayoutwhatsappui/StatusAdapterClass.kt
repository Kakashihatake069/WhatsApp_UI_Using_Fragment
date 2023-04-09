package com.example.tablayoutwhatsappui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapterClass (var imagestatus : ArrayList<Int>, var namestatus : ArrayList<String>,var messagestatus : ArrayList<String>) : RecyclerView.Adapter<StatusAdapterClass.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var statusimg : CircleImageView = itemView.findViewById(R.id.statusimg)
        var statusname : TextView = itemView.findViewById(R.id.statusname)
        var statusmsg : TextView = itemView.findViewById(R.id.statusmsg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.statusitemfile,parent,false)
        return MyViewHolder(view)

    }
    override fun getItemCount(): Int {
        return imagestatus.size
    }
    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {
        holder.statusimg.setImageResource(imagestatus[position])
        holder.statusname.setText(namestatus[position])
        holder.statusmsg.setText(messagestatus[position])

    }


}