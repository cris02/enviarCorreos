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
public class Direccion {
    private Municipio municipio;
    private String noCasa;
    private String calle;
    private String referencia;

    public Direccion() {
    }

    public Direccion(Municipio municipio, String noCasa, String calle, String referencia) {
        this.municipio = municipio;
        this.noCasa = noCasa;
        this.calle = calle;
        this.referencia = referencia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getNoCasa() {
        return noCasa;
    }

    public void setNoCasa(String noCasa) {
        this.noCasa = noCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return  "\nMunicipio= " + municipio.toString() + "\nCasa= " + noCasa + "\nCalle= " + calle + "\nReferencia= " + referencia;
    }
    
    
    
}
