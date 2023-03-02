/*
 *Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicio_extra_extra_1;

import ejercicio_extra_extra_1_Fraccion.Fraccion;
import ejercicio_extra_extra_1_Fraccion.ServicioFraccion;

/**
 *
 * @author Anny
 */
public class Ejercicio_Extra_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioFraccion sf = new ServicioFraccion();
       
       Fraccion fr = sf.crearFraccion();
       sf.menu(fr);
       
    }
    
}
