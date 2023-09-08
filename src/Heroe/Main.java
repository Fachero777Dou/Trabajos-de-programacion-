/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heroe;

import java.util.HashMap;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, heroe> heroes = new HashMap<String, heroe>();
        heroe goku = new heroe("Goku", "kakaroto", "ssj", "Dragon Ball");
        heroe Luffy = new heroe("Chango D. Luffy", "El quinto emperador", "zoan mitologica Hito Hito no Mi, modelo Nika dios del sol", "One Piece");
        heroe Seiya = new heroe("Seiya", "pegaso", "cosmos", "Los caballeros del zodiaco");
        heroe Guts = new heroe("El gustavo", "Espadachin Negro", "Armadura Berserk", "Berserk");
        
        heroes.put("Dragon Ball", goku);
        heroes.put("One Piece", Luffy);
        heroes.put("Los caballeros del zodiaco", Seiya);
        heroes.put("Berserk", Guts);
        System.out.println("se elimino a: " + heroes.remove("Dragon Ball").nombre);

        System.out.println("\n Recorriendo a los heroes");
        for (heroe L : heroes.values()) {
            System.out.println("nombre del heroe: " + L.nombre);
            System.out.println("Alterego de los heroes: " + L.alterego);
            System.out.println("Serie de donde son: " + L.editoria);
            System.out.println("Poderes: " + L.superPoder);
        }

    }

}
