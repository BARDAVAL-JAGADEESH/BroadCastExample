package com.bardaval.broadcastexample

import android.content.IntentFilter
import android.media.AudioManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SilentActivity : AppCompatActivity() {
    lateinit var receiver: SilentModeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silent_layout)

        receiver = SilentModeReceiver()

        IntentFilter(AudioManager.RINGER_MODE_CHANGED_ACTION).also { intentFilter ->
            registerReceiver(receiver, intentFilter)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}
