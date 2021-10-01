package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.emailAddress
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity : AppCompatActivity() {
    lateinit var result: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

//        val output = intent.getStringExtra("userEmail")
        val beauty = findViewById<ImageView>(R.id.beauty)
        val food = findViewById<ImageView>(R.id.food)
        val clothing = findViewById<ImageView>(R.id.clothing)
        val electronic = findViewById<ImageView>(R.id.electronic)

        val temp = intent.getSerializableExtra("userEmail")
        result = temp as User //To cast Serializable
        email.text= "Welcome "+result.emailAddress

        beauty.setOnClickListener{
        Toast.makeText(this,"You have chosen the beauty category  of shopping", Toast.LENGTH_LONG).show()
        }
        food.setOnClickListener{
            Toast.makeText(this,"You have chosen the food category  of shopping", Toast.LENGTH_LONG).show()
        }
        clothing.setOnClickListener{
            Toast.makeText(this,"You have chosen the clothing category  of shopping", Toast.LENGTH_LONG).show()
        }
        electronic.setOnClickListener{
            Toast.makeText(this,"You have chosen the electronic category  of shopping", Toast.LENGTH_LONG).show()
        }
    }

}