/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package poo_ejercicio_extra_extra_7;

import poo_ejercicio_extra_extra_7_Entidad.Auto;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_Extra_Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setKm_motor(7500);
        auto1.cargarFicha();
        System.out.println(auto1.toString());
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        auto1.cambioTitularidad();
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.println(auto1.kmTotal());
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        auto1.realizarService();
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.println(auto1.toString());
    }
    
}
