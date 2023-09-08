/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionPasajeroVuelo;

/**
 *
 * @author RacoonCoward777
 */
public class Pasajero {
    int id;
    String nombre;
    String Edad;
    Vuelo vuelo;
    String telefono;
    String Numeroasiento;
   


void verBoleto(){
    System.out.println("---------Boleto----------");
    System.out.println("Num. "+vuelo.NumerodeVuelo+"\n");
    System.out.println("Origen: "+vuelo.Origen);
    System.out.println("Destino: "+vuelo.Destino);
    System.out.println("----------Horario---------");
    System.out.println("Salida: "+vuelo.horasalida);
    System.out.println("Llegada: "+vuelo.horallegada);
    System.out.println("------ AVION Y AEROLINEA -----");
    System.out.println(vuelo.avion.nombreDelAvion+" De "+vuelo.avion.clase);
    System.out.println("Piloto: "+vuelo.avion.piloto);
    System.out.println("Nombre: "+this.nombre);
    System.out.println("Num. Asientos: "+this.Numeroasiento);
    System.out.println("-------------------------------");
    System.out.println("---------- BUEN VIAJE ----------");
    System.out.println("---- AEROLINEA ---- "+vuelo.avion.aerolinea);   
}
}
