package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
////////////////////SUMA /////////////////////////
        TextView suma = (TextView) findViewById(R.id.txtresultado);
        suma.setText("");
        suma.setText(getIntent().getExtras().getString("resultado"));

/////////////////// RESTA//////////////////////////////////////////////
        TextView resta = (TextView) findViewById(R.id.txtresultado);
        resta.setText("");
        resta.setText(getIntent().getExtras().getString("resultado"));


        ////////MULTIPLICACION ///////////////////////////////
        TextView multi = (TextView) findViewById(R.id.txtresultado);
        multi.setText("");
        multi.setText(getIntent().getExtras().getString("resultado"));

///////////////// DIVISION ///////////////////////////////
        TextView division = (TextView) findViewById(R.id.txtresultado);
        division.setText("");
        division.setText(getIntent().getExtras().getString("resultado"));

    }
}