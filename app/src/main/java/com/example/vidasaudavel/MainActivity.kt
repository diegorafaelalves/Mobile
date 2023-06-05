package com.example.vidasaudavel

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vidasaudavel.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var dbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Cadastro = binding.Cadastro
        val Email = binding.Email
        val Senha = binding.Senha

        dbRef = FirebaseDatabase.getInstance().getReference("Cadastro")

        Cadastro.setOnClickListener {
            val email = Email.text.toString()
            val password = Senha.text.toString()

            if (email.isEmpty()) {
                Email.error = "Por favor insira seu e-mail"
            }
            if (password.isEmpty()) {
                Senha.error = "Por favor insira sua senha"
            } else {

                val reg = dbRef.push().key!!
                val Cadastro = BancoDados( Cadastro = null, Email = null, Senha = null)

                dbRef.child(reg).setValue(Cadastro)
                    .addOnCompleteListener {
                        Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show()

                        Email.text?.clear()
                        Senha.text?.clear()

                    }
                    .addOnFailureListener { err ->
                        Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show()

                    }
            }
        }
                //val intent = Intent(this, MainActivity::class.java)
                //startActivity(intent)

            binding.icNavegar.setOnClickListener {
                val navegarTelaNavegacao = Intent(this, TelaNavegacao::class.java)
                startActivity(navegarTelaNavegacao)
            }

        }

    }























