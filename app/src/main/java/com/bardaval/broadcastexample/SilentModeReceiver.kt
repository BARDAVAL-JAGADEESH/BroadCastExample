package com.bardaval.broadcastexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.widget.Toast

class SilentModeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == AudioManager.RINGER_MODE_CHANGED_ACTION) {
            val audioManager = context?.getSystemService(Context.AUDIO_SERVICE) as? AudioManager
            when (audioManager?.ringerMode) {
                AudioManager.RINGER_MODE_SILENT -> {
                    Toast.makeText(context, "Phone is in Silent Mode", Toast.LENGTH_SHORT).show()
                }
                AudioManager.RINGER_MODE_VIBRATE -> {
                    Toast.makeText(context, "Phone is in Vibrate Mode", Toast.LENGTH_SHORT).show()
                }
                AudioManager.RINGER_MODE_NORMAL -> {
                    Toast.makeText(context, "Phone is in Normal Mode", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
