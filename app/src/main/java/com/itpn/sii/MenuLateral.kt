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
}