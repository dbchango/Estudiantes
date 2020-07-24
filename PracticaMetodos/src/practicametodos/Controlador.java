/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Controlador implements ActionListener, MouseListener{
    Vista v;
    Estudiante estudiante;
    daoEstudiante dao;
    
    public static void main(String[] args){
        Controlador c = new Controlador();
    }
    
    public Controlador(){
        v = new Vista();
        dao = new daoEstudiante();
        v.Save.addActionListener(this);
        v.tblDatos.addMouseListener(this);
        refrescarTabla();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==v.Save){
            Estudiante estudiante = new Estudiante();
            estudiante.setCodigo(Integer.parseInt(v.codigoInp.getText()));
            estudiante.setNombre(v.nombreInp.getText());
            estudiante.setEdad(Integer.parseInt(v.edadInp.getText()));
            estudiante.setDireccion(v.direccionInp.getText());
            if(dao.create(estudiante)){
                JOptionPane.showMessageDialog(this.v, "Se ha insertado el registro correctamente "+" Estudiante: "+estudiante.getNombre(), "Tarea realizada", 1);
                refrescarTabla();
            }else{
                JOptionPane.showMessageDialog(this.v, "El registro no se ha insertado", "Error", 0);
            }
            refrescarTabla();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }
    
    public void refrescarTabla() {
        while(v.model.getRowCount()>0){
            v.model.removeRow(0);
        }
        ArrayList<Estudiante> lista = dao.read();
        for(Estudiante estudiante:lista){
            Object item[]=new Object[4];
            item[0]=estudiante.getCodigo();
            item[1]=estudiante.getNombre();
            item[2]=estudiante.getEdad();
            item[3]=estudiante.getDireccion();
            v.model.addRow(item);
        }
        v.tblDatos.setModel(v.model);
    }
    
    
    

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
           }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
