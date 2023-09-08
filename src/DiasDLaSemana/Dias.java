/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DiasDLaSemana;

import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class Dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> semana = new ArrayList<String>();
       semana.add("Lunes");
       semana.add("Martes");
       semana.add("Miercoles");
       semana.add("Jueves");
       semana.add("Viernes");  
       semana.add("Sabado");
       semana.add("Domingo");
       
       semana.set(5, "SabaDrinks");
       
       semana.remove(6);
       
       for(String Dias: semana){
           if(Dias.equals("Viernes")){
               System.out.println("Viernes de Tianguis");
           }else{
               System.out.println("Dias :"+Dias); 
           }
       }
    }
    
}
