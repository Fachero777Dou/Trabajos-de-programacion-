/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AvionPasajeroVuelo;

/**
 *
 * @author RacoonCoward777
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion TanukiCoward = new Avion();
        Pasajero Kanamoney = new Pasajero();
        Vuelo V1 = new Vuelo();

      TanukiCoward.id = 127472;
      TanukiCoward.nombreDelAvion = "Tanuki Coward";
      TanukiCoward.color = "cafe";
      TanukiCoward.modelodelavion = "Tanuki";
      TanukiCoward.aerolinea = "central";
      TanukiCoward.piloto = "mapache cobarde";
      
     Avion Midori = new Avion();
      Midori.id = 72134;
      Midori.clase = "primera clase";
      Midori.color = "verdesito";
      Midori.modelodelavion = "nuevo";

      V1.avion = TanukiCoward;
      V1.Origen = "Guaymas";
      V1.capacidadDelvuelo = "40 pasajeros";
      V1.Destino = "Tokio";
      V1.horasalida = "14:02";
      V1.horallegada = "23:34";
      V1.NumerodeVuelo = "20";
      
      Kanamoney.nombre = "Kanamoney";
      Kanamoney.Edad = "18";
      Kanamoney.Numeroasiento = "10";
      Kanamoney.telefono = "622100902923";
      Kanamoney.vuelo = V1;

     Kanamoney.verBoleto();

     
    }
    
}
