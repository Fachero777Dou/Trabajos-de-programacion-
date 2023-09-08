/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Constructor;

/**
 *
 * @author RacoonCoward777
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       Ajolote a1 = new Ajolote(
"Midori Asakusa", 5, "Verde", 0.25, true, 92342);

       Ajolote a2 = new Ajolote(
"Kanamori Sayaka", 4, "cremita", 0.32, true, 8394);

       Ajolote a3 = new Ajolote(
"Tsubame Mizusaki", 1, "rosa", 1, true, 1239);
 
       Ajolote a4 = new Ajolote(
"Doumeki", 6, "cafe", 0.23, true, 1249);
        /**
        Midori.nombre = "Midori";
        Midori.edad = 2;
        Midori.color = "verde";
        Midori.tamaño = "pequeño";
        Midori.estres = true;
        Midori.id = 35723580;
        */
        System.out.println("Datos Iniciales");
        a1.DatosAjolote();
        a2.DatosAjolote();
        a3.DatosAjolote();
        a4.DatosAjolote();
        
System.out.println("\nDatos Editados");
a1.color = "Verde Sandia";  
a1.DatosAjolote();

   
     }
    
}
