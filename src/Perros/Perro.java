/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perros;

/**
 *
 * @author alumnog
 */
public class Perro {
    /**       Perro 1
*/
        String nombre;
        String raza;
        String color;
        int nivel;
        String hocico;
        String pelaje;
        String tamano;
        int id;
        




   void correr() {
        System.out.println(nombre+" Esta corriendo");
    }

    void MoverlaCola( String Cola) {
        System.out.println(nombre+" mueve la "+Cola);
    }

    void ladrar() {
        System.out.println("El perro esta ladrando");
    }
    void comer(String comida) {
        System.out.println("El perro come "+comida);
    }
    void atacar() {
        System.out.println(nombre+" esta atacando");
    }
     
}
