package com.example.walmart

import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class User(var emailAddress: String?):
Serializable{

//     var password: String? = null
//    var emailAddress: String?
//     var lastName: String? = null
//    var firstName: String? = null

//    constructor(firstName: String?, lastName: String?, emailAddress: String?, password: String?){
//        this.firstName = firstName
//        this.lastName = lastName
//        this.emailAddress = emailAddress
//        this.password = password
//    }

//private constructor(emailAddress: String?) {
//        this.emailAddress = emailAddress
//    }
    override fun toString(): String {
        return "User(emailAddress=$emailAddress)"
    }
}