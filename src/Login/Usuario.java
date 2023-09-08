/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author sergi
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private String correo;

    public Usuario(int id, String nombre, String contraseña, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public Usuario() {
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
    public static boolean login (String correo, String contrasena){
        for(Usuario u : BaseDatos.ListaUsuarios){//recorre todos los usuarios registrados
        if(u.getCorreo().equals(correo) && u.getContraseña().equals(contrasena)){//encuentra un usuario que su correo y contraseña coinsida con lo que puso
            BaseDatos.UsuarioLoggeado = u;//si encontro un usuario lo guarda en usuario loggeado
            return true;
            
        }
    }
        return false;//si no encontro nada regresa false
    }   
    
    
}
