package com.chanidar.radar

import android.app.Service
import android.content.Intent
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.os.IBinder

class RadarExtensionService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    // Chanidar Tone Configuration Engine
    private val appEnabled = true
    private val appFreq1 = 2400
    private val appFreq2 = 2800
    private val appDur = 90

    private val proxEnabled = true
    private val proxFreq = 3200
    private val proxDur = 40

    private val clearEnabled = true
    private val clearFreq1 = 1800
    private val clearFreq2 = 2200
    private val clearDur = 75
}
