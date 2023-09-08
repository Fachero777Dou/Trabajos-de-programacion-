/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyReturn;

/**
 *
 * @author alumnog
 */
public class Materia {
    int id;
    String maestro;
    String nombredelamateria;
    String horario;
public Materia(){

}

    public Materia(int id, String maestro, String nombredelamateria, String horario) {
        this.id = id;
        this.maestro = maestro;
        this.nombredelamateria = nombredelamateria;
        this.horario = horario;
    }

public String ValidaCalificacion (double calificacion){
    System.out.println("---------Validacion de la materia--------");
    System.out.println(this.nombredelamateria);
    System.out.println("resultados");
   if(calificacion >=7){
       System.out.println("Aprobado");
       return "Aprobado";
}else{
       System.out.println("Reprobado");
       return "reprobado";
}
}
}