/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta1;

import java.util.Scanner;

/**
 *
 * @author CESAR
 */
public class ingcate {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1;
        String apellido1;
        int edad1;
        int codigo1;
        int codigocurso;
        String genero1;
        float sueldo1;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el nombre del catedratico: ");
        nombre1 = teclado.nextLine();

        System.out.print("Introduzca el apellido del ecatedratico: ");
        apellido1 = teclado.nextLine();
        System.out.print("Introduzca el genero del catedratico: ");
        genero1 = teclado.nextLine();
        System.out.print("Introduzca el número de edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Introduzca el codigo de catedratico: ");
        codigo1 = teclado.nextInt();
         System.out.print("Introduzca el codigo de curso del catedratico: ");
        codigocurso = teclado.nextInt();
         System.out.print("Introduzca el sueldo del catedratico: ");
        sueldo1 = teclado.nextFloat();
        

        Catedratico newcatedratico = new Catedratico(nombre1, apellido1, edad1, codigo1, codigocurso, genero1, sueldo1);

        System.out.printf(newcatedratico.getAtributos());
    }
    
}