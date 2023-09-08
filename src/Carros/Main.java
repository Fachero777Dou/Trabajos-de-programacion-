/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Carros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ola = new Scanner(System.in);
        boolean salir= true;
         ArrayList<String> Carros = new ArrayList<String>();
         Carros.add("Tsuru");
         Carros.add("Cheyenne");
          Carros.add("Mini cooper");
         Carros.add("jetta");
         Carros.add("Bati movil");
         System.out.println("Que carro quieres ver?");
         do{
             
         try{
             
            int s = Integer.parseInt( ola.nextLine() );
          System.out.println("El carro que eligio es "+Carros.get(s));
          salir = false;
         }
             
         catch(Exception ex){
             System.out.println("Ese carro no existe");
         }
        
            

         }while(salir);
         }
}