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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable 
        //y lo muestre por pantalla.
        
        String nombre; 
        
        Scanner leer = new Scanner(System.in);

        
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
   
        System.out.println("El nombre ingresado es "+nombre );
        
        
    }
    
}