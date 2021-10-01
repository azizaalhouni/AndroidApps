package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var userList = arrayListOf<UserAccount>()

//        var input1 = UserAccount("aziza","hounit","aziza@yahoo.com","1234")
//        var input2 = UserAccount("aziza","hounit","aziza@yahoo.com","1234")
//        var input3 = UserAccount("aziza","hounit","aziza@yahoo.com","1234")
//        userList.add(0,input1)
//        userList.add(1,input2)
//        userList.add(2,input3)
//        var input : () -> User = {User("aziza","hounit","aziza@yahoo.com","1234")
//            ,User("sama", "yser","a","b"),
//        User("User","Sadi","s@yahoo.com","1234")}
//
   }

    fun SignIn(view: View) {
        var userList = arrayListOf<UserAccount>()
//
        var input1 = UserAccount("aziza","hounit","aziza@yahoo.com","1234")
        var input2 = UserAccount("sara","hounit","sara@yahoo.com","1234")
        var input3 = UserAccount("sami","hounit","sami@yahoo.com","1234")
        userList.add(0,input1)
        userList.add(1,input2)
        userList.add(2,input3)

        var emailAddress = emailAddress.text
        var password = password.text
        for(user in userList) {
            if (emailAddress.toString() == user.emailId && password.toString() == user.password ){
                val email = User(emailAddress.toString())
                val intent = Intent(this@MainActivity, ShoppingCategoryActivity::class.java)
                intent.putExtra("userEmail", email)
                startActivity(intent)

            }
        }


    }

    fun CreateAccount(view: View) {
        val intent = Intent(this@MainActivity, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun sendEmail(view: View) {
        var input =emailAddress.text.toString()
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, input)
        startActivity(intent)

    }
}




