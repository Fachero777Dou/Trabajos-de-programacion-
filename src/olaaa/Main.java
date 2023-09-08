/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package olaaa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos años tienes?");
        try{
           int edad = Integer.parseInt( leer.nextLine() );
        
        if(edad>=10){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    
        }catch(Exception ex){
            /**
            System.out.println(e);
            System.out.println("Solo puedes ingresar numeros");
            **/
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros!!!");
        }
        
    }
}

