import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.somatorionumeros.R

class SomaActivity : AppCompatActivity() {
    private lateinit var number1: EditText
    private lateinit var number2: EditText
    private lateinit var button: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soma_valores)

        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        button = findViewById(R.id.button)
        result = findViewById(R.id.result)


        button.setOnClickListener {
            val num1 = number1.text.toString().toFloat()
            val num2 = number2.text.toString().toFloat()
            val resultado = num1 + num2
            result.text = "Resultado: $resultado"

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}

