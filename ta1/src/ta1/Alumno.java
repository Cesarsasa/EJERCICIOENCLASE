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
public class Alumno extends Persona
{
    private int codigoalum;
    private int cancurso;
    private String genero;

    public Alumno(String nombre, String apellido, int edad, int codigalum, int cancurso,String genero ) {
        super(nombre, apellido, edad);
        this.codigoalum = codigoalum;
        this.cancurso = cancurso;
        this.genero = genero;
    
    }
        public String getAtributos()
    {
        return super.getdatos() + "\nEl codigo de alumno" + codigoalum + " \ncantidad de cursos "+ cancurso + " \ngenero: " + genero + " ";
    }
}