/*
package db;


import java.sql.Connection;
import javax.swing.JOptionPane;

public class Crudsql {
  Conexionsql con= new Conexionsql();
  Connection conexion= con.getConexion();

  public void insertar (String fecha,String origen,String destino,String mssi,String router,String usuario,String dato,String banderas,String canal){
  
      try {
          java.sql.Statement st= conexion.createStatement();
          String sql= "Insert into registro(fecha,origen,destino,mssi,router,usuario,dato,banderas,canal) values ('"+fecha+"','"+origen+"','"+destino+"','"+mssi+"','"+router+"','"+usuario+"','"+dato+"','"+banderas+"','"+canal+"')";
          st.execute(sql);
           //st.close();
          // conexion.close();
          // JOptionPane.showMessageDialog(null, "El registro se guardó correctamente","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "El registro NO se guardó"+ e,"MENSAJE",JOptionPane.ERROR_MESSAGE);
      }      
  }    
}*/



package db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Crudsql {
  Conexionsql con= new Conexionsql();
  Connection conexion= con.getConexion();
  

  public void insertar  (String fecha,String origen,String destino,String mssi,String router,String usuario,String dato,String banderas,String canal){
  
      try {

          String sql= "Insert into registro(fecha,origen,destino,mssi,router,usuario,dato,banderas,canal) values(?,?,?,?,?,?,?,?,?)";

          
          PreparedStatement ps = conexion.prepareStatement(sql);
       
          ps.setString(1, fecha); 
          ps.setString(2, origen);
          ps.setString(3, destino); 
          ps.setString(4, mssi); 
          ps.setString(5, router);
          ps.setString(6, usuario); 
          ps.setString(7, dato); 
          ps.setString(8, banderas); 
          ps.setString(9, canal); 
          
          ps.executeUpdate();
           //st.close();
          // conexion.close();
          //JOptionPane.showMessageDialog(null, "El registro se guardó correctamente","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "El registro NO se guardó"+ e,"MENSAJE",JOptionPane.ERROR_MESSAGE);
      }      
  }    
}
  

//String fecha,S
