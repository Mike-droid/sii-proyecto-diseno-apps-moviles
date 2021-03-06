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

    fun abrirVentanaSemestres2(v:View) {
        val intentoVentanaSemestres2: Intent = Intent(this, VentanaSemestres2::class.java)
        startActivity(intentoVentanaSemestres2)
    }

    fun abrirHorario(v:View) {
        val horario: Intent = Intent(this, Horario::class.java)
        startActivity(horario)
    }
}