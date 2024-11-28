package com.bardaval.broadcastexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BlutoothReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val isblutoothEnabledSetting = intent?.getBooleanExtra("state", false) ?: return
        if (isblutoothEnabledSetting) {
            Toast.makeText(context, "Blutooth Mode Enabled", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Blutooth Mode Disabled", Toast.LENGTH_SHORT).show()
        }
    }
}