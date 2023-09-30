package com.example.quizzers

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ErrosActivity : AppCompatActivity() {

    private lateinit var erroTextView: TextView
    private lateinit var correcaoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erros)

        erroTextView = findViewById(R.id.errosTextView)
        correcaoTextView = findViewById(R.id.correcoesTextView)

        val questoesErradas = intent.getStringArrayListExtra("questoesErradas")
        val correcoes = intent.getStringArrayListExtra("correcoes")

        if (questoesErradas != null && correcoes != null) {
            for (i in questoesErradas.indices) {
                erroTextView.append("Erro ${i + 1}: ${questoesErradas[i]}\n")
                correcaoTextView.append("Correção ${i + 1}: ${correcoes[i]}\n")
            }
        }
    }
}
