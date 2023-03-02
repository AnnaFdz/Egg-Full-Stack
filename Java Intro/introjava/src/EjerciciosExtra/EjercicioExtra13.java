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
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123

        */
        Scanner leer = new Scanner(System.in);
        int numLineas;
        System.out.println("Ingrese la altura de la escalera de numeros");
        numLineas= leer.nextInt();
        System.out.println("********************");
        for ( int i = 1 ; i <= (numLineas); i++) {
            for ( int j = 1; j <= i ; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
        }
//        for ( int lineas = 1 ; lineas <= (numLineas); lineas++) {
//            for ( int num = 1; num <= lineas ; num++) {
//                System.out.print(num);
//                
//            }
//            System.out.println("");
//        }
    }
    
}
