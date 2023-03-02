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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.
         */
        //int[][] matrizP = new int[3][3];
        //int[][] matrizM = new int[10][10];
        int[][] matrizP = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int[][] matrizM = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
           
        int x = 0;
        int y = 0;
        boolean posible = true, contenida = false;
        //System.out.println(matrizM.length - 4);
        for (int i = 0; i < (matrizM.length - 4); i++) {// recorre la matrizM hasta las posiciones 6x6 xq son las posibles mP mas alla de esas posiciones no entra
            for (int j = 0; j < (matrizM.length - 4); j++) {
                if (matrizP[0][0] == matrizM[i][j]) {//Si el valor de la 1ra posicion de la Matriz P es igual la posiciones de mM entra
                    
                    posible = true;//a este punto es posible q este la p en m
                    for (int k = 0; k < (matrizP.length); k++) {//se recorre mP en todas las posibles posiciones de mM
                        for (int l = 0; l < (matrizP.length); l++) {
                            if (matrizP[k][l] != matrizM[i + k][j + l]) {//si las posicines de mP son distintas de las mM recorriendo las posiciones Mp
                               // System.out.println("P[k=" + k + "][l=" + l + "] = " + matrizP[k][l] + " - M [i+k = " + (i + k) + "][j+l=" + (j + l) + "] = " + matrizM[i + k][j + l]);
                                posible = false;// si son todas distintas entonces no la contine y posible es falsa y sale
                                break;
                            } else {//si todas las posisiones de mP son == mM 
                                if (k == 2 && l == 2) {//si la ultima posicion mP esta entonces imprime donde la encontro
                                    System.out.println("Se ah encontrado la matriz MP desde "+(i) + "," + (j));
                                    x = i;//esto guarda en las variables de los indices de mP en mM
                                    y = j;
                                    contenida = true;//esta contenida
                                    break;

                                }
                            }
                        }
                        if (posible == false) {//si llego hasta aca o es posible q se encuentre y sale
                            break;
                        }

                    }

                }
                if (contenida == true){//si llego hasta aca y esta contenida no busca otra, sale(no pide buscar todas las contenidas con 1 basta)
                    break;
                }
            }
            if (contenida == true){
                break;
            }

        }
        if (contenida == true){//si esta contenida imprime los indices
            System.out.println("La matrizP se encuentra contenida en los indices: ");
            for (int i = x; i < x+3; i++){
                for (int j = y; j <y+3; j++){
                    System.out.print(i + "," + j + " - ");
                }
                
            }
            System.out.println("");
        }
        else{// si no esta dice q no esta
            System.out.println("La matrizP no se encuentra contenida en la matrizM");
        }

    }

}
