/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_alcance.hijo;

/**
 *
 * @author sergi
 */
public class Camaron extends Acuatico{
   private String pescador;

    public String getPescador() {
        return pescador;
    }
    
    
   
    
    
   void hacerCeviche(){}

    public Camaron(String pescador, String mar, String nombre, String color, String raza) {
        super(mar, nombre, color, raza);
        this.pescador = pescador;
    }
   
    
    
}
