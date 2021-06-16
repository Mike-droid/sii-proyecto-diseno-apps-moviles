package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AvanceReticularSemestre1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avance_reticular_semestre1)
    }

    fun regresar(v:View) {
        val Ventana:Intent = Intent(this, VentanaSemestres1::class.java)
        startActivity(Ventana)
    }
}