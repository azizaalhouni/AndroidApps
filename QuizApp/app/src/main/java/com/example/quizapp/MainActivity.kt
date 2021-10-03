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
        var point = 0
        //Create an object for AlertDialog by passing the current context object
        val builder = AlertDialog.Builder(this@MainActivity)
        //Set the basic info for the builder object
        builder.setTitle("Alert Message")
        if(true1?.isChecked== true){
            point = point +50
        }
        if(checkBox?.isChecked == true){
            point = point + 50
        }

        if(point >= 50) {
            builder.setMessage("Congratulation!! Your achieved  "+ point)
        }
//        builder.setWhen(System.currentTimeMillis())
//        builder.setWhen(Calendar.getInstance().getTimeInMillis() )

        ////Time
        val cal = Calendar.getInstance()
        val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->}
//        TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), false).show()
//        builder.setItems(TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), false).show()
        //)


//        builder.setIcon(R.drowable.alerticon)
        //To perform positive action on clicking submit button
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
}

private fun AlertDialog.Builder.setWhen(timeInMillis: Long) {

}
