/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.pase;

/**
 *
 * @author RacoonCoward
 */
public class nino extends persona{
    @Override
 public void cobrar(double costo){
     costo = costo*0.5;
        System.out.println("Descuento del 50% para niños");
     super.cobrar(costo);
 }   
}
