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
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
        Scanner leer = new Scanner(System.in);
        int nPersonas;
        double promedio = 0;
        double promedioMenor = 0;
        int contador = 0;
        double altura;
        System.out.println("Ingrese la cantidad de personas:");
        nPersonas = leer.nextInt();
        
        for (int i = 1; i <= nPersonas; i++) {
            System.out.println("Ingrese la altura en CM. para la persona "+i+": ");
            altura = leer.nextDouble();
            if(altura <= 160){
                contador++;
                promedioMenor = promedioMenor + altura;
                
            } 
            promedio = promedio + altura;
        }
        
        System.out.println("El promedio de "+contador+ " personas menores a 1.60m es: "+ (promedioMenor/contador+ "cm"));
        System.out.println("El promedio de "+nPersonas+ " es: "+ (promedio/nPersonas+ "cm"));
    }
    
}
