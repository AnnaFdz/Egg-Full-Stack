/*
  /*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

 */
package relaciones_ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import relaciones_ejercicio_1_Entidad.Perro;
import relaciones_ejercicio_1_Entidad.Persona;

/**
 *
 * @author Anny
 */
public class Relaciones_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Perro> perros = new ArrayList<>();
        List<Perro> perros2 = new ArrayList<>();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.setNombre("Fernanda");
        p1.setApellido("Diaz");
        p1.setDocumento(123455);
        p1.setEdad(24);
        p2.setNombre("Fernando");
        p2.setApellido("Duarte");
        p2.setDocumento(21543);
        p2.setEdad(27);
        Perro prr1 = new Perro("Fufo", "Ovejero_Aleman", "grande", 3);
        Perro prr2 = new Perro("Leeloo", "Golden_Retriever", "mediano", 5);
        perros.add(prr1);
        perros2.add(prr2);
        p1.setPerros(perros);
        p2.setPerros(perros2);
        System.out.println(p1.toString());
        System.out.println("--------------------");
        System.out.println("");
        System.out.println(p2.toString());
        System.out.println("--------------------");
        System.out.println("");
    }
}
