/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MiArraylistxd.Pokemons;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ola = new Scanner(System.in);
        String menu;
        ArrayList<pokemon> olaaaa = new ArrayList<pokemon>();
        boolean salirxd=true;
                do{
        System.out.println("---------menu----------");
        System.out.println("(1) agregar pokemon");
        System.out.println("(2) ver lista de pokemons");
        System.out.println("(3) para salir");
        menu = ola.nextLine();
        
        switch(menu){
            case "1":{
                System.out.println("nombre: ");
                String nombre = ola.nextLine();
                System.out.println("tipo: ");
                String tipo = ola.nextLine();
                System.out.println("Ataque: ");
                String ataque = ola.nextLine();
                System.out.println("fuerza");
                String fuerza;
                        
                
                break;}
            case "2":{
                System.out.println("Listando pokemon");
                break;}
            case "3":{
                System.out.println("Adios");
                salirxd=false;
                break;}
            default:{
                System.out.println("Esa opcion no exite");
                break;}
            }
        }while(salirxd);
        
    }
    
}
