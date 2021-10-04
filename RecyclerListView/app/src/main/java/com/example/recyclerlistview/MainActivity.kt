package com.example.recyclerlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var r1:RecyclerView? = null
    var images = intArrayOf(
        R.drawable.tablet,
        R.drawable.computer,
        R.drawable.printer,
        R.drawable.vizio
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        r1 = findViewById<RecyclerView>(R.id.recyclerView1)
        var s1 = resources.getStringArray(R.array.electronic);
        var  s2 = resources.getStringArray(R.array.desc);
        var s3 = resources.getStringArray(R.array.detail);
//        val s1 = resources.getStringArray(R.array.tablet)
        var productList = arrayListOf<Product>()

        productList.add(Product("Tablet",35.00,"Black","tablet","id"
            ,"Description of Tablet"))
        productList.add(Product("Computer",299.00,"Black","computer","id"
            ,"Description of Tablet"))
        productList.add(Product("Computer",299.00,"Black","computer","id"
            ,"Description of Tablet"))
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(this,productList)
//        var m = resources.getStringArray(R.array.)

        recyclerView1.adapter = adapter

    }
}