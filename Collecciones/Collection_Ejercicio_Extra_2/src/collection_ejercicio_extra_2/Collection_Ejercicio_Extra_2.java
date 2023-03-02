/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ejercicio_extra_2;

import collection_ejercicio_extra_2_Entidad.CantanteFamoso;
import collection_ejercicio_extra_2_Servicio.ServicioCantante;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Collection_Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        Se debe, ademÃ¡s, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con mÃ¡s ventas por pantalla. 
Una vez agregado los 5, en otro bucle, crear un menÃº que le de la opciÃ³n al usuario de
agregar un cantante mÃ¡s, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberÃ¡ mostrar la lista con todos los
cambios.
         */
        Scanner leer = new Scanner(System.in);
        CantanteFamoso a = new CantanteFamoso("Pedro", "Pileta");
        ServicioCantante t = new ServicioCantante();

        int opc;

        for (int i = 0; i < 5; i++) {
            t.definirCantante();

        }

        do {
            System.out.println("MENU");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            System.out.println("Elija opcion:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    t.definirCantante();

                    break;
                case 2:
                    t.mostrarCantantes();
                    break;
                case 3:
                    t.borrarCantante();

                    break;
            }
        } while (opc != 4);
        t.mostrarCantantes();

    }

}
