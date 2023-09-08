/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perros;

/**
 *
 * @author alumnog
 */
public class Inicio {

    private static String Cola;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Perro p3 = new Perro();
        Perro p4 = new Perro();
        Dueno d1 = new Dueno();


      p1.nombre = "Chopper";
      p1.color = "Cafe";
      p1.hocico = "Chico";
      p1.raza = "Chihuahua";
      p1.pelaje = "Sedoso";
      p1.nivel = 31;
      p1.tamano = "chico";
      p1.id = 123;
      p1.atacar();
      p1.MoverlaCola("Cola");
      p1.correr();
      p1.comer("Sabritas");

      p2.nombre = "Luffy";
      p2.color = "Blanco";
      p2.hocico = "mediano";
      p2.raza = "Chihuahua";
      p2.pelaje = "Sedoso";
      p2.nivel = 100;
      p2.tamano = "chico";
      p2.id = 1234;

      p3.nombre = "Pugberto";
      p3.color = "Negro";
      p3.hocico = "chico";
      p3.raza = "pug";
      p3.pelaje = "Sedoso";
      p3.nivel = 52;
      p3.tamano = "mediano";
      p3.id = 12345;

      p4.nombre = "Phosphophyllite ";
      p4.color = "blanco";
      p4.hocico = "grande";
      p4.raza = "pitbull";
      p4.pelaje = "aspero";
      p4.nivel = 35;
      p4.tamano = "Grande";
      p4.id = 123456;
      p4.correr();


      d1.nombre = "Roberto";
      d1.tamaño = 172;
      d1.ColordeCabello = "Negro";
      d1.colordeOjos = "cafe";
      d1.edad = 18;
      d1.id = 777;
      
      



        System.out.println("El Primer perro se llama "+p1.nombre);

        System.out.println("El Segundo Perrro se llama "+p2.nombre);
 
        System.out.println("El Tercer perro se llama "+p3.nombre);

        System.out.println("El Cuarto perro se llama "+p4.nombre);

        




    }
    
}
