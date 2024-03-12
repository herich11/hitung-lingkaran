package com.hitunglingkaran;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextRadius;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRadius = findViewById(R.id.editTextRadius);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLingkaran();
            }
        });
    }

    private void hitungLingkaran() {
        double radius = Double.parseDouble(editTextRadius.getText().toString());
        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;

        String hasil = "Luas: " + luas + "\nKeliling: " + keliling;
        textViewHasil.setText(hasil);
    }
}
