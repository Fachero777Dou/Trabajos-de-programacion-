/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Alumnos;

/**
 *
 * @author RacoonCoward777
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
      Alumno a1 = new Alumno();
      Alumno a2 = new Alumno();
      Escuela e2 = new Escuela();

     a1.Carrera = "ing. en Software";
     a1.escuela = "itson";
     a1.idinterno = "00000";
     a1.id = 244608;
     a1.nombre = "Tanuki_Coward777";

     a2.Carrera = "Diseño Grafico";
     a2.escuela = "itson";
     a2.id = 244209;
     a2.idinterno = "00000";
     a2.nombre = "Mapache_cobarde777";
     
     e2.ciudad = "Mexico";
     e2.id = 273491;
     e2.nombre = "Itson";
     e2.paginaWeb = "www.itson.com";
     e2.telefono = "62229492";

        System.out.println("a "+a1.nombre+" le gusta estudiar en "+a1.escuela);
        System.out.println("Nombre del alumno: "+a1.nombre);
        System.out.println("Escuela en la que estudia: "+a1.escuela);
        System.out.println("ID: "+a1.idinterno+a1.id);
        System.out.println("Carrera que Estudia: "+a1.Carrera);

        System.out.println("\nNombre de la escuela: "+e2.nombre);
        System.out.println("En donde esta ubicada: "+e2.ciudad);
        System.out.println("Numero de contacto: "+e2.telefono);
        System.out.println("Pagina Web: "+e2.paginaWeb);
        System.out.println("ID: "+e2.id);
        
        

    }
    
}
