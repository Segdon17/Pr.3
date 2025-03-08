package com.example.pr3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Recibir datos de SecondActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0); // Valor por defecto: 0

        // Mostrar datos en los TextView
        TextView tvName = findViewById(R.id.tvName);
        TextView tvAge = findViewById(R.id.tvAge);
        tvName.setText("Name: " + name);
        tvAge.setText("Age: " + age);

        // Botón para regresar a SecondActivity
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual y regresa a SecondActivity
            }
        });
    }
}