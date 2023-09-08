/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author sergi
 */
public final class Administrador extends Usuario{
    String sucursal;
    String codigoSecreto;
    
    void correoPersonal(){}
    void corteDeCaja(){}
    void agregarHorario(){}
    void pagarSalarios(){}

    public Administrador(String sucursal, String codigoSecreto, String Area, int salario, String horario, int id, String nombre, String apellido, String telefono, String correo, String contraseña) {
        super(Area, salario, horario, id, nombre, apellido, telefono, correo, contraseña);
        this.sucursal = sucursal;
        this.codigoSecreto = codigoSecreto;
    }


    
    
}
