package com.taianesilva.sharedbike

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    lateinit var registerName: EditText
    lateinit var registerDateOfBirth: EditText
    lateinit var registerEmail: EditText
    lateinit var registerPassword: EditText
    lateinit var saveButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        registerName = findViewById(R.id.editTextName);
        registerDateOfBirth = findViewById(R.id.editTextDate)
        registerEmail = findViewById(R.id.editTextEmailAddress)
        registerPassword = findViewById(R.id.editTextNewPassword)
        saveButton = findViewById(R.id.saveButton)
        val preferences = getSharedPreferences("DATA_USER", MODE_PRIVATE)

        saveButton.setOnClickListener(View.OnClickListener {
            val editor = preferences.edit()
            editor.putString(registerName.text.toString(), registerName.text.toString())
            editor.apply()
            editor.putString(registerDateOfBirth.text.toString(), registerDateOfBirth.text.toString())
            editor.apply()
            editor.putString(registerEmail.text.toString(), registerEmail.text.toString())
            editor.apply()
            editor.putString(registerPassword.text.toString(), registerPassword.text.toString())
            editor.apply()
            Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show()
            val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(intent)
        })
    }
}