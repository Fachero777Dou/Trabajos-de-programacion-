/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author RacoonCoward777
 */
public final class Cliente extends Persona {
    String ciudad;
    String direccion;
    String datosDelaTarjeta;

    public Cliente(String ciudad, String direccion, String datosDelaTarjeta, int id, String nombre, String apellido, String telefono, String correo, String contraseña) {
        super(id, nombre, apellido, telefono, correo, contraseña);
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.datosDelaTarjeta = datosDelaTarjeta;
    }

    
   void InicioSesion(Cliente Racoon){
       System.out.println("----------CLIENTE-----------");
       System.out.println("Bienvenido "+nombre);
   }
   void comprar(String Producto){
       System.out.println("Hola "+nombre+" tome aqui esta su producto "+Producto);
   }
   void AgregarAlCarrito(String Producto){
       System.out.println("hola "+nombre+" Desea agregar al carrito todo el "+Producto);
   }
}
