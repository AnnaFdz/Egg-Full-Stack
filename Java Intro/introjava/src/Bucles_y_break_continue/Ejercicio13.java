/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_break_continue;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /*
         Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
        */
      int i, j, num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();

        for (i =1; i <= num; i++) {
            for (j =1; j <= num; j++) {
                
              if(i == 1 || i == num || j == 1 || j == num){
                  
                  System.out.print("* ");
                  
              } else{
                  System.out.print("  ");
              } 
                
            }
            System.out.println();
        }

    }

}
