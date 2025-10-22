package com.example.chatingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class MessengerAdapter(private val item: List<MessengerItem>):
    RecyclerView.Adapter<MessengerAdapter.MessengerViewHolder>() {
    inner class MessengerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<CircleImageView>(R.id.itemImage)
        val name = itemView.findViewById<TextView>(R.id.itemName)
        val subtitle = itemView.findViewById<TextView>(R.id.itemSubtitle)
    }
        
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessengerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_messenger, parent, false)
        return MessengerViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessengerViewHolder, position: Int) {
        val item = item[position]
        holder.image.setImageResource(item.image)
        holder.name.text = item.name
        holder.subtitle.text = item.subtitle
    }

    override fun getItemCount(): Int {
        return item.size
    }
}