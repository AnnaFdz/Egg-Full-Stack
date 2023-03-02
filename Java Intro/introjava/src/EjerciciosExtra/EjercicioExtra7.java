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
public class EjercicioExtra7 {

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
        int num = 0, minimo = num, maximo = num, suma = 0, cont = 0;
        float promedio;
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese un numero, paara finalizar ingrese 0 ");
//        num = leer.nextInt();

        do {
            System.out.println("Ingrese un numero, para finalizar ingrese 0 ");
            num = leer.nextInt();
            suma = suma + num;
            if (num != 0) {
                cont++;
                if (cont == 1) {
                    minimo = num;
                    maximo = num;
                }
                if (num > maximo) {
                    maximo = num;
                }
                if (num < minimo) {
                    minimo = num;
                }
            }

        } while (0 != num);
        if(cont!= 0){
        promedio = suma / cont;
        System.out.println("El promedio es: " + promedio + " El maximo: " + maximo + " el minimo: " + minimo);

        }
        else{
            System.out.println("No se puede calcular el promedio");
            }
    }
}
