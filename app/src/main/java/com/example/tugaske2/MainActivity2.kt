package com.example.tugaske2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnEdit = findViewById<Button>(R.id.btnEdit) //membuat toast
        btnEdit.setOnClickListener {
            Toast.makeText(this@MainActivity2, "input cannot be empty", Toast.LENGTH_SHORT).show()
        }

        val Notif = findViewById<Button>(R.id.btnnotifikasi) //perpindahan notification activity
        Notif.setOnClickListener{
            Toast.makeText(this@MainActivity2, "success", Toast.LENGTH_SHORT).show()
            intent = Intent(this,MainActivityNotification::class.java)
            startActivity(intent)

        val Alarm = findViewById<Button>(R.id.btnalarm) //perpindahan alarm activity
        Alarm.setOnClickListener{
            Toast.makeText(this@MainActivity2, "success", Toast.LENGTH_SHORT).show()
            intent = Intent(this,AlarmActivity::class.java)
            startActivity(intent)

        val btnKembali = findViewById<Button>(R.id.btnKembali) //button back activity
        btnKembali.setOnClickListener{
            Toast.makeText(this@MainActivity2, "back to profil", Toast.LENGTH_SHORT).show()
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}}}
