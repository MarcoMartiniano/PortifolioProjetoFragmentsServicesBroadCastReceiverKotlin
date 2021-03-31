package com.marco.projetofragmentsservicesbroadcastreceiverkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivityFragments : AppCompatActivity() {
    val fragmento1 = Fragmento1()
    val fragmento2 = Fragmento2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragments)
        MetodosetarFragmento(fragmento1)

    }
    public fun frag1(view: View) {
        MetodosetarFragmento(fragmento1)
    }

    public fun frag2(view: View) {
        MetodosetarFragmento(fragmento2)
    }



    public fun VoltarMenu(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }



    fun MetodosetarFragmento(frag: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment,frag).
            commit()
        }

    }
}