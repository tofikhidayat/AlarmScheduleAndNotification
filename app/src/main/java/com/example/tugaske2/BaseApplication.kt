package com.example.tugaske2

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import java.nio.channels.Channel

class BaseApplication  : Application() {
    companion object{
        const val CHANNEL_1_ID = "channel1"
        const val CHANNEL_2_ID = "channel2"
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        //jika versi android beda atau diatasnya
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            //membuat notifikasi channel
            val channel1 = NotificationChannel(
                CHANNEL_1_ID,
                "Channel satu",
                NotificationManager.IMPORTANCE_HIGH
            )
            channel1.description = " ini adalah channel 1"
            val channel2 = NotificationChannel(
                CHANNEL_2_ID,
                "Channel dua",
                NotificationManager.IMPORTANCE_LOW
            )
            channel1.description = " ini adalah channel 2"

            //membuat manager
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(channel1)
            manager?.createNotificationChannel(channel2)
        }
    }
}