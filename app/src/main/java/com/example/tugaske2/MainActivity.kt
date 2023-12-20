package com.example.tugaske2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Perpindahan = findViewById<Button>(R.id.btn_input) //perpindahan activity
        Perpindahan.setOnClickListener{
            Toast.makeText(this@MainActivity, "success", Toast.LENGTH_SHORT).show()
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val btnIg = findViewById<Button>(R.id.btn_instagram) //perpindahan ig
        btnIg.setOnClickListener {
            val url = "https://instagram.com/tofikhyt?igshid=OGQ5ZDc2ODk2ZA=="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val btnNomer = findViewById<Button>(R.id.btn_phone) //perpindahan nomer
        btnNomer.setOnClickListener {
            val phoneNumber = "081343119909"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }
    }
}