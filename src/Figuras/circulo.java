/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author sergi
 */
public class circulo extends figura{
   public void area(double radio){
       double pi = 3.141516;
       double area = pi*radio*radio;
       System.out.println("El area es "+area);
   }
   
   public void perimetro(double radio){
      double pi = 3.141516;
      double perimetro = pi*2*radio;
       System.out.println("El perimetro es "+perimetro);
   }
}
