/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primeros_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
   Scanner leer = new Scanner(System.in);
   long num;
        System.out.println("Ingrese un numero para averiguar su valor doble, triple y su raiz");
        num=leer.nextLong();
        System.out.println("El valor doble del numero ingresado es:"+num*2 );
        System.out.println("El valor triple del numero ingresado es "+num*3);
        System.out.println("La raiz del numero ingresado es: "+Math.sqrt(num));
        
    }
    
}
