package ta1;

import java.util.Scanner;

/**
 *
 * @author CESAR
 */
public class ingalumno {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1;
        String apellido1;
        int edad1;
        int codigo1;
        int cantidadcurso;
        String genero1;
       


        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el nombre del alumno: ");
        nombre1 = teclado.nextLine();

        System.out.print("Introduzca el apellido del alumno: ");
        apellido1 = teclado.nextLine();
        System.out.print("Introduzca el genero del alumno: ");
        genero1 = teclado.nextLine();
        System.out.print("Introduzca el número de edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Introduzca el codigo de alumno: ");
        codigo1 = teclado.nextInt();
         System.out.print("Introduzca el cantidad de cursos : ");
        cantidadcurso = teclado.nextInt();
        
        

        Alumno newalumno = new Alumno(nombre1, apellido1, edad1, codigo1, cantidadcurso, genero1);

        System.out.printf(newalumno.getAtributos());
    }
    
}