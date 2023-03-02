/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //* Un cuadrado magico 3 x 3 es una matriz 3 x 3 formada por numeros del 1 al 9 donde la
/*suma de sus filas, sus columnas y sus diagonales son identicas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es magico o no.
El programa debera comprobar que los numeros introducidos son correctos, es decir,
    estan entre el 1 y el 9.*/

        //int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int sumad, sumad2, sumaf, sumac, numMag;
        boolean magico = true;

        int[][] matriz = new int[3][3];
        for (int i = 0; i < (matriz.length); i++) {
            for (int j = 0; j < (matriz.length); j++) {
                do {
                    Scanner leer = new Scanner(System.in);
                    System.out.print("Ingrese un numero del 1 al 9 para la fila " + (i + 1) + " y la columna " + (j + 1) + ": ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] >= 10 || matriz[i][j] < 1);
            }
            System.out.println("");
        }
        for (int i = 0; i < (matriz.length); i++) {
            for (int j = 0; j < (matriz.length); j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }

        numMag = 0;
        for (int i = 0; i < (matriz.length); i++) {
            numMag += matriz[i][i];

        }

        sumad = 0;
        sumad2 = 0;
        for (int i = 0; i < (matriz.length); i++) {
            sumaf = 0;
            sumac = 0;
            for (int j = 0; j < (matriz.length); j++) {
                sumaf += matriz[i][j];
                sumac += matriz[j][i];
                if (i == j) {
                    sumad += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    sumad2 += matriz[i][j];

                }
            }
            if (sumaf != numMag || sumac != numMag) {
                magico = false;
            }

        }
        if (sumad != numMag) {
            magico = false;
        }
        if (magico == true) {
            System.out.println("La matriz ingresada es magica y su suma es: " + numMag);
        } else {
            System.out.println("La matriz no es magica");
        }
    }

}
