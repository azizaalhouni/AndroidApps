package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

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
        var ColumnTwo = TextView(this)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        tableRow.addView(columnOne,0)
        tableRow.addView(ColumnTwo,1)
        //To add the created Row into Layout
        tableLay.addView(tableRow)
        ColumnTwo.text = version.text.toString()
        ColumnTwo.text = codeName.text.toString()





    }
}