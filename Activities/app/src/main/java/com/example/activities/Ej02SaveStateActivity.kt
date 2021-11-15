/** https://developer.android.com/guide/components/activities/activity-lifecycle */

package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activities.databinding.ActivityEj02SaveStateBinding


private const val KEY_CONTADOR = "contador"

class Ej02SaveStateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj02SaveStateBinding
    private var contador =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj02SaveStateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            contador++
            displayContador()
        }

    }

    private fun displayContador() {
        binding.textView.text = "$contador"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_CONTADOR, contador)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contador = savedInstanceState.getInt(KEY_CONTADOR)
        displayContador()
    }

}