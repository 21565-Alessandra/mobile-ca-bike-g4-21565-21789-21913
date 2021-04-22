package com.taianesilva.sharedbike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {
    lateinit var displayUser: TextView
    lateinit var welcomeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val preferences = getSharedPreferences("DATA_USER", MODE_PRIVATE)
        val user = preferences.getString("display", "")

        displayUser = findViewById(R.id.userTextView);
        welcomeText = findViewById(R.id.textViewWelcome)

        displayUser.text = user
        welcomeText.text = "Welcome"


    }
}