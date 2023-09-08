/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Edades;

import java.util.Scanner;

/**
 *
 * @author RacoonCoward777
 */
public class Main {

    /**
     * @> the command line arguments
     */
    public static void main(String[] args) {
        Edad edad = new Edad();
        
        int edad1;
        int edad2;
        Scanner Leer = new Scanner(System.in);
        
        //edad.validarEdad(18, true);
        
        System.out.println("Ingrese edad");
        edad1 = Integer.parseInt (Leer.nextLine());
        
        System.out.println("------Validar Bar-----");
        if (edad.validarEdad(edad1) == true){
            System.out.println("Puede entrar al bar");
        }else 
            System.out.println("No puede entrar al bar");
   
        System.out.println("Ingresa edad");
        edad2 = Integer.parseInt (Leer.nextLine());
        
         if (edad.validarEdad(edad1)== false){
            System.out.println("Estas muy grande para el brinca brinca");
        }else 
            System.out.println("Puedes subirte al brinca brinca");
        {
        
    }
    
    }
    
    
}
