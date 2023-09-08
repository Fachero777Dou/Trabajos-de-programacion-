/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificadores.paqueteA;

/**
 *
 * @author sergi
 */
public class Persona {
    private String Nombre;
    int edad;
    int id;

  
      public String getNombre(){//Get para acceder a un atributo privado
        return Nombre;
    }
    public Persona (String Nombre){
        this.Nombre = Nombre;
    }
public void setNombre(String Nombre){
    this.Nombre = Nombre;
}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
}
