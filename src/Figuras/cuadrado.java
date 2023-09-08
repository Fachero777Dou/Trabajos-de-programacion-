/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author sergi
 */
public class cuadrado extends figura{
    public void area(double lado1, double lado2){
        double area = lado1*lado2;
        System.out.println("El area es "+area);
    }
 public void perimetro(double lado1){
   double perimetro = lado1*4;
     System.out.println("El perimetro es "+perimetro);
}
}

