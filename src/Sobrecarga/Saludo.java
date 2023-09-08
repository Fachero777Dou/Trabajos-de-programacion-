/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author RacoonCoward777
 */
public class Saludo {

    void saludo() {
        System.out.println("Hola Mundo!");
    }

    void saludo(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println("Hola " + nombre + " tu edad es " + edad + " Su edad es mayor");
        } else {
            System.out.println("Hola " + nombre + " tu edad es " + edad + " Su edad es menor");
        }
    }

    void saludo(String nombre, String apellido) {
        System.out.println("Hola " + nombre + " " + apellido);
    }

}
