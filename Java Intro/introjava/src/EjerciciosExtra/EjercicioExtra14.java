/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
         Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
        */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int familia, hijosFam,edad;
        double hijosTotal = 0, edadTotal = 0;
        System.out.println("Ingrese la cantidad de familias");
        familia = sc.nextInt();
        for (int i = 0; i < familia; i++) {
            System.out.print("Cantidad de hijos de la familia " + (i + 1) + ": ");
            hijosFam = sc.nextInt();
            hijosTotal += hijosFam;
            for (int j = 0; j < hijosFam; j++) {
                System.out.print("Edad de hijo " + (j + 1) + ": ");
                edad = sc.nextInt();
                edadTotal += edad;
            }
        }
        System.out.println("La edad promedio de los hijos de las familias es: " + (edadTotal/hijosTotal));
    }

}

