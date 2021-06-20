package com.itpn.sii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class DatosSocioEconomicos1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_socio_economicos1)

        val spinnerEstudiosMaximosPadre: Spinner = findViewById(R.id.estudios_maximos_padre_spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.estudios_maximos,
                android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerEstudiosMaximosPadre.adapter = adapter
        }

        val spinnerEstudiosMaximosMadre: Spinner = findViewById(R.id.estudios_maximos_madre_spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.estudios_maximos,
                android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerEstudiosMaximosMadre.adapter = adapter
        }

        val spinnerConQuienVives: Spinner = findViewById(R.id.con_quien_vives_spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.con_quien_vives,
                android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerConQuienVives.adapter = adapter
        }

        val spinnerTrabajoPadre: Spinner = findViewById(R.id.trabajo_padre_spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.ocupacion_laboral,
                android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTrabajoPadre.adapter = adapter
        }

        val spinnerTrabajoMadre: Spinner = findViewById(R.id.trabajo_madre_spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.ocupacion_laboral,
                android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTrabajoMadre.adapter = adapter
        }
    }

    fun abrirHome(v:View) {
        val Home:Intent = Intent(this, Home::class.java)
        startActivity(Home)
    }

    fun abrirDatosSocioeconomicos2(v:View) {
        val ds2:Intent = Intent(this,DatosSocioeconomicos2::class.java)
        startActivity(ds2)
    }
}