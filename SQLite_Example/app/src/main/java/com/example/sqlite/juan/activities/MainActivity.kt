package com.example.sqlite.juan.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.sqlite.juan.R

class MainActivity : AppCompatActivity() {
    var insert: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        insert = findViewById<View>(R.id.insert) as Button
        insert!!.setOnClickListener {
            val intent = Intent(this@MainActivity, InsertActivity::class.java)
            startActivity(intent)
        }
    }
}