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
public class Ejercicio1 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Escribir un programa que pida dos números enteros por teclado 
         //y calcule la suma de los dos. El programa deberá después 
         //mostrar el resultado de la suma
    int num1, num2, suma; 
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1+num2;
        System.out.println("La suma de "+ num1+ " y " +num2+ " es "+suma);

    }
    
}
