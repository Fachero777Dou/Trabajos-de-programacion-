/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploAlcance;
import Ejemplo_alcance.hijo.Acuatico;
import Ejemplo_alcance.hijo.Ballena;
import Ejemplo_alcance.hijo.Camaron;
import Ejemplo_alcance.hijo.Cochi;
import Ejemplo_alcance.hijo.Serpiente;
import Ejemplo_alcance.hijo.Terrestre;
/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cochi Racoon = new Cochi("La lejania", "yo", "Tanuki", "rosita", "Frenchpudul");
        Camaron Caramon = new Camaron("yo", "Mar Atlantico", "Roberto", "Azul", "Bull Dog");
        Ballena Aaa = new Ballena("Mar Caribe", "Phosphophillyte", "Azul", "Verde");
        Serpiente Eee = new Serpiente(true,"Roberta","Blanco, naranja y negro","Serpiente");
      
        Caramon.comer("Sabritas");
        Caramon.dormir();
        Racoon.correr();
        Racoon.comer("Doritos");
        Aaa.comerApinocho();
        Aaa.expulsarAgua();
        Eee.cazar();
        Eee.correr();
        
        
        
        
        
     
        
        
        
        
        
        
    }
    
}
