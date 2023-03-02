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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra con A como primera letra");
        String palabra;
        palabra = leer.nextLine();
        
        if(palabra.substring(0,1).equals("A")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
        
    }
}       

