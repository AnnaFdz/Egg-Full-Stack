/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author Anny
 */
public class EjercicioExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
         */
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese el valor N y el valor M de una Matriz NxM ");
        System.out.print("N: ");
        int N = leer.nextInt();
        System.out.print("M: ");
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma = suma + matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(suma);
    }

}
