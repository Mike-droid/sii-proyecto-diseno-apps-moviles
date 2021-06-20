package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class DatosSocioeconomicos3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_socioeconomicos3)

        val spinnerDepender: Spinner = findViewById(R.id.depeder_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.dependes,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerDepender.adapter = adapter
        }

        val spinnerCasa: Spinner = findViewById(R.id.casa_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.casa,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCasa.adapter = adapter
        }
    }

    fun abrirHome(v: View) {
        val Home: Intent = Intent(this, Home::class.java)
        startActivity(Home)
    }
}