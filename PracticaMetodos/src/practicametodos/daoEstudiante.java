/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class daoEstudiante {
    Conexion cx;
    public daoEstudiante(){
       cx = new Conexion(); 
    }
    
    public boolean create (Estudiante estudiante){
        try{
            String sql = "INSERT INTO Estudiante values ('"+estudiante.getCodigo()+"', '"+estudiante.getNombre()+"', '"+estudiante.getEdad()+"', '"+estudiante.getDireccion()+"')";
            PreparedStatement ps = cx.conectar().prepareStatement(sql);
            ps.execute();
            cx.desconectar();
            ps.close();
            return true;
        }catch(SQLException ex){
            Logger.getLogger(daoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<Estudiante> read(){
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        try{
            String sql = " SELECT * FROM Estudiante ORDER BY codigo ";
            PreparedStatement ps = cx.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setCodigo(rs.getInt("codigo"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setDireccion(rs.getString("direccion"));
                lista.add(estudiante);
            }
            ps.close();
            ps = null;
            cx.desconectar();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    
    
}
