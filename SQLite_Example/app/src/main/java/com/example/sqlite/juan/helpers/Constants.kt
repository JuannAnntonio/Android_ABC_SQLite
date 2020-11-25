package com.example.sqlite.juan.helpers

object Constants {
    const val DB = "testDB.db"
    const val create_table_usuarios = "CREATE TABLE usuarios (" +
            "id TEXT PRIMARY KEY," +
            "nombre TEXT," +
            "edad INT," +
            "correo TEXT)"
    const val delete_table_usuarios = "DROP TABLE usuarios"
}