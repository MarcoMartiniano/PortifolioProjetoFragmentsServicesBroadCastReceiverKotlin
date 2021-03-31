package com.marco.projetofragmentsservicesbroadcastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ExemploBroadCast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_BOOT_COMPLETED == intent!!.action) {
            val it = Intent(context, MainActivity::class.java)
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context!!.startActivity(it)
        }
    }
}