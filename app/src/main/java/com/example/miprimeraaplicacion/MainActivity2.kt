package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val txUsuario:TextView = findViewById(R.id.id_usuario_logueado)
        val recibirUsernameS = intent.getStringExtra("par_usern")

        txUsuario.text = recibirUsernameS.toString()

        val btnCalculadora:Button = findViewById(R.id.btn_calculadora)

        btnCalculadora.setOnClickListener {
            val nuevaVentana = Intent(this, MainActivity3::class.java)
            startActivity(nuevaVentana)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}