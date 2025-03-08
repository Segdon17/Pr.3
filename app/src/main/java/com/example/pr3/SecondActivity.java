package com.example.pr3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Recibir datos
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        // Mostrar datos
        TextView textView = findViewById(R.id.textView);
        textView.setText(data);

        // Botón de regreso
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad y regresa a MainActivity
            }
        });

        // Botón para ir a ThirdActivity
        Button btnGoToThird = findViewById(R.id.btnGoToThird);
        btnGoToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("name", "Jose Luis"); // Envía el nombre
                intent.putExtra("age", 20); // Envía la edad
                startActivity(intent);
            }
        });
    }
}
