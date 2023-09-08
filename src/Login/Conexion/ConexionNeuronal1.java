/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Login.Conexion;
import mysql.*;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */
public class ConexionNeuronal1 {
   String usuario ="pitallac_gamesdb";
    String clave="Kanica1*.a";
   // String url ="jdbc:mysql://localhost/tiketsdb?serverTimezone=UTC";
     String url ="jdbc:mysql://termicontrol.mx:3306/pitallac_gamesdb?serverTimezone=UTC";
    Connection con;
    Statement stmt;
    ResultSet rs;
      

    public ConexionNeuronal1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionNeuronal1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement(); 
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexionNeuronal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public  void    insert(String consulta){
        try {
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionNeuronal1.class.getName()).log(Level.SEVERE, null, ex);
        }
                       }
    
    public  ResultSet   select(String consulta){
        try {
            rs = stmt.executeQuery(consulta);
           
        } catch (SQLException ex) {
            Logger.getLogger(ConexionNeuronal1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  rs;
    }
  
     
  public static void main(String[] args){  
     
           ConexionNeuronal1 test = new ConexionNeuronal1();
            
          //  test.select("INSERT INTO tecnicos (nombre, apellido, telefono,correo, contrasena) VALUES ('test 5', 't', '677776767', '3sds43@4d77', '123');");
       
            ResultSet rs = test.select( "select * from Usuario_244608 ");
      
            
        try {
            
            while(rs.next()){
                System.out.println(rs.getString("correo")+" "+rs.getString("nombre")+" "+rs.getString("contrasena") );
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionNeuronal1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
  } 
     
   
    
}
