/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.enviarcorreos.main;

import com.cursojava.enviarcorreos.entities.Cliente;
import com.cursojava.enviarcorreos.entities.Departamento;
import com.cursojava.enviarcorreos.entities.Municipio;
import com.cursojava.enviarcorreos.propiedades.ConfigProperties;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aguilar
 */
public class CargarInformacion {

    // listas para cargar la informacion
    private List<Departamento> listDeptos = new ArrayList<>();
    private List<Municipio> listMunis = new ArrayList<>();
    private List<Cliente> listCliente = new ArrayList<>();
    private Properties propiedadesSistema;
    private final String ARCHIVO_PROPS = "config.properties";

    // metodo para procesar la informacion
    public void llenarDatos() {
        //llenar la lista de departamentos
        Departamento sanSalavdor = new Departamento("San Salavdor", "-89.5625", "13.258945");
        Departamento santaAna = new Departamento("Santa Ana", "-29.5625", "33.258945");

        //agregar los deptos a la lista
        listDeptos.add(sanSalavdor);
        listDeptos.add(santaAna);

        // llenar la lista de municipios
        // agregar los minicipios
        listMunis.add(new Municipio("Mejicanos", "12.2568", "45.2356", sanSalavdor));
        listMunis.add(new Municipio("San marcos", "59.2568", "36.2356", sanSalavdor));
        listMunis.add(new Municipio("San Salvador", "58.2568", "89.2356", sanSalavdor));
        listMunis.add(new Municipio("Coatepeque", "10.2568", "11.2356", santaAna));
        listMunis.add(new Municipio("Congo", "10.2568", "11.2356", santaAna));
        listMunis.add(new Municipio("Chalchuapa", "10.2568", "11.2356", santaAna));
        
        //cargar las propiedades del sistema
        propiedadesSistema = new Properties();
        try {
            propiedadesSistema.load(ConfigProperties.getResourceAsInputStream(ARCHIVO_PROPS));
        } catch (IOException ex) {
            Logger.getLogger(CargarInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Departamento> getListDeptos() {
        return listDeptos;
    }

    public List<Municipio> getListMunis() {
        return listMunis;
    }

    public List<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public Properties getPropiedadesSistema() {
        return propiedadesSistema;
    }
    
}
