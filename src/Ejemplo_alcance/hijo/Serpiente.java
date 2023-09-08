/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_alcance.hijo;

/**
 *
 * @author sergi
 */
public class Serpiente extends Terrestre{
   public boolean venenozo;
    
    public void cazar(){}

    public Serpiente(boolean venenozo, String nombre, String color, String raza) {
        super(nombre, color, raza);
        this.venenozo = venenozo;
    }
    
}
