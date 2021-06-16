package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VentanaSemestres1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_semestres1)
    }

    fun cerrarVentana (v:View) {
        val intentoCerrarVentanaSemestres1: Intent = Intent(this, Home::class.java)
        startActivity(intentoCerrarVentanaSemestres1)
    }

    fun mostrarMateriasSemestre1(v: View) {
        val pantallaMaterias1: Intent = Intent(this, AvanceReticularSemestre1::class.java)
        startActivity(pantallaMaterias1)
    }
}