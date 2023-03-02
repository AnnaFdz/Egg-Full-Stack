/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcione_ejercicio_5_Entidad;

import java.util.InputMismatchException;
import javafx.scene.transform.Scale;

/**
 *
 * @author Anny
 */
public class AdivinarNumero {

    
    private int num;
    private int num_ingresado;
    private int intentos;

    public AdivinarNumero() {
    }

    public AdivinarNumero(int num, int num_ingresado, int intentos) {
        this.num = num;
        this.num_ingresado = num_ingresado;
        this.intentos = intentos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum_ingresado() {
        return num_ingresado;
    }

    public void setNum_ingresado(int num_ingresado) {
        this.num_ingresado = num_ingresado;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "AdivinarNumero{" + "num=" + num + ", num_ingresado=" + num_ingresado + ", intentos=" + intentos + '}';
    }

    public int aleatorio() {

        return this.num = ((int) (Math.random() * 500 + 1));
    }

    public void iniciarJuego() {
        aleatorio();
        //System.out.println(num);

        int intentos = 0;
        do {
            java.util.Scanner leer = new java.util.Scanner(System.in);
            System.out.println("Adivine el numero secreto: ");
            try {
                this.num_ingresado = leer.nextInt();
            
            if (num == num_ingresado) {
                System.out.println("Adivinaste!!!");
            } else if (num_ingresado < num) {
                System.out.println("Te equivocaste! En numeroque ingresaste es menor que el numero secreto");

            } else {
                System.out.println("Te equivocaste! En numeroque ingresaste es mayor que el numero secreto");

            }
            } catch (InputMismatchException e) {
                System.out.println("Error! no ingresasate un numero! " + e);
                
            }
            intentos++;
        } while (num != num_ingresado);
        System.out.println("Ganaste! tuviste "+intentos+" intentos. El numero secreto es: "+num);
    }

}
