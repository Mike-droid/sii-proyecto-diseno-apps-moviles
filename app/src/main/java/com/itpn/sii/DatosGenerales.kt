package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class DatosGenerales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_generales)

        val spinnerEntidadFederativa: Spinner = findViewById(R.id.entidad_federativa_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.estados_mexico,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerEntidadFederativa.adapter = adapter
        }

        val spinnerCiudadesCoauhila: Spinner = findViewById(R.id.ciudades_de_coahuila_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.ciudades_coahuila,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCiudadesCoauhila.adapter = adapter
        }

        val spinnerCodigosPostalesPN: Spinner = findViewById(R.id.codigos_postales_pn)
        ArrayAdapter.createFromResource(
            this,
            R.array.cp_piedras_negras,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCodigosPostalesPN.adapter = adapter
        }
    }

    fun cerrarVentanaDatosGenerales(v:View) {
        val intentoHome: Intent = Intent(this, Home::class.java)
        startActivity(intentoHome)
    }
}