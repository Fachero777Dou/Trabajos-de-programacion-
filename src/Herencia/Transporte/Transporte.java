/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.Transporte;

/**
 *
 * @author sergi
 */
public class Transporte {
     int id;
        String color;
        String marca;
        String modelo;
        double precio;
        void acelerar(){}
        void frenar(){}

    public Transporte(int id, String color, String marca, String modelo, double precio) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Transporte() {
    }
        
}
