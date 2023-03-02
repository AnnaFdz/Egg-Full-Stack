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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Crear un programa que pida una frase y si esa frase es igual a â€œeurekaâ€� el programa
        pondrÃ¡ un mensaje de Correcto, sino mostrarÃ¡ un mensaje de Incorrecto. Nota: investigar
        la funciÃ³n equals() en Java.
        */
        Scanner leer = new Scanner (System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        if (frase.equals("eureka")){
            
        System.out.println("La frase ingresada es correcta ");
        } else {
        System.out.println("La frase ingresada es incorrecta ");
        }
    }
    
}