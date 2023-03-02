/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primeros_ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Anny
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Escribir un programa que pida una frase y la muestre toda en mayusculas y despues toda
    //en minusculas. Nota: investigar la funcion toUpperCase() y toLowerCase() en Java.
  String frase;
  Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.next();
        frase = toUpperCase(frase);
        System.out.println("La frase ingresada en mayuscula es "+frase);
        frase= toLowerCase(frase);
        System.out.println("La frase ingresada en minuscula es "+frase);
        
        
                
          

    }
    
}