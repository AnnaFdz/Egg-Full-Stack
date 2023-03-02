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
package ejercicio_extra_extra_6_Entidad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class SopaDeLetras {

    java.util.Scanner leer = new java.util.Scanner(System.in);
    private String[][] matriz;
    private String palabra;

    public SopaDeLetras() {
    }

    public SopaDeLetras(String palabra) {
        this.palabra = palabra;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void cargarSopa() {
        // matriz = new char[][]{
//            {'A', 'F', 'C', 'S', 'O', 'P', 'A', 'W', 'R', 'Y'},
//            {'G', 'A', 'T', 'O', 'K', 'F', 'U', 'R', 'I', 'X'},
//            {'P', 'E', 'H', 'J', 'M', 'Q', 'R', 'I', 'V', 'C'},
//            {'A', 'L', 'G', 'C', 'D', 'O', 'W', 'O', 'P', 'F'},
//            {'T', 'O', 'A', 'T', 'R', 'U', 'O', 'K', 'B', 'D'},
//            {'O', 'D', 'E', 'D', 'T', 'I', 'R', 'O', 'R', 'Y'},
//            {'E', 'K', 'A', 'I', 'L', 'P', 'E', 'Z', 'T', 'Z'},
//            {'J', 'S', 'I', 'Y', 'A', 'X', 'H', 'O', 'S', 'O'},
//            {'M', 'U', 'C', 'H', 'O', 'R', 'A', 'T', 'A', 'Q'},
//            {'U', 'A', 'S', 'G', 'P', 'E', 'R', 'R', 'O', 'S'}
//        };

        matriz = new String[][]{
            {"A", "F", "C", "S", "O", "P", "A", "W", "R", "Y"},
            {"G", "A", "T", "O", "K", "F", "U", "R", "I", "X"},
            {"P", "E", "H", "J", "M", "Q", "R", "I", "V", "C"},
            {"A", "L", "G", "C", "D", "O", "W", "O", "P", "F"},
            {"T", "O", "A", "T", "R", "U", "O", "K", "B", "D"},
            {"O", "D", "E", "D", "T", "I", "R", "O", "R", "Y"},
            {"E", "K", "A", "I", "L", "P", "E", "Z", "T", "Z"},
            {"J", "S", "I", "Y", "A", "X", "H", "O", "S", "O"},
            {"M", "U", "C", "H", "O", "R", "A", "T", "A", "Q"},
            {"U", "A", "S", "G", "P", "E", "R", "R", "O", "S"}
        };
    }

    public void palabraUbicacion() {
        boolean encontrar = false;
        int posicion1 = 0, posicion2 = 0;
        int cont = 0, cont2 = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j].equals(palabra.substring(cont, cont + 1))) {
                    cont++;
                    // cont2++;
                } else {
                    cont = 0;
                }
                if (palabra.length() == cont) {
                    System.out.println("La palabra esta en la posicion " + i + ", " + (j - palabra.length() + 1));
                    encontrar = true;
                    posicion1 = i;
                    posicion2 = (j - palabra.length() + 1);
                    break;
                }
            }
            if (encontrar) {
                break;
            }
        }

        if (encontrar == false) {
            System.out.println("La palabra no se encuentra en la sopa de letras");
        }
        // int[]posicionPalabra={posicion1,posicion2
        // return null;

    }

    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*
    Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
     */
    public void remplazarPalabra(String perro, String pollo) {

        palabra = perro;
        boolean encontrar = false;
        int posicion1 = 0, posicion2 = 0;

        int cont = 0, cont2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j].equals(palabra.substring(cont, cont + 1))) {
                    cont++;

                } else {
                    cont = 0;
                }
                if (palabra.length() == cont) {
                    System.out.println("La palabra esta en la posicion " + i + ", " + (j - palabra.length() + 1));
                    encontrar = true;
                    posicion1 = i;
                    posicion2 = (j - palabra.length() + 1);
                    break;

                }

            }
            if (encontrar) {
                break;
            }
        }

        int k=posicion2;
        

            for (int j = 0; j < palabra.length(); j++) {

                matriz[posicion1][k] = (pollo.substring(cont2, cont2 + 1));
                cont2++;
                k++;

            }
        
        if (encontrar == false) {
            System.out.println("La palabra no se encuentra en la sopa de letras");
        }
    }
    public void impriInvertida(){
        System.out.println("Sopa de letras Invertda:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
        
    }
}

