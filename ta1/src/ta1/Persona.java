/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta1;

/**
 *
 * @author CESAR
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    

    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
     public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setapellido(String apellido)
    {
        this.apellido = apellido;
    }
     public void setedad(int edad)
    {
        this.edad = edad;
    }
      public String getdatos()
    {
        return "El nombre: \"" + nombre + "\" es " + apellido + "." +" edad es :" + edad+ ".";
    }
}
