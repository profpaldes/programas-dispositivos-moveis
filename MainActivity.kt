/*codigo para ser usado na Aula4
Atencao: ao inves de .aula 4 na linha 9, coloque com.example.nomeDoSeuProjeto
No Android Studio Narwhal, procure o nomeDoSeuProjeto da seguinte forma:
1) No painel esquerdo, expanda a pasta "app"
2) Expanda a pasta "java"
3) Você verá uma ou mais pastas com o nome do pacote do seu projeto (exemplo: "com.seuprojeto.marketplaceconecta")
*/

package com.example.aula4 
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Calcular a média
        val num1 = 7
        val num2 = 8
        val media = (num1 + num2) / 2.0
        // Atualizar o TextView
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)
        resultadoTextView.text = "A média de $num1 e $num2 é $media"
    }
}
