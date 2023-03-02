/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

/**
 *
 * @author Anny
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).

        int[][] matriz = new int[4][4];

       for (int i = 0; i<(matriz.length); i++) {
            for (int j = 0; j <(matriz.length); j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");

        for (int j = 0; j <(matriz.length); j++) {
            for (int i = 0; i<(matriz.length); i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
