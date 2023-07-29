package com.example.loginandregistrationscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.loginandregistrationscreen.Utils.Utils
import com.example.loginandregistrationscreen.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var gender :String

    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolBar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnSignup.setOnClickListener {
            var fName = binding.etFName.text.toString().trim()
            var lName = binding.etLName.text.toString().trim()
            var password = binding.etPassword.text.toString().trim()
            var cPassword = binding.etCPassword.text.toString().trim()
            var contact = binding.etContact.text.toString().trim()
            var email = binding.etEmail.text.toString().trim()


            resetError()


            if (fName.isEmpty()) {
                setError(binding.etFName, "First Name")
            } else if (lName.isEmpty()) {
                setError(binding.etLName, "Last Name")
            } else if (!Utils.isValidEmail(email)) {
                setError(binding.etEmail, "Enter Email")
            } else if (!Utils.isValidContact(contact)) {
                setError(binding.etContact, "Enter Contact")
            } else if (!Utils.isValidPasssword(password)) {
                setError(binding.etPassword, "Enter Valid Password")
            } else if (password != cPassword) {
                setError(binding.etCPassword, "Password doesn't match")
            }else if(!binding.chkTerms.isChecked){
               Toast.makeText(this,"Please Check Terms and Condition",Toast.LENGTH_SHORT).show()
            }
            else {
                var intent = Intent(this, SignupDetail::class.java)
                intent.putExtra("FNAME", fName)
                intent.putExtra("LNAME", lName)
                intent.putExtra("EMAIL",email)
                intent.putExtra("CONTACT", contact)
                intent.putExtra("PASSWORD", password)
                intent.putExtra("GENDER",gender)

                startActivity(intent)
            }
        }
    }

    private fun setError(editText: EditText? = null, message: String) {

        if (editText != null) {

            editText!!.setBackgroundResource(R.drawable.error_background)
            editText.requestFocus()
        }
    }

    private fun resetError() {

        binding.etFName.setBackgroundResource(R.drawable.et_background)
        binding.etLName.setBackgroundResource(R.drawable.et_background)
        binding.etEmail.setBackgroundResource(R.drawable.et_background)
        binding.etContact.setBackgroundResource(R.drawable.et_background)
        binding.etPassword.setBackgroundResource(R.drawable.et_background)
        binding.etCPassword.setBackgroundResource(R.drawable.et_background)

    }

    fun onRadioButtonClicked(view: View) {

        when(view.id){

            R.id.rb_male->gender="MALE"
            R.id.rb_female->gender="FEMALE"
            R.id.rb_others->gender="OTHERS"

        }

    }


}