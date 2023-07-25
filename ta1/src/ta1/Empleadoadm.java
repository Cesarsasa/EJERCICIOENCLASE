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
public class Empleadoadm extends Persona
{
    private int codigo;
    private String puesto;
    private String genero;
    private float sueldo;

    public Empleadoadm(String nombre, String apellido, int edad, int codigo, String puesto,String genero, float sueldo ) {
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.puesto = puesto;
        this.genero = genero;
        this.sueldo = sueldo;
    }
     public String getAtributos()
    {
        return super.getdatos() + "\nEl codigo " + codigo + " \npuesto "+ puesto + " \ngenero: " + genero + " \nsueldo : "+ sueldo + " ";
    }
    
     
}
