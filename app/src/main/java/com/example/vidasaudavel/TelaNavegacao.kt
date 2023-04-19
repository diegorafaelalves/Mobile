package com.example.vidasaudavel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.vidasaudavel.databinding.ActivityMainBinding
import com.example.vidasaudavel.databinding.ActivityTelaNavegacaoBinding

class TelaNavegacao : AppCompatActivity() {

    private lateinit var binding: ActivityTelaNavegacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaNavegacaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        findViewById<TextView>(com.google.android.material.R.id.header_title).text = getString(R.string.Localização)

        binding.icLocalizacao.setOnClickListener {
            val navegarTelaAulas = Intent(this,TelaAulas::class.java)
            startActivity(navegarTelaAulas)
        }


    }
}




