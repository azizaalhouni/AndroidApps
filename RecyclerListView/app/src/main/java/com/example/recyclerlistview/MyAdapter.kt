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
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.card_layout.view.*

class MyAdapter(var context: Context,var blist: ArrayList<Product> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.card_layout,parent,false)
        return MyViewHolder(view)
    }
//class MyAdapter(var context: Context,var text1 : Array<String>, var text2: Array<String>,var img:IntArray, var text3: Array<String> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
//       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
//        val view = LayoutInflater.from(parent?.context).inflate(R.layout.card_layout,parent,false)
//        return MyViewHolder(view)
//   }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.itemView.playout.apply {
//            tv1.text = text1[position]
//            tv2.text = text2[position]
//            imageView.setImageResource(img[position])
//        }
    holder.itemView.playout.apply {
        holder.itemView.tv1.text = blist[position].tilte
        holder.itemView.tv2.text = blist[position].price.toString()
        holder.itemView.color.text = blist[position].color
     imageView.setImageResource(blist[position].image)
        holder.itemView.playout.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
//            var res = text1[position]
//            Toast.makeText(context," $res clicked", Toast.LENGTH_LONG).show()
//
//            intent.putExtra("image", img[position])
//            intent.putExtra("name", text1[position])
//            intent.putExtra("detail",text3[position])
//            context.startActivity(intent)
            var res = blist[position].tilte
            Toast.makeText(context, "$res clicked", Toast.LENGTH_LONG).show()
            intent.putExtra("title", blist[position].tilte)
            intent.putExtra("desc", blist[position].desc)
            intent.putExtra("image", blist[position].image)
            context.startActivity(intent)
        }
    }
}

    override fun getItemCount(): Int {
        return blist.size
//    return text1.size
        }


     class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        var t1: TextView = itemView.tv1
//         var t2: TextView = itemView.tv2
//         var parentLayout : RelativeLayout = itemView.findViewById(R.id.playout)
//         as RelativeLayout
    }
}