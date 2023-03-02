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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Una obra social tiene tres clases de socios:
o Los socios tipo â€˜Aâ€™ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo â€˜Bâ€™ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo â€˜Câ€™, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carÃ¡cter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
        
        */
        Scanner leer = new Scanner(System.in);
        String letra;
       int costo;
       do{
        System.out.println("Ingrese un tipo de socio :");
        letra = leer.next();
        letra = letra.toUpperCase();
       
       }while(!letra.equals("A")&&!letra.equals("B")&& !letra.equals("C") );
       
        System.out.println("Ingrese costo de los tratamientos:");
        costo = leer.nextInt();
        switch (letra) {
            
            case "A":
                    System.out.println("El costo total con un 50% de descuento es: "+ costo*0.50);//(costo-(costo*0.5))
                break;
            case "B":
                    System.out.println("El costo total con un 35% de descuento es: "+ costo*0.65);
                break;
            case "C":
                    System.out.println("El costo total sin descuento es: "+ costo);
                break;
           
        }
   
    }
    
}
