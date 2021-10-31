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
public class EncriptacionTexto {
    private static final String LLAVE_VAL = "";
    BasicTextEncryptor encriptador;
    
    //inicializar los contructores por defecto
    public EncriptacionTexto(String principalValor){
        encriptador = new BasicTextEncryptor();
        if(principalValor == null || principalValor.length() == 0)
            principalValor = LLAVE_VAL;
        
        encriptador.setPassword(principalValor);
    }
    
    public EncriptacionTexto(){
        encriptador = new BasicTextEncryptor();
        encriptador.setPassword(LLAVE_VAL);
    }
    
    // metodos para encriptar
    public String getEncriptarTexto(String texto){
        return encriptador.encrypt(texto);
    }
    
    public String getDesencriptarTexto(String texto){
        return encriptador.decrypt(texto);
    }
    
}
