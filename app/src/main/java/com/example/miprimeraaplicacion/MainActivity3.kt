package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.example.miprimeraaplicacion.funciones.OpMatematicas

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        //W3School

        val edNumUno:EditText = findViewById(R.id.ed_numUno)
        val edNumDos:EditText = findViewById(R.id.ed_numDos)
        val txResultado:TextView = findViewById(R.id.tx_resultado)
        val btnOperacion:Button = findViewById(R.id.btn_operacion)


        btnOperacion.setOnClickListener {
            //txResultado.text = "cambiando texto"
            var numeroUno:Int = edNumUno.text.toString().toIntOrNull() ?: 0
            var numeroDos:Int = edNumDos.text.toString().toIntOrNull() ?: 0

            txResultado.text = OpMatematicas.dividirValores(numeroUno, numeroDos)

        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}