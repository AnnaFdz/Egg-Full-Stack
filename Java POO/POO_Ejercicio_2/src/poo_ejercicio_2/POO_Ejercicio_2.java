/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_2;

import poo_ejercicio_2_Entidad.Circunferencia;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println(c1.getRadio()+"  "+c1.getArea()+"  "+c1.getPerimetro());
    }
    
}
