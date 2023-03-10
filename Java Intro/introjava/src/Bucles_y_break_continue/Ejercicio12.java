/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_break_continue;

import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
        */
    
         Scanner leer = new Scanner(System.in);
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        String cadena;
        String FDE = "&&&&&";
               

        do {
            System.out.println("Ingrese la cadena");
            cadena = leer.next();
            if (cadena.length() <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length() - 1, cadena.length()).equals("O")) {

                contadorPositivo++;
            } else {
                if (!cadena.equals(FDE)) {
                    contadorNegativo++;
                }
            }
   } while (!cadena.equals(FDE));

        System.out.println("Los positivos son: " + contadorPositivo + " y los casos negativos son: " + contadorNegativo);
    }

}