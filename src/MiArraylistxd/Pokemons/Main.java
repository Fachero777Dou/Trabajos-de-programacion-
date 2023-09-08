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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ola = new Scanner(System.in);
       ArrayList <pokemon>listaPokemon = new ArrayList<pokemon>();
       //pokemon Deoxys = new pokemon("Psiquico", "Deoxys", "¿Un visitante del espacio exterior?!", 120 , 60);
       //listaPokemon.add(Deoxys);
       //listaPokemon.add(new pokemon("Psiquico", "Mewtwo", "Psicocorte y Confusion", 5 , 50));
  
       
        //set choiceentry to -1, this will make it to enter while loop
     int choiceentry = -1;

    while(choiceentry < 1 || choiceentry > 2){
        
        System.out.println("-----Menu de Eleccion-----");
        System.out.println("(1) Agregar pokemon");
        System.out.println("(2) Ver lista");

            System.out.println("Elige: (1) o (2)");
            if(ola.hasNextInt())
            choiceentry = ola.nextInt();

    }

     switch(choiceentry){
        case 1:
            System.out.println("Agrega el tipo, nombre, el ataque, la fuerza y la vida del pokemon");
            //pokemon pokemon = new pokemon(ola.nextLine(), ola.nextLine(), ola.nextLine(), ola.nextLine() , ola.nextLine());
           // listaPokemon.add(pokemon);
            break;
        case 2:
            System.out.println("La lista pokemon es: \n"
            +listaPokemon);
           break;
        case 3:
            
            break;
   }
    
    }
}
