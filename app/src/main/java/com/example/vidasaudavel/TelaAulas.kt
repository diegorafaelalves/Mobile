package com.example.vidasaudavel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.vidasaudavel.databinding.ActivityTelaAulasBinding

class TelaAulas : AppCompatActivity() {

    private lateinit var binding: ActivityTelaAulasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTelaAulasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        findViewById<TextView>(com.google.android.material.R.id.header_title).text = getString(R.string.Quadrodeaulas)

        binding.icVoltar.setOnClickListener {
            val voltarTelaPrincipal = Intent(this, MainActivity::class.java)
            startActivity(voltarTelaPrincipal)
        }
    }
}