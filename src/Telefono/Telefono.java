/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefono;

/**
 *
 * @author RacoonCoward777
 */
public class Telefono {

    int precio;
    String marca;
    String modelo;

    Telefono(String marca, String modelo, int precio) {
        System.out.println("Construyendo telefono");

        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;

    }

    void Mostrar() {
        System.out.println("El Telefono es: " + this.modelo);
        System.out.println("La marca es " + this.marca);
    }

    void Vender() {
        System.out.println("El precio es: " + this.precio);
    }
}
