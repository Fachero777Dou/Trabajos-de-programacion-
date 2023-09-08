/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MyHashmap;

import java.util.ArrayList;
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
        /*
        ArrayList<String> capitales = new ArrayList<String>();
        capitales.add("CDMX");
        capitales.add("paris");
        capitales.add("Buenos Aires");
        capitales.add("La Abana");
        capitales.add("Kiev");
        System.out.println(capitales.get(4));
        */
        HashMap<String, String> capitales = new HashMap<String, String>();
        System.out.println("esta vacio "+ capitales.isEmpty());
        capitales.put("Mexico", "CDMX");
        capitales.put("Francia", "paris");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Cuba", "La Abana");
        capitales.put("Ucrania", "Kiev");
        System.out.println(capitales.get("Francia"));
        System.out.println("hay: "+ capitales.size());
        System.out.println("se elimino: "+capitales.remove("Cuba"));
        capitales.replace("Mexico", "Ciudad de Mexico");
        
        System.out.println(capitales);
        
        System.out.println("\n Recorriendo los valores");
        for(String c: capitales.values()){
            System.out.println(c);
        }
     capitales.clear();
    }
    
}
