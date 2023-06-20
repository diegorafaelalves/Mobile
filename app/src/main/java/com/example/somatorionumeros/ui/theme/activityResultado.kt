import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.somatorionumeros.R

class ResultadoActivity : AppCompatActivity() {
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_valores)

        txtResultado = findViewById(R.id.textresultado)

        val resultado = intent.getIntExtra("resultado", 0)
        txtResultado.text = "Resultado: $resultado"

        val btVoltar = findViewById<Button>(R.id.bt_voltar)
        btVoltar.setOnClickListener {
            IrParaTelaSoma()
        }
    }

    private fun IrParaTelaSoma() {
        val somatela = Intent(this, SomaActivity::class.java)
        startActivity(somatela)
    }
}



