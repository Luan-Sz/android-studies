package com.example.ucannotguess;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumero; 
    Button btnGerar, btnLimpar; 

    Random random = new Random(); 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        
        txtNumero = findViewById(R.id.txtNumero);
        btnGerar = findViewById(R.id.btnGerar);
        btnLimpar = findViewById(R.id.btnLimpar);

        
        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = random.nextInt(100); 
                txtNumero.setText(String.valueOf(numero)); 
            }
        });

        
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText("0"); 
            }
        });
    }
}
