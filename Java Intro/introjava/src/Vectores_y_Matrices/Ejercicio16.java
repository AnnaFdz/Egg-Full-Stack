/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
         Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar el tamaño del vector");
        int tam_vec, num;
       
        tam_vec = leer.nextInt();
        int[] vector= new int[tam_vec];
        boolean encontrado = false;
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*100);
            
        }
        for (int i=0; i<(vector.length); i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("Ingrese un numero para buscar");
        num = leer.nextInt();
        for (int i =0; i< vector.length; i++) {
            if (num == vector[i]){
                System.out.println("Se encontro el numero: " +num+ "en la posicion"+(i+1));
                encontrado = true;
            }
        }
        if (encontrado == false){
            System.out.println("No se encontro ningun numero:( ");
        }
    }
    
}
