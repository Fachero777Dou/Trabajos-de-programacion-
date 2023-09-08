/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysql;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */
public class ola {
  String usuario ="pitallac_programacion2";
    String clave="Progra2.";
   // String url ="jdbc:mysql://localhost/tiketsdb?serverTimezone=UTC";
     String url ="jdbc:mysql://pitalla.mx:3306/pitallac_programacion2?serverTimezone=UTC";
    Connection con; 
    Statement stmt;
    ResultSet rs;
      

    public ola() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ola.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement(); 
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public  void    insert(String consulta){
        try {
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(ola.class.getName()).log(Level.SEVERE, null, ex);
        }
                       }
    
    public  ResultSet   select(String consulta){
        try {
            rs = stmt.executeQuery(consulta);
           
        } catch (SQLException ex) {
            Logger.getLogger(ola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  rs;
    }
  
     
  public static void main(String[] args){  
     
           ola test = new ola();
            
          //  test.select("INSERT INTO tecnicos (nombre, apellido, telefono,correo, contrasena) VALUES ('test 5', 't', '677776767', '3sds43@4d77', '123');");
       
            ResultSet rs = test.select( "select * from clientes; ");
      
            
        try {
            
            while(rs.next()){
                System.out.println(rs.getString("id")+" "+rs.getString("nombre")+" "+rs.getString("apellidos") );
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ola.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
  } 
     
   
    
}
