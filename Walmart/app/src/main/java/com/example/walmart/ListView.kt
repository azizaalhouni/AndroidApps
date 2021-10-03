package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ListView : AppCompatActivity() {
//    lateinit var result: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
//    ArrayList<String> arrayList = new ArrayList<String>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val temp = intent.getSerializableExtra("item1")
        val temp1 = intent.getSerializableExtra("item2")

        var planet2 = temp.toString()
        var planet1 = temp1.toString()
        var planet = arrayOf<String>(planet1,planet2)
//       result = temp as ArrayList<String> //To cast Serializable
        val adapter = ArrayAdapter<String>(this@ListView, android.R.layout.simple_spinner_dropdown_item, planet)

        lview.adapter= adapter
    lview.onItemClickListener =
        AdapterView.OnItemClickListener{parent, view, position, id->
//            val item = parent.getItemAtPosition(position).toString()
            Toast.makeText(this,"You have chosen the "+planet.get(position), Toast.LENGTH_LONG).show()
        }

    }
}