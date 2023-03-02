/*
  Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package poo_ejercicio_10;

import java.util.Arrays;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      double [] arregloA = new double [50];
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i]= (double) (Math.random()*100); 
        }
        System.out.println("Arreglo A");
        System.out.println(Arrays.toString(arregloA));
         System.out.println("Arreglo A ordenado de menor a mayor");
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Se copian los primeros 10 numeros ordenados del Arreglo A y se rellena el Arreglo B con los ultimos elemenros valores de 0 a 5");
        
        
        double [] arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20,  0.5f);
        System.out.println(Arrays.toString(arregloB));
        System.out.println("");
        
    }
    
    
}
