package com.marco.projetofragmentsservicesbroadcastreceiverkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    public fun ActivityService(view:View){
    val intent = Intent(this,MainActivityService::class.java)
    startActivity(intent)

    }
    public fun ActivityBroadcastReceiver(view:View){
        Toast.makeText(this, "BROADCAST SETADO PARA INICIAR APP NO BOOT DO SMARTPHONE", Toast.LENGTH_LONG).show()
    }


    public fun ActivityFragments(view:View){
        val intent = Intent(this, MainActivityFragments::class.java)
        startActivity(intent)
        finish()

    }
    public fun Sair (view:View){
        finish()
    }

}