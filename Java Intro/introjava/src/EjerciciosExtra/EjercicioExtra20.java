/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class EjercicioExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamañao del vector: ");
        int tam;
        tam= leer.nextInt();
        int[] vector= new int[tam];
        llenarV(vector);
        imprimirV(vector);
    }
    public static void llenarV(int[] vector){
        for (int i = 0; i < (vector.length); i++) {
            
            vector[i]= (int)(Math.random()*10);
        }
    }
    public static void imprimirV(int[] vector){
         for (int i=0; i<(vector.length); i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
}
