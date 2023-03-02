/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class EjercicioExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
         */
        Scanner leer = new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño de los vectores a comparar: ");
        tam = leer.nextInt();
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];
/*
        Para comprobar y escribir uno miusmo los vaores de los vectores:
        */
//        System.out.println("Ingrese los valores del vector1: ");
//        for (int i = 0; i < tam; i++) {
//            // vector1[i] = leer.nextInt();
//               System.out.print(vector1[i] + " ");
//        }
//        System.out.println("");
//
//        System.out.println("Ingrese los valores del vector2");
//        for (int i = 0; i < tam; i++) {
//            vector2[i] = leer.nextInt();
//            System.out.print(vector2[i] + " ");
//        }
//        System.out.println("");
//      
        //------------------------------------
        for (int i = 0; i < tam; i++) {

            vector1[i] = (int) (Math.random() * 2);
            System.out.print(vector1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {

            vector2[i] = (int) (Math.random() * 2);
            System.out.print(vector2[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < tam; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores no son iguales");
                break;

            }

        }
        if (Arrays.equals(vector1, vector2)) {
            System.out.println("Los vectores son iguales");
        }
    }

}
