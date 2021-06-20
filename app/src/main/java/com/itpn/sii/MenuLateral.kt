package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuLateral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_lateral)
    }

    fun cerrarMenu(v: View){
        val intentoMenu: Intent = Intent(this, Home::class.java)
        startActivity(intentoMenu)
    }

    fun cerrarSesion(v:View) {
        val intentoCerrarSesion: Intent = Intent(this, MainActivity::class.java)
        startActivity(intentoCerrarSesion)
    }

    fun abrirDatosEmergencia(v:View) {
        val datosEmergencia: Intent = Intent(this, DatosEmergencia::class.java)
        startActivity(datosEmergencia)
    }

    fun abrirDatosGenerales(v: View) {
        val datosGenerales: Intent = Intent(this, DatosGenerales::class.java)
        startActivity(datosGenerales)
    }

    fun abrirDatosSocioeconomicos(v:View) {
        val datosSocioEconomicos: Intent = Intent(this,DatosSocioEconomicos1::class.java)
        startActivity(datosSocioEconomicos)
    }
}