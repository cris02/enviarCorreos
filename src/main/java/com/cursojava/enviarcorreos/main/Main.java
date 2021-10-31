/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.enviarcorreos.main;

import com.cursojava.enviarcorreos.entities.Cliente;
import com.cursojava.enviarcorreos.entities.Direccion;
import com.cursojava.enviarcorreos.entities.Municipio;
import com.cursojava.enviarcorreos.utilidades.EncriptacionTexto;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Aguilar
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //cargar la informacion del cliente
        CargarInformacion informacion = new CargarInformacion();
        informacion.llenarDatos();

        // crear el registro del cliente
        Cliente cliente = new Cliente();

        System.out.println("Ingrese el nombre del cliente:");
        cliente.setNombre(teclado.nextLine());

        System.out.println("\nseleccone el municipio donde vive:");
        for (int i = 0; i < informacion.getListMunis().size(); i++) {
            System.out.println(i + " - " + informacion.getListMunis().get(i).getNombre());
        }

        //crear un municipio
        Municipio municipioCliente = informacion.getListMunis().get(Integer.parseInt(teclado.nextLine()));

        System.out.println("\nIngrese el numero de calle:");
        String calle = teclado.nextLine();

        System.out.println("\nIngrese el numero de casa:");
        String casa = teclado.nextLine();

        System.out.println("\nIngrese un punto de referencia:");
        String referencia = teclado.nextLine();

        cliente.setDireccion(new Direccion(municipioCliente, casa, calle, referencia));
        
        System.out.println("\nIngrese el correo electronico");
        cliente.setCorreo(teclado.nextLine());

        //guardar la informacion del cliente
        informacion.getListCliente().add(cliente);
        enviarCorreo(cliente, informacion.getPropiedadesSistema());

        // imprimir la informacion
        System.out.println("\n\nLa informacion del cliente es: \n" + cliente.toString());

    }

    public static void enviarCorreo(Cliente cliente, Properties propiedades) {
        //crear un objeto para encriptar
        EncriptacionTexto encriptador = new EncriptacionTexto();
        
        Email email = new SimpleEmail();
        try {
            email.setHostName(encriptador.getDesencriptarTexto(propiedades.getProperty("srEmName")));
            email.setSmtpPort(Integer.parseInt(encriptador.getDesencriptarTexto(propiedades.getProperty("srEmPort"))));
            email.setAuthentication(
                    encriptador.getDesencriptarTexto(propiedades.getProperty("SrEmU")), 
                    encriptador.getDesencriptarTexto(propiedades.getProperty("srEmP")));
            email.setSSLOnConnect(true);
            email.setFrom(encriptador.getDesencriptarTexto(propiedades.getProperty("srEmFr")));
            email.setSubject(propiedades.getProperty("tiEm"));
            email.setMsg(propiedades.getProperty("txtEm") + cliente.toString());
            email.addTo(cliente.getCorreo());
            email.send();
        } catch (EmailException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
