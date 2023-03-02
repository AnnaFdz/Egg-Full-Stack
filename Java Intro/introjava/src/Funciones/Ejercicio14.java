/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /*
         Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que quiere convertir a otra moneda");
        double euros;
        String dolares, yenes, libras;
        int op;
        euros = leer.nextDouble();
         do {
            
            System.out.println("1.Convertir a libras");
            System.out.println("2.Convertir a dolares");
            System.out.println("3.Convertir a yenes");
             System.out.println("Elija una opcion numerica"); 
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cambio(euros,"libras");
                    break;
                case 2:
                    cambio(euros,"dolares");
                    break;
                case 3:
                     cambio(euros,"yenes");
                    break;
               
            }
        } while (op > 3);
        
   
    }
    public static void cambio(double euros, String moneda){
        double resul = 0.0;
        if (moneda.equals("libras")){
            resul = (euros * 0.86 )/ 1 ;
            System.out.println(euros+" equivalen a "+resul+" libras");
        }else if(moneda.equals("dolares")){
            resul = (euros * 1.28611  )/ 1 ;
            System.out.println(euros+" equivalen a "+resul+" dolares");
        }else if (moneda.equals("yenes")){
            resul = (euros * 129.852  )/ 1 ;
            System.out.println(euros+" equivalen a "+resul+" yenes");
        }
    }
}
