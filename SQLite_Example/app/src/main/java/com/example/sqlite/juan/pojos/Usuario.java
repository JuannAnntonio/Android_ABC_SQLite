package com.example.sqlite.juan.pojos;

import android.content.ContentValues;

public class Usuario {
    private String id;
    private String nombre;
    private Integer edad;
    private String correo;

    public Usuario(String id, String nombre, Integer edad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("id", this.id);
        contentValues.put("nombre", this.nombre);
        contentValues.put("edad", this.edad);
        contentValues.put("correo", this.correo);

        return contentValues;
    }
}
