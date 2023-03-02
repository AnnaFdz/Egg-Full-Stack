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
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
         */
        String letra = "E", unidad, decena, centena;
        int[] cont = {0, 0, 0}; //declaramos un vector 'cont' inicializado en 0
        System.out.println(cont[0] + "-" + cont[1] + "-" + cont[2]); //Imprimo el vector con'000'. Podria tam estar en bucle for antes de la sumar 1 al contador
        for (int i = 1; i < (999); i++) { //bucle for de 1 a 999
            cont[2] = cont[2] + 1; //se le suma de a 1 al vector. 1ro en la ultima posicion, para obtener 001 y vaya aumentando de derecha a izquierda 
            if (cont[2] == 10) { //si la ultima posicion es = 10, el numero acumulado vuelve a 0(ira de 0 a 9)
                cont[2] = 0;
                cont[1] = cont[1] + 1; // en la penultima posicion hacemos lo mismo, q vaya de 0 a 9
                if (cont[1] == 10) {
                    cont[1] = 0;
                    cont[0] = cont[0] + 1; // se repite en la 1era posicion
                    if (cont[0] == 10) {// improbable q pase
                        cont[0] = 0;
                        System.out.println("no pasara");
                    }
                }//hasta aqui tenemos el contador q va de 000 a 999. Todo en Int (un vector)
            } //ahora hay q convertirlo a string | con replaces se pude remplazar un caracter con''
            centena = String.valueOf(cont[0]); //centena almacena el valos numerico de la 1era posicion
            if (cont[0] == 3) { //si encuentra el valor 3 en la cadena los remplaza x la letra "E" q antes fue inicializada
                centena = letra;
            }                               //Se repite lo mismo con decenas y unidades
            decena = String.valueOf(cont[1]);
            if (cont[1] == 3) {
                decena = letra;
            }
            unidad = String.valueOf(cont[2]);
            if (cont[2] == 3) {
                unidad = letra;
            } //por ultimo se imprime cada elemento
            System.out.println(centena + "-" + decena + "-" + unidad);
        }
    }
}
