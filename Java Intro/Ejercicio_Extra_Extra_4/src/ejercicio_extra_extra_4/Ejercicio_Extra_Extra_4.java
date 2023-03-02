/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_extra_4;

import ejercicio_extra_extra_4_Entidad.Fecha;

/**
 *
 * @author Anny
 */
public class Ejercicio_Extra_Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        Fecha f = new Fecha(1, 1, 1900);
        System.out.println("Ingrese una fecha");
        System.out.print("dia: ");
        f.setDia(leer.nextInt());
        System.out.print("mes: ");
        f.setMes(leer.nextInt());
        System.out.print("año: ");
        f.setAnio(leer.nextInt());
        f.verifAnio();
        f.diasTotalesdelMes();
        f.diaAnterior();
        f.diaPosterior();
        if (f.anioBisiesto()){
            System.out.println("El año es bisiesto");
        } else{
            System.out.println("El año no es bisiesto");
    }
        System.out.println(f.toString());
        
    
}
}
