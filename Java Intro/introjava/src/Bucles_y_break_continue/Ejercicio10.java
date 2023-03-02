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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite positivo");
        int limite, num, suma;
        limite = leer.nextInt();
        suma = 0;
        do {
            System.out.println("Ingrese numeros que se sumaran hasta superar el limite antes agregado");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma < limite);
        System.out.println("La suma de los numeros ingresados es " + suma);
    }
}
