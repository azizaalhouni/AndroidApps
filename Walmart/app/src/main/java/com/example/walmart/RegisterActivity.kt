package com.example.walmart

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val createAccount = findViewById<Button>(R.id.create)

        createAccount.setOnClickListener{
            val data = Intent()
            val fName = firstName?.text.toString()
            val lName = lastName?.text.toString()
            val emailId = emailId?.text.toString()
            val password = password?.text.toString()

            val newEntry = UserAccount(fName,lName,emailId,password)
            Toast.makeText(this,"Account created successfully!!", Toast.LENGTH_LONG).show()


            data.putExtra("firstName", fName)
            data.putExtra("lastName",lName)
            data.putExtra("email",emailId)
            data.putExtra("password",password)
            setResult(Activity.RESULT_OK,data)
            finish()

        }
    }

//    fun createAccount(view: View) {
//        var fName = fName.text
//        var lName = lName.text
//        var emailId = emailId.text
//        var password = password.text
//
//        var newEntry = UserAccount(fName.toString(),lName.toString(),emailId.toString(),password.toString())
////        userList.add(newEntry)
//
//    }
}