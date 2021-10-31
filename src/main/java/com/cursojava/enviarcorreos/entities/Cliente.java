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
public class Cliente {
    private String nombre;
    private short edad;
    private String correo;
    private String telefono;
    private String documento;
    private Direccion direccion;

    public Cliente() {
    }

    public Cliente(String nombre, short edad, String telefono, String documento, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.documento = documento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Informacion:\n" + "Nombre= " + nombre + "\nCorreo= " + correo + "\nDireccion=" + direccion.toString();
    }
    
}
