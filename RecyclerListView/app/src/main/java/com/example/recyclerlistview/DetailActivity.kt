package com.example.recyclerlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if(intent.hasExtra("title")&& intent.hasExtra("desc")){
            var t1: String? = intent.getStringExtra("title")
            var t2: String? = intent.getStringExtra("desc")
            var ig:Int = intent.getIntExtra("image",0)
            name.text = t1.toString()
            desc.text = t2.toString()
//            imageView2.setImageResource(ig)
        }
    }
}