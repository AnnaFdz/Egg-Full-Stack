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
public class EjercicioExtra7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”
         */
        int num, minimo, maximo, suma = 0, cont = 0;
        float promedio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero, paara finalizar ingrese 0 ");
        num = leer.nextInt();
        maximo = num;
        minimo = num;
        while (0 != num) {
            cont = cont + 1;
            suma = suma + num;
            System.out.println("Ingrese un numero, paara finalizar ingrese 0 ");
            num = leer.nextInt();
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo && num != 0) {
                minimo = num;
            }
        }
        if (cont != 0) {
            promedio = suma / cont;
            System.out.println("El promedio es: " + promedio + " El maximo: " + maximo + " el minimo: " + minimo);
        } else {
            System.out.println("No se puede calcular el promedio");
        }
    }
}
