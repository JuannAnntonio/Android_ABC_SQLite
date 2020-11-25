package com.example.sqlite.juan.pojos

import android.content.ContentValues

class Usuario(
    var id: String,
    var nombre: String,
    var edad: Int,
    var correo: String
) {

    fun toValues(): ContentValues {
        val contentValues = ContentValues(4)
        contentValues.put("id", id)
        contentValues.put("nombre", nombre)
        contentValues.put("edad", edad)
        contentValues.put("correo", correo)
        return contentValues
    }

}