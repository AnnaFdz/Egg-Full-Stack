/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Excepciones_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*
        Definir una Clase que contenga algÃºn tipo de dato de tipo array y agregue el cÃ³digo para
generar y capturar una excepciÃ³n ArrayIndexOutOfBoundsException (Ã­ndice de arreglo fuera
de rango).
         */
        java.util.Scanner leer = new java.util.Scanner(System.in);

        ArrayList nombres = new ArrayList();

        String nombre1 = "Pablo", nombre2 = "Alex", nombre3 = "Juana", nombre4 = "Perro";

        nombres.add(nombre1);
        nombres.add(nombre2);
        nombres.add(nombre3);
        nombres.add(nombre4);

        try {
            
                System.out.println(nombres.get(-700));

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("El ArrayList no es tan grande");
        }

    }

}
