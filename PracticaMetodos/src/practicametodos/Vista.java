/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.*;

/**
 *
 * @author David
 */
public class Vista extends JFrame{
    JLabel nombrelbl, codigolbl, edadlbl, direccionlbl, messagelbl, estadolbl;
    JTextField nombreInp, codigoInp, edadInp, direccionInp;
    JButton Save;
    DefaultTableModel model;
    JTable tblDatos;
    JScrollPane scroll;
    
    public Vista(){
        this.setTitle("Registro de estudiantes");
        this.setSize(700, 700);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new AbsoluteLayout());
        
        //Construccion de la estructura de la GUI
        codigolbl = new JLabel("Código");
        this.getContentPane().add(codigolbl, new AbsoluteConstraints(10, 20, 100, 20));
        codigoInp = new JTextField();
        this.getContentPane().add(codigoInp, new AbsoluteConstraints(100, 20, 100, 20));
        
        nombrelbl = new JLabel("Nombre");
        this.getContentPane().add(nombrelbl, new AbsoluteConstraints(10, 50, 100, 20));
        nombreInp = new JTextField();
        this.getContentPane().add(nombreInp, new AbsoluteConstraints(100, 50, 100, 20));
        
        edadlbl = new JLabel("Edad");
        this.getContentPane().add(edadlbl, new AbsoluteConstraints(10, 80, 100, 20));
        edadInp = new JTextField();
        this.getContentPane().add(edadInp, new AbsoluteConstraints(100, 80, 100, 20));
        
        direccionlbl = new JLabel("Dirección");
        this.getContentPane().add(direccionlbl, new AbsoluteConstraints(10, 110, 100, 20));
        direccionInp = new JTextField();
        this.getContentPane().add(direccionInp, new AbsoluteConstraints(100, 110, 100, 20));
        
        Save = new JButton("Guardar");
        this.getContentPane().add(Save, new AbsoluteConstraints(100, 140, 200, 20));
        
        estadolbl = new JLabel("Estado: ");
        this.getContentPane().add(estadolbl, new AbsoluteConstraints(10, 200, 200, 20));
        
        messagelbl = new JLabel(" '' ");
        this.getContentPane().add(messagelbl, new AbsoluteConstraints(200, 200, 200, 20));
        
        
        tblDatos = new JTable();
        scroll = new JScrollPane();
        model = new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("DIRECCION");
        model.addColumn("TELEFONO");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll, new AbsoluteConstraints(10, 250, 500, 400));
        this.setVisible(true);
    }
    
    /**
     *
     */
   
 
}
