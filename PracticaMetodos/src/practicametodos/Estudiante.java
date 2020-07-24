/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicametodos;

/**
 *
 * @author David
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private int edad;
    private String direccion;
    public Estudiante(){
        
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
