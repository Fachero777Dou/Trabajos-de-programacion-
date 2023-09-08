/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author sergi
 */
public class triangulo extends figura{
   
    public void area(double base, double altura){
        double area = base*altura/2;
        System.out.println("el area es "+area); 
    }
    public void perimetro(double lado1, double lado2, double lado3){
        double perimetro = lado1+lado2+lado3;
        
    }
}
