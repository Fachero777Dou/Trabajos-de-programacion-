/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MyReturn;

/**
 *
 * @author alumnog
 */
public class Main {

   
    public static void main(String[] args) {
        


  Materia materia = new Materia(1, "RacoonCoward777","Español","7 am"); 
  String Respuesta =  materia.ValidaCalificacion(9);
 if(Respuesta.equals("Aprobado")){
     System.out.println("Le compraremos un xbox one s");
       
}else{
     System.out.println("Le quitaremos el celular");
}
}


    
}
