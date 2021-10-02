package com.example.walmart

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.password
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    var userList = arrayListOf<UserAccount>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   }

    fun SignIn(view: View) {
//        var userList = arrayListOf<UserAccount>()
//
        var input1 = UserAccount("aziza","hounit","aziza@yahoo.com","1234")
        var input2 = UserAccount("sara","hounit","sara@yahoo.com","1234")
        var input3 = UserAccount("sami","hounit","sami@yahoo.com","1234")
        var input5 = UserAccount("sofa","san","s@yahoo.com","1234")
        var input6 = UserAccount("kali","ko","k@yahoo.com","1234")


        userList.add(input1)
        userList.add(input2)
        userList.add(input3)
        userList.add(input5)
        userList.add(input6)

        var emailAddress = emailAddress.text
        var password = password.text
        for(user in userList) {
            if (emailAddress.toString() == user.emailId && password.toString() == user.password) {
                val email = User(emailAddress.toString())
                val intent = Intent(this@MainActivity, ShoppingCategoryActivity::class.java)
                intent.putExtra("userEmail", email)
                startActivity(intent)

            }
        }
    }

    fun CreateAccount(view: View) {
        val intent = Intent(this@MainActivity, RegisterActivity::class.java)
//        startActivity(intent)
        startActivityForResult(intent,1)
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK) {
                success?.setTextColor(Color.RED)
                val firstName = data!!.getStringExtra("firstName")
                val lastName = data.getStringExtra("lastName")
                val email = data.getStringExtra("email")
                val pass = data.getStringExtra("password")
                var input4 = UserAccount(firstName.toString(),lastName.toString(),email.toString(),pass.toString())
                userList.add(input4)


//                success?.text = email.toString()

            }

            }
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




//private fun <E> ArrayList<E>.add(element: String) {
//
//}




