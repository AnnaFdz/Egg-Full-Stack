/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_1;

import herencia_ejercicio_1_Entidad.Animal;
import herencia_ejercicio_1_Entidad.Caballo;
import herencia_ejercicio_1_Entidad.Gato;
import herencia_ejercicio_1_Entidad.Perro;

/**
 *
 * @author Anny
 */
public class Herencia_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal perro1 = new Perro("Pablo", "Caniche", "Pollo", 3);
        perro1.alimentarse();

        Animal gato1 = new Gato("Enrique", "Atigrado", "Pescado", 8);
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Juan", "Blanco", "Pasto", 6);
        caballo1.alimentarse();
    }

}
