/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MiArraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sergi
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>listacarros = new ArrayList<String>();
        listacarros.add("aveo");
        listacarros.add("jetta");
        listacarros.add("bocho");
        listacarros.add("cavalier");
        listacarros.add("onix");
        
        
        //el get es para obtener un registro por su posicion
        System.out.println("Carro en 4: "+listacarros.get(4));
        
        //si se imprime la Arraylist se impre todo el contenido
        System.out.println(listacarros);
        
        //remplazar valor
        listacarros.set(4, "bochito");
        System.out.println(listacarros);
        
        listacarros.remove(1);
        
       Collections.sort(listacarros);
        
        //foreach Arraylist
        for(String carro: listacarros){
            System.out.println("carros: "+carro);
        
        }
        //variable de array vacia
        if (listacarros.isEmpty()){
            System.out.println("Esta vacio");
        }else{
            //retornas la cantidad de carros dentro de la Arraylist 
            int cantidadcarros = listacarros.size();
            System.out.println("Tiene "+cantidadcarros+" carros");
        }
        
    //limpia la lista
    listacarros.clear();
    
    //retorna true si la losta tiene el contenido
    listacarros.contains("aveo");
    }
    
}
