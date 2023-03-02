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
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
         */
        Scanner leer = new Scanner(System.in);
        float num ;
        int contNum= 0, contPar=0, contImpar=0;
        do {
            System.out.println("Ingrese numeros hasta que sea multiplo de 5");
            num = leer.nextFloat();
            contNum++;
            if (num%2!=0 && num!=(num%5)){
                contImpar++;
               
            }else if (num%2==0) {
                contPar++;
            } if (num%5==0){
                
                break;
            }
          

        } while (num>0);
//        do {
//            System.out.println("Ingrese numeros hasta que sea multiplo de 5");
//            num = leer.nextFloat();
//            contNum++;
//            if (num%2!=0 && num!=(num%5)){
//                contImpar++;
//                
//            }else if (num%2==0) {
//                contPar++;
//            }
//
//        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros ingresados es : "+contNum+" la cantidad de numeros pares es: "+contPar+" la cantidad de numeros impares es: "+contImpar);
    }

}
