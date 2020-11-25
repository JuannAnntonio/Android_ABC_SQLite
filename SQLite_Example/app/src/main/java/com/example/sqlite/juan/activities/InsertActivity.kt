package com.example.sqlite.juan.activities

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sqlite.juan.R
import com.example.sqlite.juan.helpers.Data
import com.example.sqlite.juan.pojos.Usuario

class InsertActivity : AppCompatActivity() {
    var id: EditText? = null
    var nombre: EditText? = null
    var edad: EditText? = null
    var correo: EditText? = null
    var insert: Button? = null
    var data: Data? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        id = findViewById<View>(R.id.id) as EditText
        nombre = findViewById<View>(R.id.nombre) as EditText
        edad = findViewById<View>(R.id.edad) as EditText
        correo = findViewById<View>(R.id.correo) as EditText
        insert = findViewById<View>(R.id.insert) as Button

        insert!!.setOnClickListener {
            val user = Usuario(
                id!!.text.toString(),
                nombre!!.text.toString(),
                Integer.valueOf(edad!!.text.toString()),
                correo!!.text.toString()
            )
            data = Data(applicationContext)
            data!!.insertUsuario(user)
            Toast.makeText(
                applicationContext,
                "Se agrego el Usuario " + id!!.text.toString(),
                Toast.LENGTH_LONG
            ).show()
            data!!.close()
        }
    }
}