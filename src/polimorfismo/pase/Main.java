/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo.pase;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona donJulio = new persona();
        nino JulioJunior = new nino();
        double precioEntrada = 50.5;
        donJulio.cobrar(precioEntrada);
        JulioJunior.cobrar(precioEntrada);
    }
    
}
