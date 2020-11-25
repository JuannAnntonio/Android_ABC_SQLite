package com.example.sqlite.juan.helpers

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context: Context?) :
    SQLiteOpenHelper(context, Constants.DB, null, 1) {

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        sqLiteDatabase.execSQL(Constants.create_table_usuarios)
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {
        sqLiteDatabase.execSQL(Constants.delete_table_usuarios)
        onCreate(sqLiteDatabase)
    }
}