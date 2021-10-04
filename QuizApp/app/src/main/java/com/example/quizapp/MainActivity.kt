package com.example.quizapp

import android.app.TimePickerDialog
import android.icu.util.TimeZone
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.stream.DoubleStream.builder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        val c = Calendar.getInstance()
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        val mYear = c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)+1
        val time = c.get(Calendar.HOUR_OF_DAY)
        val min = c.get(Calendar.MINUTE)
        var point = 0
        //Create an object for AlertDialog by passing the current context object
        val builder = AlertDialog.Builder(this@MainActivity)
        //Set the basic info for the builder object
        builder.setTitle("Alert Message")

        if(true1?.isChecked== true){
            point = point +50
        }
        if(checkBox?.isChecked == true || checkBox2?.isChecked == true || checkBox3?.isChecked == true){
            point = point + 50
        }

        if(point >= 50) {
//            builder.setMessage("Congratulation!! Your achieved  "+ point)
            builder.setMessage("Congratulation!! Your achieved  "+ point+"%"+
                    '\n'+"Day "+mMonth+"/"+ mDay+ "/"+mYear + " Time:" +  time+":"+min)

        }else
        {
            builder.setMessage("You Failed!! "+ point+"%"+
                    '\n'+"Day "+mMonth+"/"+ mDay+ "/"+mYear + " Time:" +  time+":"+min)
        }

        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,"It's a positive action : $which", Toast.LENGTH_SHORT).show()
        dialogInterface.dismiss()
            finish()
        }
        // 4. Performing Cancel action on clicking Cancel button
        builder.setNegativeButton("Cancel"){dialogInterface, which ->
            Toast.makeText(applicationContext,"It's a positive action click by which id : $which",Toast.LENGTH_SHORT).show()
            dialogInterface.dismiss() // dismiss the dialog, but activity is still alive
        }
        builder.setNeutralButton("Thinking"){dialogInterface, which ->
            Toast.makeText(applicationContext, "Thinking : $which", Toast.LENGTH_SHORT).show()
        }
        //Finally make the alert dialog using builder
        val dialog: AlertDialog = builder.create()
        //Display the alert dialog on app interface
        dialog.show()
    }

    fun reset(view: View) {
        true1?.isChecked = false
        false1?.isChecked = false
        checkBox?.isChecked = false
        checkBox2?.isChecked = false
        checkBox3?.isChecked = false
    }
}

private fun AlertDialog.Builder.setWhen(timeInMillis: Long) {

}
