package com.example.ucannotguess;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumero; // texto onde o número aparece
    Button btnGerar, btnLimpar; // botões

    Random random = new Random(); // gerador de número aleatório

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // liga com o layout XML

        // pega os elementos da tela
        txtNumero = findViewById(R.id.txtNumero);
        btnGerar = findViewById(R.id.btnGerar);
        btnLimpar = findViewById(R.id.btnLimpar);

        // quando clicar no botão gerar
        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = random.nextInt(100); // gera número de 0 a 99
                txtNumero.setText(String.valueOf(numero)); // mostra na tela
            }
        });

        // quando clicar no botão limpar
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText("0"); // volta pro zero
            }
        });
    }
}