/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStatic;

/**
 *
 * @author sergi
 */
public class Calculadora {
    public double pi = 3.141592;
    
    public static double pis = 3.1516;
    
    public void sumar (int num1, int num2){
        int resultado = num1+num2;
        System.out.println("la suma es "+resultado);
    }
    
    public static void sumars(int num1, int num2){
        int resultado = num1+num2;
        System.out.println("la suma es "+resultado);
    }
}
