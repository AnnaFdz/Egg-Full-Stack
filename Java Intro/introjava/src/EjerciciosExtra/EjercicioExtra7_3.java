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
public class EjercicioExtra7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        Realice un programa que calcule y visualice el valor mÃ¡ximo, el valor mÃ­nimo y el promedio
de n nÃºmeros (n>0). El valor de n se solicitarÃ¡ al principio del programa y los nÃºmeros
serÃ¡n introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle â€œwhileâ€� y otra con el bucle â€œdo - whileâ€�.
         */
        int num, minimo, maximo, suma = 0, cont = 0;
        float promedio;
        Scanner leer = new Scanner(System.in);
        minimo = 0;
        maximo = 0;
        while (true) {
            System.out.println("Ingrese un numero, paara finalizar ingrese 0 ");
            num = leer.nextInt();
            if (num != 0){
                cont = cont + 1;
                suma = suma + num;
                if (cont == 1){
                    maximo = num;
                    minimo = num;
                }
                if (num > maximo) {
                    maximo = num;
                }
                if (num < minimo) {
                    minimo = num;
                }
            }
            else{
                break;
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
