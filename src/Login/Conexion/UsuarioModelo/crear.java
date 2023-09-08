/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login.Conexion.UsuarioModelo;

import Login.BaseDatos;
import Login.Conexion.ConexionNeuronal1;
import Login.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class crear {

    public static void crear(Usuario ola) {
        //"texto" + variable + "más texto"
        //"ola.getnombre
        String valores = " ('" + ola.getNombre() + "','" + ola.getCorreo() + "' , '" + ola.getContraseña() + "') ";
        String consulta = "INSERT INTO Usuario_244608 (nombre, correo, contrasena) VALUES " + valores;
        ConexionNeuronal1 Cn = new ConexionNeuronal1();
        Cn.insert(consulta);
    }

public static boolean login(String correo, String contrasena){
        BaseDatos.UsuarioLoggeado = null; 
        String query = "SELECT * FROM  Usuario_244608 WHERE correo ='"+correo+"' AND contrasena ='"+contrasena+"' ";
        ConexionNeuronal1 db = new ConexionNeuronal1();
        ResultSet rs = db.select( query );   
        
        boolean resultado = false;
        
        try {
            while(rs.next()){
                BaseDatos.UsuarioLoggeado = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("contrasena")); 
               resultado = true; 
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(crear.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInternalMessageDialog(null,"La conexion con la base de datos no pudos er establecida!");

        }
       
        return resultado;
     
}
    public static void editar() {

    }

    public static void eliminar() {
    }

    public static ArrayList<Usuario> listado() {
        ConexionNeuronal1 db = new ConexionNeuronal1();
        String query = "SELECT * FROM  Usuario_244608";
        ResultSet rs = db.select(query);
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            while (rs.next()) {
                lista.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("contrasena")));
                
                        }
        } catch (SQLException ex) {
            Logger.getLogger(crear.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static void buscar() {
    }

}
