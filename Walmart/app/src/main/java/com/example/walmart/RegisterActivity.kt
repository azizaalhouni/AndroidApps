package com.example.walmart

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
            Toast.makeText(this,"Account created successfully!!", Toast.LENGTH_LONG).show()
        }
    }

    fun createAccount(view: View) {
        var fName = fName.text
        var lName = lName.text
        var emailId = emailId.text
        var password = password.text

        var newEntry = UserAccount(fName.toString(),lName.toString(),emailId.toString(),password.toString())
//        userList.add(newEntry)

    }
}