package com.borjarnau.tareasemana2;

/**
 * Created by ArnAu on 05/05/2016.
 */
public class Datos {

    private String nombre;
    private String phone;
    private  String email;
    private String dia;
    private  String mes;
    private String año;
    private String descripcion;

    public Datos(String nombre, String phone, String email,String dia,String mes,String año, String descripcion ) {
        this.phone = phone;
        this.nombre = nombre;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
