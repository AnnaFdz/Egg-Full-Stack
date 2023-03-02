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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuacion, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sÃ³lo una variable auxiliar.*/

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aux;
        System.out.println("VALORES INICIALES");
        System.out.println("A" + a);
        System.out.println("B" + b);
        System.out.println("C" + c);
        System.out.println("D" + d);
        System.out.println("VALORES FINALES ");
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("A" + a);
        System.out.println("B" + b);
        System.out.println("C" + c);
        System.out.println("D" + d);

    }

}
