package com.example.walmart
import java.io.Serializable;
class UserAccount(var firstName: String?, var lastName: String?, var emailId: String?, var password:String?) :
    Serializable {
    var firstName1 : String?
    get(){
        return firstName
    }
        set(value) {}

//    override fun toString(): String {
//        return "UserAccount(firstName=$firstName, lastName=$lastName, emailId=$emailId, password=$password)"
//    }
}
