/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_2;

import herencia_ejercicio_2_Entidades.Lavadora;
import herencia_ejercicio_2_Entidades.Televisor;

/**
 *
 * @author Anny
 */
public class Herencia_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Lavadora lava = new Lavadora();
        tv.crearTelevisor();
        lava.crearLavadora();
        tv.precioFinal();
        lava.precioFinal();
        System.out.println("el precio final del TV: "+tv.getPrecio());
        System.out.println("el precio final de la lavadora: "+lava.getPrecio());
        System.out.println("el color TV es "+tv.getColor());
        System.out.println("el color Lavadora es "+lava.getColor());
    }
}