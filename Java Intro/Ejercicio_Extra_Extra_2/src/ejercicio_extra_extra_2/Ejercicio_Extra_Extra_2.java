/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_extra_2;

import ejercicio_extra_extra_2_Entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Ejercicio_Extra_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Tiempo t= new Tiempo();
        System.out.println("Ingrese las horas");
        t.setHoras(sc.nextInt());
        System.out.println("Ingrese los minutos");
        t.setMinutos(sc.nextInt());
        System.out.println("Ingrese los segundos");
        t.setSegs(sc.nextInt());
        t.imprimirHoraCompleta();
    }
    
}
