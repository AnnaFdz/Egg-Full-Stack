/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author Anny
 */
public class EjercicioExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”
        */
          java.util.Scanner leer = new java.util.Scanner(System.in);
        String nombre,resp;
        int edad;
        do {
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            impresion(nombre, edad);
            System.out.println("¿Desea continuar? (No para salir)");
            resp = leer.next();
        } while (!"No".equalsIgnoreCase(resp));

    }

    public static void impresion(String nombre, int edad) {
        String respuesta;
        if (edad >= 18) {
            respuesta = "mayor";
        } else {
            respuesta = "menor";
        }
        System.out.println(nombre + " de " + edad + " años es " + respuesta + " de edad");
    }
}
