/*
 Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)

 */
package ejercicio_extra_extra_6;

import ejercicio_extra_extra_6_Entidad.SopaDeLetras;

/**
 *
 * @author Anny
 */
public class Ejercicio_Extra_Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        SopaDeLetras sopa = new SopaDeLetras();
        sopa.cargarSopa();
        do {
            System.out.println("Ingrese una palabra para buscar en la sopa de letras");
            sopa.setPalabra(leer.next().toUpperCase());
        } while (sopa.getPalabra().length() > 5);
        sopa.palabraUbicacion();
        sopa.imprimir();
        System.out.println("Ingrese una palabra a buscar y una a para remplazar");
        sopa.remplazarPalabra(leer.next().toUpperCase(), leer.next().toUpperCase());
        sopa.imprimir();
        System.out.println();
        System.out.println("-----------------");
        System.out.println();
        sopa.impriInvertida();
    }

}
