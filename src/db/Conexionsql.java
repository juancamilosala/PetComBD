package db;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexionsql {
  
    private final String usuario="postgres";
    private final String contrasena= "123456";
    private final String bd= "BD-PETCOM";
    private final String ip= "localhost";
    private final String puerto= "5432"; 
    
    
    
    public Connection getConexion(){
    Connection conexion=null;
    
        try {
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
            conexion=DriverManager.getConnection(url,usuario,contrasena);
            JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSA A LA BASE DE DATOS");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          return conexion;
    };

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
