package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activities.databinding.ActivityEj02SaveStateBinding


/** Otro modo de mantener el estado ante cambios de orientación, es evitando que la activity
 * vuelva a crearse, para ello podemos utilizar el atributo configChanges en la declaración de la
 * activity en el Manifest, siguiendo "Prevent Activity to recreated" aquí :
 * https://medium.com/android-news/handling-orientation-changes-in-android-7072958c442a
 */


class Ej03PreventRecreationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj02SaveStateBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj02SaveStateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = "${++contador}"
        }
    }

}