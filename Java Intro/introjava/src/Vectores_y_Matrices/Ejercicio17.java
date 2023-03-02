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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
        */
      Scanner leer = new Scanner(System.in);
        
        int tam, des;
        
        System.out.println("Ingrese el tamaño del vector:");
        tam = leer.nextInt();
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        int[] vector = new int[tam];
        System.out.println("-------------------");
        for(int i=0; i<vector.length ; i++){
            vector[i] = (int) (Math.random()*99999);
            System.out.println(vector[i]+" ");
        }
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]<10){
                c1++;
            } else if(vector[i]<100){
                c2++;
            } else if(vector[i]<1000){
                c3++;
            } else if(vector[i]<10000){
                c4++;
            } else if(vector[i]<100000){
                c5++;
            } 
        }
        
        System.out.println("Se encontraron " + c1 + " numeros de un digito");
        System.out.println("Se encontraron " + c2 + " numeros de dos digitos");
        System.out.println("Se encontraron " + c3 + " numeros de tres digitos");
        System.out.println("Se encontraron " + c4 + " numeros de cuatro digitos");
        System.out.println("Se encontraron " + c5 + " numeros de cinco digitos");
     
    }
    
}