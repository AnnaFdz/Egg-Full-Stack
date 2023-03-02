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
public class Ejercicio19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es anti simÃ©trica. Se dice que una
matriz A es anti simÃ©trica cuando Ã©sta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simÃ©trica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
        int[][] matriz = {{0, 2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] transpuesta = new int[3][3];
        boolean asimetrico = true;
         for (int i = 0; i<(transpuesta.length); i++) {
            for (int j = 0; j <(transpuesta.length); j++) {

                transpuesta[j][i] = matriz[i][j];

            }

        }

        // imprime original
        for (int i = 0; i<(matriz.length); i++) {
            for (int j = 0; j <(matriz.length); j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----");
        // imprime traspuesta
        for (int i = 0; i<(transpuesta.length); i++) {
            for (int j = 0; j <(transpuesta.length); j++) {

                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
    // compara posicion x posicion de las 2 matrices
        for (int i = 0; i<(matriz.length); i++) {
            for (int j = 0; j <(matriz.length); j++) {
                if (matriz[i][j] == (transpuesta[i][j] * -1)) {

                }else {
                    asimetrico= false;
                    if (asimetrico==false){
                        break;
                    }
                }
            }
        }
        
        if (asimetrico== true) {

            System.out.println("la matriz es anti simetrica");

        } else {
            System.out.println("la matriz no es anti simetrica");
        }

    }
}
