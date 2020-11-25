package com.example.sqlite.juan.helpers

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.sqlite.juan.pojos.Usuario

class Data(private val context: Context) {
    private var sqLiteDatabase: SQLiteDatabase
    private val sqLiteOpenHelper: SQLiteOpenHelper
    fun open() {
        sqLiteDatabase = sqLiteOpenHelper.writableDatabase
    }

    fun close() {
        sqLiteOpenHelper.close()
    }

    fun insertUsuario(user: Usuario) {
        sqLiteDatabase.insert("usuarios", null, user.toValues())
    }

    init {
        sqLiteOpenHelper = DataBaseHelper(context)
        sqLiteDatabase = sqLiteOpenHelper.writableDatabase
    }
}