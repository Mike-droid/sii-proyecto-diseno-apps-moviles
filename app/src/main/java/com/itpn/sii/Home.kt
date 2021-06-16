package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun abrirMenu(v:View){
        val intentoMenu:Intent = Intent(this, MenuLateral::class.java)
        startActivity(intentoMenu)
    }

    fun abrirVentanaSemestres(v:View) {
        val intentoVentanaSemestres1: Intent = Intent(this, VentanaSemestres1::class.java)
        startActivity(intentoVentanaSemestres1)
    }
}