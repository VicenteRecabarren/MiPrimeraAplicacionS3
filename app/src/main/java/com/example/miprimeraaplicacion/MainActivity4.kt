package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val spMenu: Spinner = findViewById(R.id.sp_menu)
        val btnMenu: Button = findViewById(R.id.btn_menu)
        val lvMenu: ListView = findViewById(R.id.lv_menu)


        /**
         * Declaramos un array list menu
         */

        val opcionesSpinner = arrayOf(
            "sumar"
            ,"Restar"
            ,"Multiplicar"
            ,"Hola Mundo"
            ,"Dividir"
        )

        //adaptador de Array
        val adaptador = ArrayAdapter(this //contexto
                , android.R.layout.simple_list_item_1 //elementos listview
                , opcionesSpinner)//objeto spinner

        //
        spMenu.adapter = adaptador

        val opcionesListView = arrayOf(
            "uno"
            ,"dos"
            ,"tres"
            ,"cuatro"
            ,"cinco"
            ,"seis"
            ,"siete"
            ,"ocho"
            ,"nueve"
            ,"diez"
        )

        val adaptador2 = ArrayAdapter(this
            , android.R.layout.simple_list_item_1
            , opcionesListView)
        lvMenu.adapter = adaptador2

        btnMenu.setOnClickListener {
            //leo el elemento seleccionado del spinner o listview
            var str_op_selected = spMenu.selectedItem.toString()

            // toast (popup) pasando el elemento seleccionado
            val toast = Toast.makeText(this,str_op_selected
                , Toast.LENGTH_SHORT)// in Activity
            toast.show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}