/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo_ejercicio_11;

import java.util.Date;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese ");
        System.out.println("Dia");
        dia = leer.nextInt();
        System.out.println("Mes");
        mes = leer.nextInt();
        System.out.println("Año");
        anio = leer.nextInt();
        
        Date fecha = new Date (anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
       String fechaString = fecha.toString();
        String fechaActString = fechaActual.toString();
        System.out.println(fechaString+fechaActString);
        //sin -1900 ni -1
       // System.out.println((fecha.getDate())+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900));
        System.out.println("La diferencia entre las fechas en años son: " +(fecha.getYear() -(fechaActual.getYear()) ));
    }
    
}
