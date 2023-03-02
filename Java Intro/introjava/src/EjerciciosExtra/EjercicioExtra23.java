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
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        /*
        Construya un programa que lea 5 palabras de mÃ­nimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una â€œsopa de letras para niÃ±osâ€� de tamaÃ±o de
20 x 20 caracteres. Las palabras se ubicarÃ¡n todas en orden horizontal en una fila que
serÃ¡ seleccionada de manera aleatoria. Una vez concluida la ubicaciÃ³n de las palabras,
rellene los espacios no utilizados con un nÃºmero aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberÃ¡ investigar cÃ³mo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
         */
        int pl = 1, pz = 0, ph=(int) (Math.random() * (20 - 5)), pi=(int) (Math.random() * 20);
        String[][] matriz = new String[20][20];
        String p1 = "r";
        
        System.out.println("Ingrese la palabra para introducir en la sopa de letras");
        do {
            switch (pl) {
                case 1:
                    System.out.println("Primera Palabra");
                    p1 = leer.next();
                    break;
                case 2:
                    System.out.println("Segunda Palabra");
                    p1 = leer.next();
                    break;
                case 3:
                    System.out.println("Tercera Palabra");
                    p1 = leer.next();
                    break;
                case 4:
                    System.out.println("Cuarta Palabra");
                    p1 = leer.next();
                    break;
                case 5:
                    System.out.println("Ultima Palabra");
                    p1 = leer.next();
                    break;
            }
            
            if (p1.length() < 6 && p1.length() > 2 ) {
                pl++;
                for (int j = ph; j < ph + p1.length(); j++) {
                    matriz[pi][j] = p1.substring(pz, pz + 1);
                    pz++;
                }
                pz = 0;
                do{
                ph = (int) (Math.random() * (20 - p1.length()));  
                pi = (int) (Math.random() * 20);
                }while(matriz[pi][ph]!=null);
            } else {
                System.out.println("La palabra ingresada es incorrecta");
            }
        } while (pl != 6);
//--------------------------------------------------------------------------------------------
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j]==null){
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
