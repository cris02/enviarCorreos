/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.enviarcorreos.entities;

/**
 *
 * @author Aguilar
 */
public class Municipio {
    private String nombre;
    private String latitud;
    private String longitud;
    private Departamento departamento;

    public Municipio() {
    }

    public Municipio(String nombre, String latitud, String longitud, Departamento departamento) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
