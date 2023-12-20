package com.example.tugaske2

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivityNotification : AppCompatActivity() {

    private lateinit var notificationmanager : NotificationManagerCompat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_notification)

        //inisialiasi notifikasi
        notificationmanager = NotificationManagerCompat.from(this)
        val buttonSend1 = findViewById<Button>(R.id.btnsend1)
        val buttonSend2 = findViewById<Button>(R.id.btnsend2)
        val editTitle = findViewById<EditText>(R.id.ettitle)
        val editMessage = findViewById<EditText>(R.id.etmessage)

        //button1 seeting
        buttonSend1.setOnClickListener {
            val title = editTitle.text.toString()
            val message = editMessage.text.toString()

            //memanggil notifikasi builder (company object)
            val builder = NotificationCompat.Builder(this, BaseApplication.CHANNEL_1_ID)
            //membuat icon dan setting notifikasi
                .setSmallIcon(R.drawable.ic_smile)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE) //kategori

            //membuat suara alarm untuk dibuider
            val notifPlayer = MediaPlayer.create(this, R.raw.notif)
            notifPlayer.start()
            val notification = builder.build()
            this.notificationmanager.notify(2,notification)
        }

        //button2 seeting
        buttonSend2.setOnClickListener {
            val title = editTitle.text.toString()
            val message = editMessage.text.toString()

            //memanggil notifikasi builder (company object)
            val builder = NotificationCompat.Builder(this, BaseApplication.CHANNEL_2_ID)

                //membuat icon dan setting notifikasi
                .setSmallIcon(R.drawable.ic_smile)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE) //kategori

            //membuat notifikasi untuk dibuider
            val notification = builder.build()
            this.notificationmanager.notify(3, notification)
        }
    }
}
