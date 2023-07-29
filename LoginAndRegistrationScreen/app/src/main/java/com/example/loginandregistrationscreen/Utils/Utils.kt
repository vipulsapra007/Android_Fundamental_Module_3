package com.example.loginandregistrationscreen.Utils

import android.util.Patterns
import androidx.activity.result.contract.ActivityResultContracts
import java.util.regex.Pattern

class Utils {
    companion object{
        fun isValidContact(contact:String):Boolean{
            return contact.length==10
        }

        fun isValidEmail(email:String):Boolean{
            return Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
        fun isValidPasssword(password:String):Boolean{

            val regex = ("^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$")

            return Pattern.matches(regex, password)

        }
    }
}