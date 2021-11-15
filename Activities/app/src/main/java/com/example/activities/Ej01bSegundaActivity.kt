package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activities.databinding.ActivityEj01bSegundaBinding

class Ej01bSegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj01bSegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj01bSegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.extras != null) {
            val mensaje = intent.extras?.getString(MENSAJE)
            val numero = intent.extras?.getInt(NUMERO)

            binding.textView.text =
                "Datos recibidos:\nMensaje: $mensaje\nNúmero: $numero"

        }

        binding.btnVolver.setOnClickListener {
            startActivity(Intent(this, Ej01IntentsExplicitosActivity::class.java))
        }


    }

}