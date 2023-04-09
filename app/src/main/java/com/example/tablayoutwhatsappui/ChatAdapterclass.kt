package com.example.tablayoutwhatsappui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapterclass(
    var imagelist: ArrayList<Int>,
    var namelist: ArrayList<String>,
    var messagelist: ArrayList<String>
) : RecyclerView.Adapter<ChatAdapterclass.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var circleimg: CircleImageView = itemView.findViewById(R.id.circleimg)
        var itemname: TextView = itemView.findViewById(R.id.itemname)
        var itemmsg: TextView = itemView.findViewById(R.id.itemmsg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chatitemfile, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imagelist.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.circleimg.setImageResource(imagelist[position])
        holder.itemname.setText(namelist[position])
        holder.itemmsg.setText(messagelist[position])

    }


}