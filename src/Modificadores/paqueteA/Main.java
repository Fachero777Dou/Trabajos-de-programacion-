/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modificadores.paqueteA;

import Modificadores.paqueteB.Escuela;


/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona Racoon = new Persona("Racoon Zaragoza");
        //Racoon. = "Racoon Zaragoza";
        Racoon.edad = 18;
        Racoon.id = 325787473;
        
        Escuela itson = new Escuela();
        itson.Nombre = "Itson Guaymas";
        itson.Telefono = "674357832384";
        itson.direccion = "el calichi";
    }
    
}
