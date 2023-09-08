/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente Racoon = new Cliente("México", "av. Garcia Lopez", "Racoon 1562 2673 273", 76325, "Racoon", "Coward", "6221717341", "RacoonCoward777@gmail.com", "244608Gra" );
        Racoon.InicioSesion(Racoon);
        Racoon.comprar("Sabritas");
        Racoon.AgregarAlCarrito("Producto");
        
        
        
        Usuario Tanuki = new Usuario("Degustaciones", 300, "11am a 20pm", 56165, "Tanuki", "Coward", "622171734632", "TanukiCoward777@gmail.com", "244608");
    Tanuki.AgregarProducto("producto");
    Tanuki.EnviarProducto("Xbox one Series X", "Cerrada allier");
    Tanuki.InicioSesion("Tanuki");
    Tanuki.ReporteFinanciero("La situacion actual es estable no se han tenido perdidas monetarias");
    
    }
    Administrador acmin;

    public Main() {
        this.acmin = new Administrador("soya de guaymas", "764354", "Cajero", 3000, "11am a 1pm", 73436, "racoon", "coward", "662 254 4561", "Racooncoward@gmail.com", "dou");
    }
}
