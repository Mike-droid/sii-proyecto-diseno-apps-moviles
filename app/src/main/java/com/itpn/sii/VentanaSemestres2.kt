package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VentanaSemestres2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_semestres2)
    }

    fun cerrarVentana (v: View) {
        val intentoCerrarVentanaSemestres2: Intent = Intent(this, Home::class.java)
        startActivity(intentoCerrarVentanaSemestres2)
    }

    fun mostrarCalificacionesSemestre1 (v:View) {
        val abrirCalificacionesSemestre1: Intent = Intent(this, CalificacionesSemestre1::class.java)
        startActivity(abrirCalificacionesSemestre1)
    }
}