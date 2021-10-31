/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.enviarcorreos.propiedades;

import java.io.InputStream;

/**
 *
 * @author Aguilar
 */
public class ConfigProperties {
    public static InputStream getResourceAsInputStream(String name){
        return ConfigProperties.class.getResourceAsStream(name);
    }
}
