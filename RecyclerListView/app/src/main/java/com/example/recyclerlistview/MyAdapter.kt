package com.example.recyclerlistview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*

class MyAdapter(var context: Context,var blist: ArrayList<Product> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.card_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.itemView.playout.apply {
            holder.itemView.tv1.text = blist[position].tilte
            holder.itemView.tv2.text = blist[position].price.toString()
//            imageView.setImageResource(blist[position])
            holder.parentLayout.setOnClickListener{
                val intent = Intent(context, DetailActivity::class.java)
                var res = blist[position].tilte
                Toast.makeText(context,"$res clicked", Toast.LENGTH_LONG).show()
                intent.putExtra("title",blist[position].tilte)
                intent.putExtra("desc", blist[position].desc)
                context.startActivity(intent)
            }
        }

    override fun getItemCount(): Int {
        return blist.size

        }


     class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var t1: TextView = itemView.tv1
         var t2: TextView = itemView.tv2
         var parentLayout : RelativeLayout = itemView.findViewById(R.id.playout)
         as RelativeLayout
    }
}