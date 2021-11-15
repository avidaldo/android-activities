/**
 * https://developer.android.com/training/basics/firstapp/starting-activity
 * https://developer.android.com/guide/components/intents-filters
 */

package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activities.databinding.ActivityEj01IntentsExplicitosBinding


const val NUMERO = "numero"
const val MENSAJE = "mensaje"

class Ej01IntentsExplicitosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj01IntentsExplicitosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj01IntentsExplicitosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Botón que cambia de activity sin pasar datos */
        binding.btnCambioActitivitySinDatos.setOnClickListener {
            startActivity(Intent(this, Ej01bSegundaActivity::class.java))
        }

        /* Botón que cambia de activity enviando información */
        binding.btnCambioActitivityConDatos.setOnClickListener {
            startActivity(Intent(this, Ej01bSegundaActivity::class.java).apply {
                putExtra(NUMERO, 42)
                putExtra(MENSAJE, binding.editText.text.toString()) // Enviando el contenido del EditText
            })
        }


    }

}