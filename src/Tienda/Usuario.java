/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author RacoonCoward777
 */
public class Usuario extends Persona {
    String Area;
    int salario;
    String horario;

    public Usuario(String Area, int salario, String horario, int id, String nombre, String apellido, String telefono, String correo, String contraseña) {
        super(id, nombre, apellido, telefono, correo, contraseña);
        this.Area = Area;
        this.salario = salario;
        this.horario = horario;
    }   
    void AgregarProducto (String producto){
        System.out.println("----------------USUARIO---------------");
        System.out.println("hola "+nombre+" ingresa el "+producto+" a la tienda");
    }
    void EnviarProducto(String producto, String Direccion){
        System.out.println("Hola Agrega tu direccion: "+Direccion);
        System.out.println("Hola ahora agrega el producto: "+producto);
    }
    void InicioSesion(String nombre){
        System.out.println("Bienvenido "+nombre);
    }
    void ReporteFinanciero(String Reporte){
        System.out.println("El reporte financiero es: "+Reporte);
    }
}
