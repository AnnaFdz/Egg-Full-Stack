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
public class EjercicioExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
         Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false.
        */
        Scanner leer = new Scanner(System.in);
       double num;
       
        System.out.println("Ingrese un numero para ver si es primo o no");
        num = leer.nextDouble();
        verificacionPrimo(num);
    }
    public static void  verificacionPrimo(double num){
        boolean primo= false;
        int cont=0;
        for (int i = 1; i <= num; i++) {
            if (num%1==0&& num%num==0){
                cont++;
            }
            if (cont<=2){
                primo =true;
            }else {
                primo= false;
            }
            
        }
        if (primo == true){
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo");
        }
    }

}
