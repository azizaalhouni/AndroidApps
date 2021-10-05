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
        var s3 = resources.getStringArray(R.array.price);
//        val s1 = resources.getStringArray(R.array.tablet)
        var productList = arrayListOf<Product>()

        productList.add(Product("Tablet",35.00,"Black",R.drawable.tablet,"555948010"
            ,"Description of Tablet: Introduction the RCA Voyager 7-Insh Google Certified Tablet"))
        productList.add(Product("Computer",299.00,"Black",R.drawable.computer,"555948010"
            ,"Description of Computer: A computer is an electronic device that manipulates information, or data"))
        productList.add(Product("Printer",299.00,"Black",images[2],"555948010"
            ,"Description of Printer: A printer is a device that accepts text and graphic output from a computer and transfers the information to paper"))
        productList.add(Product("VIZIO 80 CLASS 4K ",1298.00,"Black",images[3],"555948010"
            ,"Description of Printer: "))
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(this,productList)
//        val adapter = MyAdapter(this,s1,s2,images,s3)

        recyclerView1.adapter = adapter

    }
}