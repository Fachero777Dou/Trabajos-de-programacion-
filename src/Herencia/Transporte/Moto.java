/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.Transporte;

/**
 *
 * @author sergi
 */
public class Moto extends Transporte {
   String ruta;
   int llantas;
   void chocar(){
       System.out.println("La moto choco");
       
   }

    public Moto(String ruta, int llantas, int id, String color, String marca, String modelo, double precio) {
        super(id, color, marca, modelo, precio);
        this.ruta = ruta;
        this.llantas = llantas;
    }

    public Moto() {
    }
   
}
