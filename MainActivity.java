package com.example.kalkulator_sederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bil1, bil2, operasi;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.bil1);
        bil2 = findViewById(R.id.bil2);
        operasi = findViewById(R.id.operasi);
        hitung = findViewById(R.id.hitung);
        hasil = findViewById(R.id.hasil);

    }

    public void button(View v){
        int bilangan1 = Integer.parseInt(bil1.getText().toString());
        int bilangan2 = Integer.parseInt(bil2.getText().toString());
        String Operasi = operasi.getText().toString();
        int hasill;

        if (Operasi.equals("-")){
            hasill = bilangan1 - bilangan2;
            hasil.setText(String.valueOf(hasill));
        }else if (Operasi.equals("+")){
            hasill = bilangan1 + bilangan2;
            hasil.setText(String.valueOf(hasill));
        }else if (Operasi.equals("*")){
            hasill = bilangan1 * bilangan2;
            hasil.setText(String.valueOf(hasill));
        }else if (Operasi.equals("/")){
            hasill = bilangan1 / bilangan2;
            hasil.setText(String.valueOf(hasill));
        }else{
            hasil.setText("OPERASI ARITMATIKA TIDAK SESUAI");
        }
    }
}