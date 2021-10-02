package com.example.tablelayout

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color.RED as ColorRED

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun click(view: View) {

        //Cr3eate a new Table Row
        val tableRow = TableRow(getApplicationContext())
//       val r = findViewById<EditText>(R.id.version)


//        val m = findViewById<EditText>(R.id.codeName)
        var columnOne = TextView(this)
        var columnTwo = TextView(this)
        columnOne.setBackgroundColor(0xfff00000.toInt())
        columnTwo.setBackgroundColor(0xfff00000.toInt())
       columnOne.setGravity(android.view.Gravity.CENTER)
        columnTwo.setGravity(android.view.Gravity.CENTER)

        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        tableRow.addView(columnOne,0)
        tableRow.addView(columnTwo,1)
//        tableRow.background = "#E91E63"

//       tableRow.background = R.drawable.ic_launcher_background

        //To add the created Row into Layout
        tableLay.addView(tableRow)
        columnOne.text = version.text.toString()
        columnTwo.text = codeName.text.toString()



    }
}


