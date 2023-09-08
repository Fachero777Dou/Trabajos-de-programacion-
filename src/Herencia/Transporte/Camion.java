/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.Transporte;

/**
 *
 * @author sergi
 */
public class Camion extends Transporte {
    int llantas;
    int capacidad;
    String ruta;
    void subirPasajeros(String... pasajero){
        for(String p : pasajero)
        System.out.println("Pasajeros abordo "+p);}

    public Camion(int llantas, int capacidad, String ruta, int id, String color, String marca, String modelo, double precio) {
        super(id, color, marca, modelo, precio);
        this.llantas = llantas;
        this.capacidad = capacidad;
        this.ruta = ruta;
    }

    public Camion() {
    }
    
    
}
