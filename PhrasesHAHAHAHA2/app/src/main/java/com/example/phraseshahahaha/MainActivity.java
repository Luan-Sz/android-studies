package com.example.phraseshahahaha;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtFrase; // mostra a frase
    Button btnGerar; // botão
    ImageView imgFrase; // imagem

    Random random = new Random();

    // frases
    String[] frases = {
            "Johnny Mãos de Prata",
            "Say my name",
            "Eu acredito que exista um herói em cada um de nós",
            "Sábias palavras, Mestre Yoda",
            "Around the \"Hello World!\"",
            "Esta frase ficou em sexto lugar",
            "Psycho",
            "EU SOU O LISAN AL GAIB (aprendi o \"Hello World\" em Java)",
            "Meu cérebro doendo para fazer os meus trabalhos",
            "Eu me divirto"
    };

    // imagens (tem que bater com as frases)
    int[] imagens = {
            R.drawable.cyberpunk_meme,
            R.drawable.ozzymandis,
            R.drawable.spideman,
            R.drawable.yodamn,
            R.drawable.dajunk,
            R.drawable.incesto,
            R.drawable.nightmare,
            R.drawable.lisan,
            R.drawable.spiderman_2,
            R.drawable.spiderman_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFrase = findViewById(R.id.txtFrase);
        btnGerar = findViewById(R.id.btnGerar);
        imgFrase = findViewById(R.id.imgFrase);

        // clique do botão
        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = random.nextInt(frases.length); // escolhe posição

                txtFrase.setText(frases[index]); // muda frase
                imgFrase.setImageResource(imagens[index]); // muda imagem
            }
        });
    }
}