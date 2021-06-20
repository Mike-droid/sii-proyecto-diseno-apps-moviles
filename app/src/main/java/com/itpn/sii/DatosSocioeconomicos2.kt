package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DatosSocioeconomicos2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_socioeconomicos2)
    }

    fun abrirHome(v: View) {
        val Home: Intent = Intent(this, Home::class.java)
        startActivity(Home)
    }

    fun abrirDatosSocioeconomicos3(v: View) {
        val ds3: Intent = Intent(this,DatosSocioeconomicos3::class.java)
        startActivity(ds3)
    }
}