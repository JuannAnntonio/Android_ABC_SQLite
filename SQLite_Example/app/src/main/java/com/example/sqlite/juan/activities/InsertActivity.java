package com.example.sqlite.juan.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqlite.juan.R;
import com.example.sqlite.juan.helpers.Data;
import com.example.sqlite.juan.pojos.Usuario;

public class InsertActivity extends AppCompatActivity {

    EditText id,nombre,edad,correo;
    Button insert;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        id =(EditText) findViewById(R.id.id);
        nombre =(EditText) findViewById(R.id.nombre);
        edad =(EditText) findViewById(R.id.edad);
        correo =(EditText) findViewById(R.id.correo);
        insert =(Button) findViewById(R.id.insert);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario user = new Usuario(id.getText().toString(),nombre.getText().toString(),
                        Integer.valueOf(edad.getText().toString()),correo.getText().toString());

                data = new Data(getApplicationContext());
                data.insertUsuario(user);
                Toast.makeText(getApplicationContext(),
                        "Se agrego el Usuario " + id.getText().toString(),
                        Toast.LENGTH_LONG).show();
                data.close();
            }
        });
    }
}