/*
 /*
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros
 */
package relaciones_ejercicio_extra_1;

import java.util.ArrayList;
import java.util.List;
import relaciones_ejercicio_extra_1_Entidades.Perro;
import relaciones_ejercicio_extra_1_Entidades.Persona;
import relaciones_ejercicio_extra_1_Servicio.ServicioPersona;

/**
 *
 * @author Anny
 */
public class Relaciones_Ejercicio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        ServicioPersona spp = new ServicioPersona();
        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdoptados = new ArrayList();
        System.out.println("Cuantas personas desea crear? ");
        int cantidadPersonas = leer.nextInt();
        for (int i = 0; i < cantidadPersonas; i++) {
            personas.add(spp.crearPersona());

        }
        System.out.println("Cuantas perros desea crear? ");
        int cantidadPerros = leer.nextInt();
        for (int i = 0; i < cantidadPerros; i++) {
            perrosAdoptados.add(spp.crearPerro());

        }
        for (Persona aux : personas) {
            System.out.println(aux.getNombre() + " " + aux.getApellido() + " Elija un perro de la lista para adoptarlo: ");
            for (Perro auxx : perrosAdoptados) {
                System.out.println("Nombre: " + auxx.getNombre());

            }
            String opcionAdopcion = leer.next().toLowerCase();
            int acu3 = 0;
            for (int i = 0; i < perrosAdoptados.size(); i++) {
                if (opcionAdopcion.equalsIgnoreCase(perrosAdoptados.get(i).getNombre())) {
                    aux.setPerro(perrosAdoptados.get(i));
                    acu3++;
                    perrosAdoptados.remove(i);
                }
            }
            if (acu3 == 0) {
                System.out.println("El perro ingresado no existe");
            }
        }
        System.out.println("");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println("La persona " + aux.getNombre() + " " + aux.getApellido() + " no adoptó ");
            } else {
                System.out.println("La persona " + aux.getNombre() + " " + aux.getApellido() + " adoptó a : " + aux.getPerro().getNombre());

            }
        }
    }
}
