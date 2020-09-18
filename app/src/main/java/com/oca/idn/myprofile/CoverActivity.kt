package com.oca.idn.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cover.*

class CoverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover)

        btnCheck.setOnClickListener {
            val intent = Intent (this, Second ::class.java)
            startActivity(intent)
        }
    }
}