/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circulo ola = new circulo();
        cuadrado dou = new cuadrado();
        triangulo ola2 = new triangulo();
        ola.area(12);
        ola.perimetro(78);
        dou.perimetro(8);
        dou.area(12, 5);
        ola2.area(10, 12);    
        ola2.perimetro(23, 34, 50);
    }
    
}
