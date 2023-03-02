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
public class EjercicioExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
         Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamañao del vector: ");
        int tam, suma=0;
        tam= leer.nextInt();
      int[] vector= new int[tam];
        System.out.println("Ingrese los valores del vector: ");
        for (int i = 0; i < tam; i++) {
            System.out.print("- ");
            vector[i]= leer.nextInt();
            suma= suma + vector[i];
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos del vector es: "+suma);
    }
    
}
