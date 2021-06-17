package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CalificacionesSemestre1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calificaciones_semestre1)
    }

    fun cerrarVentana (v: View) {
        val intentoCerrarCalificacionesSemestre1: Intent = Intent(this, Home::class.java)
        startActivity(intentoCerrarCalificacionesSemestre1)
    }
}