/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales_en_Java;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un numero determine si es par o impar.
        int num;
        Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese un numero para ver si es par o impar");
        num=leer.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
    
}
