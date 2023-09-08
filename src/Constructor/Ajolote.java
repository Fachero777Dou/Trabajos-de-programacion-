/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author RacoonCoward777
 */
public class Ajolote {
    int id;
    String color;
    double tamaño;
    boolean estres; 
    int edad;
    String nombre;

  Ajolote(String nombre, int edad, String color, double tamaño, boolean estres, int id){
      System.out.println("Se esta construyendo un Ajolote");

      this.nombre = nombre;
      this.edad = edad;
      this.color = color;
      this.tamaño = tamaño;
      this.estres = estres;
      this.id = id;

      System.out.println("Ya se construyo");
      }
 void DatosAjolote(){
        System.out.println("-------- Datos Ajolote ----------");
        System.out.println(this.nombre);
        System.out.println(this.color);
        System.out.println(this.estres);
        System.out.println(this.edad);
        System.out.println(this.id);
        System.out.println(this.tamaño);
}
}
