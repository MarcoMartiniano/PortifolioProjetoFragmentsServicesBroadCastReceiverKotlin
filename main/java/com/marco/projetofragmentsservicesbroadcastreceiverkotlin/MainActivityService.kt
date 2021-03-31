package com.marco.projetofragmentsservicesbroadcastreceiverkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivityService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_service)
    }

    fun LigarAudio(view: View?) {
        val intent = Intent(this, AudioService::class.java)
        startService(intent)
    }

    fun DesligarAudio(view: View?) {
        val intent = Intent(this, AudioService::class.java)
        stopService(intent)
    }

    fun VoltarMenu2(view: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}