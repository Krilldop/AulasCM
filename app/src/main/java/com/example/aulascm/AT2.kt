package com.example.aulascm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        val atividade1Btn: Button = findViewById(R.id.atividade1Btn)
        atividade1Btn.setOnClickListener {
            finish()
        }
    }
}