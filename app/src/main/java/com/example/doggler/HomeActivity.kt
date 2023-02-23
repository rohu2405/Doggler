package com.example.doggler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun Vertical(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun Horizontal(view: View) {
        val intent = Intent(this, HorizontalLayout::class.java)
        startActivity(intent)
    }

    fun grid(view: View) {
        val intent = Intent(this, GridLayout::class.java)
        startActivity(intent)
    }
}