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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1, num2, op, result;
        String r; //= null;//r inicializada
        r="n";
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    result = num1 + num2;
                    System.out.println("La suma de los numeros es " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("La resta de los numeros es " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("La division de los numeros es " + result);
                    break;
                case 5:
                    System.out.println("Seguro que desea salir? s/n");
                    r = leer.next();
                 
                    break;
            }
        } while (!r.equalsIgnoreCase("s"));

    }
}
