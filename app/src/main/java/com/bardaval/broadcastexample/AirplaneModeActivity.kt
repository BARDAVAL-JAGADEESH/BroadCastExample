package com.bardaval.broadcastexample

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AirplaneModeActivity : AppCompatActivity() {
    lateinit var receiver: AirplaneChanegeReciver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airplane_mode)

        receiver = AirplaneChanegeReciver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also { intentFilter ->
            registerReceiver(receiver, intentFilter)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}
