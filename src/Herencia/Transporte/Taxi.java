/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.Transporte;

/**
 *
 * @author sergi
 */
public class Taxi extends Transporte{
    int llantas;
    int ventanas;
    String zona;
    void recogerpasajeros(String pasajero){
        System.out.println("Recogiendo a "+pasajero);
    }

    public Taxi(int llantas, int ventanas, String zona, int id, String color, String marca, String modelo, double precio) {
        super(id, color, marca, modelo, precio);
        this.llantas = llantas;
        this.ventanas = ventanas;
        this.zona = zona;
    }
    public Taxi() {
    }
    
}
