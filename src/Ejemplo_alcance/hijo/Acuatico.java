/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_alcance.hijo;
import Ejemplo_alcance.padre.Animal;
/**
 *
 * @author sergi
 */
public class Acuatico extends Animal{
    protected String mar;

    public void setMar(String mar) {
        this.mar = mar;
    }
    
  
    
     void nadar(){}
     void respirarAgua(){}

    public Acuatico(String mar, String nombre, String color, String raza) {
        super(nombre, color, raza);
        this.mar = mar;
    }


}