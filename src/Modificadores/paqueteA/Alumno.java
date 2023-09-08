/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificadores.paqueteA;

/**
 *
 * @author sergi
 */
public class Alumno extends Persona{
    
    public Alumno(String Nombre) {
        super(Nombre);
    }
    public int verEdad(){
        return this.edad;
    }
}
