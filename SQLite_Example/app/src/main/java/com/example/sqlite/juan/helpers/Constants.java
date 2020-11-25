package com.example.sqlite.juan.helpers;

public class Constants {

    public static final String DB = "testDB.db";

    public static final String create_table_usuarios =
            "CREATE TABLE usuarios (" +
                    "id TEXT PRIMARY KEY," +
                    "nombre TEXT," +
                    "edad INT," +
                    "correo TEXT)";

    public static final String delete_table_usuarios =
            "DROP TABLE usuarios";

}
