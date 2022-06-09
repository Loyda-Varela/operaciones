package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btnsuma, btnresta, btndivision, btnmultiplicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
        btndivision = (Button) findViewById(R.id.btndivision);

        //Levantar el evento de escucha
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int v1 = Integer.valueOf(txtnum1.getText().toString());
                int v2 = Integer.valueOf(txtnum2.getText().toString());
                int suma = v1+v2;
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("resultado", "La suma es: " + suma);
                startActivity(intent);

            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int v1 = Integer.valueOf(txtnum1.getText().toString());
                int v2 = Integer.valueOf(txtnum2.getText().toString());
                int resta = v1-v2;
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("resultado", "La Resta es: " + resta);
                startActivity(intent);

            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int v1 = Integer.valueOf(txtnum1.getText().toString());
                int v2 = Integer.valueOf(txtnum2.getText().toString());
                int multi = v1*v2;
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("resultado", "La Multiplicacion es: " + multi);
                startActivity(intent);

            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int v1 = Integer.valueOf(txtnum1.getText().toString());
                int v2 = Integer.valueOf(txtnum2.getText().toString());
                int division = v1/v2;
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("resultado", "La Division es: " + division);
                startActivity(intent);

            }
        });

    }
}