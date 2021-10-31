/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.enviarcorreos.utilidades;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author Aguilar
 */
public class Encriptacion {
    
    public static void main(String[] args) {
        BasicTextEncryptor encriptador = new BasicTextEncryptor();
        String privateData = "Pas$22Word10";
        encriptador.setPassword(privateData);
        
        // encriptar texto
        String textoEncriptado = encriptador.encrypt("hola");
        System.out.println("Texto encriptado: " + textoEncriptado);
        
        //desecriptar texto
        String textoDesencriptado = encriptador.decrypt(textoEncriptado);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }
    
}
