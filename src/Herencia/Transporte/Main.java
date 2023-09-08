/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia.Transporte;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi Racoon = new Taxi ();
        Racoon.color = "verde";
        Racoon.llantas = 4;
        Racoon.modelo = "Tsuru";
        Racoon.precio = 30;
        Racoon.ventanas = 8;
        Racoon.zona = "El Calichi";
        Racoon.id = 3295898;
        
        Moto Tanuki = new Moto();
        Tanuki.color = "Morado";
        Tanuki.id = 26432854;
        Tanuki.llantas = 2;
        Tanuki.marca = "Harley-Davidson";
        Tanuki.modelo = "Nightster Special";
        Tanuki.precio = 195265;
        Tanuki.ruta = "por toda la ciudad";
        
        Camion ca = new Camion(); 
        ca.capacidad = 150;
        ca.color = "Blanco";
        ca.id = 2345435;
        ca.llantas = 8;
        ca.marca = "Tufesa";
        ca.modelo = "camion0";
        ca.ruta = "av. serdan";
       
        Moto m = new Moto("Independencia", 2, 29839843, "Negra", "Harley-Davidson" , "Nightster Special", 195265);
        
    }
    
}
