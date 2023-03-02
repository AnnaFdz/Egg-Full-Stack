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
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Simular la divisiÃ³n usando solamente restas. Dados dos nÃºmeros enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sÃ³lo restas. MÃ©todo:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el nÃºmero de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 - 13 = 37 una resta realizada
37 - 13 = 24 dos restas realizadas
24 - 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
Â¿AÃºn no lo entendiste? Recomendamos googlear divisiÃ³n con restas sucesivas.
        */
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int resto = 0;
        int cociente = 0;
        System.out.println("Ingrese 2 numeros enteros mayores a 1: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do{
            resto = num1 - num2;
            System.out.println(num1 + " -  "+ num2 +" = "+ resto+ " contador "+ (cociente+1) +" resta realizada");
            num1 = resto;
            cociente++;
            
            
        } while (resto >= num2);
        System.out.println("El cociente es: "+ cociente+ " y el resto es: "+resto);
    }
    
}
