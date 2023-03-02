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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean asimetrico = true;
        for (int i = 0; i<(matriz.length); i++) {
            for (int j = 0; j <(matriz.length); j++) {
                if (matriz[i][j] <= 0) {
                    if (matriz[j][i] >= 0 && (matriz[i][j] * -1) == matriz[j][i]) {
                        //System.out.print(i+ " " + j +"-");
                    }

                } else if(matriz[j][i] <= 0 && matriz[i][j] == (matriz[j][i] * -1 )) {
                    
                } else{
                    asimetrico = false;
                    if (asimetrico== false){
                        break;
                    }
                }
            }

        } 
        if (asimetrico == true){
            
            System.out.println("la matriz es anti simetrica");
            
        } else {
            
            System.out.println("la matriz no es anti simetrica");
        }
                

    }

}
