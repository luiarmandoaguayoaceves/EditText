package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText) findViewById(R.id.txt_nombre);
        etp = (EditText) findViewById(R.id.txt_password);

    }

    //Metodo para el boton
    public void Registrar(View view){
        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

            //.length es para leer la cadena
         if (nombre.length() == 0){
             Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_LONG).show();
         }
         if (password.length() == 0 ){
             Toast.makeText(this, "Debes ingresar una password", Toast.LENGTH_LONG).show();
         }
         if (nombre.length() != 0 && password.length() != 0){
             Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();
         }

    }
}