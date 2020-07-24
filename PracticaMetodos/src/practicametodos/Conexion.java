/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Conexion {
    Connection cx = null;
    String db = "Trabajo";
    String url ="jdbc:mysql://localhost/"+db;
    String user = "root";
    String pass = "##David##@1";

    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Se ha conectado");
        }catch (ClassNotFoundException|SQLException ex) {
           System.out.println("No se pudo conectar");
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
            System.out.println("Se ha desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo cerrar conexion");
        }
    }
    
   
    
}
