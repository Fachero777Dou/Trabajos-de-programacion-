/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cochedou;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coche dou = new coche("Mitsubishi", "nika", "blanco", "WebOs", 14446568);
        dou.setColor("verde");
        dou.setMarca("Nissan");
        dou.setMatricula("WebOs");
        dou.setModelo("nika");
        dou.setPrecio(648146.0);
        
        System.out.println("El carro es de color "+dou.getColor());
        System.out.println("Es marca "+dou.getMarca());
        System.out.println("La matricula es "+dou.getMatricula());
        System.out.println("el modelo es "+dou.getModelo());
        System.out.println("El precio es "+dou.getPrecio());
    }
    
}
