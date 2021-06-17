package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class DatosEmergencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_emergencia)

        val spinnerTiposDeSangre: Spinner = findViewById(R.id.tipo_de_sangre_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.tipos_de_sangre,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTiposDeSangre.adapter = adapter
        }

        val estadosDeMexicoSpinner: Spinner = findViewById(R.id.estados_mexico_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.estados_mexico,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            estadosDeMexicoSpinner.adapter = adapter
        }

        val ciudadesDeCoahuilaSpinner: Spinner = findViewById(R.id.ciudadeds_de_coahuila_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.ciudades_coahuila,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            ciudadesDeCoahuilaSpinner.adapter = adapter
        }

        val codigosPostalesPiedrasNegrasSpinner: Spinner = findViewById(R.id.cp_piedras_negras_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.cp_piedras_negras,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            codigosPostalesPiedrasNegrasSpinner.adapter = adapter
        }
    }

    fun cerrarDatosEmergencia(v: View) {
        val intentoHome: Intent = Intent(this, Home::class.java)
        startActivity(intentoHome)
    }
}