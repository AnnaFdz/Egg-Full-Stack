/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ejercicio_3;

import collection_ejercicio_1_Servicio.ServicioAlumno;


/**
 *
 * @author Anny
 */
public class Collection_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        ServicioAlumno s = new ServicioAlumno();
        
        s.fabricaAlumno();
        System.out.println("Ingrese el nombre a buascar ");
        String alumnoNombre = leer.next();
        s.notaFinal(alumnoNombre);
        s.mostrar();
    }

}
