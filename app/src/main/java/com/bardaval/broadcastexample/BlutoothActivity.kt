package com.bardaval.broadcastexample

import android.bluetooth.BluetoothAdapter
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BlutoothActivity : AppCompatActivity() {
    lateinit var receiver: BlutoothReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blutooth)

        receiver = BlutoothReceiver()

        // Register receiver for Bluetooth state changes
        IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED).also { intentFilter ->
            registerReceiver(receiver, intentFilter)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}
