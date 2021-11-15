package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
                when (pos) {
                    /* La entrada 0 se deja vacía ya que si no, sería la seleccionada por defecto y
                        entraríamos directamente en el Ej01 */
                    1 -> startActivity(Intent(this@MainActivity,
                        Ej01IntentsExplicitosActivity::class.java))
                    2 -> startActivity(Intent(this@MainActivity,
                        Ej02SaveStateActivity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }



    }


}