/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_alcance.hijo;

/**
 *
 * @author sergi
 */
public class Cochi extends Terrestre{
   private String rancho;
   public String dueno;

    public String getRancho() {
        return rancho;
    }

    public void setRancho(String rancho) {
        this.rancho = rancho;
    }

    public Cochi(String rancho, String dueno, String nombre, String color, String raza) {
        super(nombre, color, raza);
        this.rancho = rancho;
        this.dueno = dueno;
    }
   
   
   
   public void hacerCarnitas(){}
}
