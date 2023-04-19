package com.example.vidasaudavel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.vidasaudavel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        findViewById<TextView>(com.google.android.material.R.id.header_title).text = getString(R.string.Email)
        findViewById<TextView>(com.google.android.material.R.id.header_title).text = getString(R.string.Senha)


        binding.icNavegar.setOnClickListener{
            val navegarTelaNavegacao = Intent(this,TelaNavegacao:: class.java)
            startActivity(navegarTelaNavegacao)
        }

    }
}