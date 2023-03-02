/*
 * por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package herencia_ejercicio_extra_2;

import herencia_ejercicio_extra_2_Entidad.Edificio;
import herencia_ejercicio_extra_2_Entidad.EdificioDeOficina;
import herencia_ejercicio_extra_2_Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Herencia_Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polideportivo p1 = new Polideportivo("clubA", "techado", 20, 30, 49);
        Polideportivo p2 = new Polideportivo("clubB", "abierto", 15, 20, 9);
        EdificioDeOficina e1 = new EdificioDeOficina(11, 7, 9, 15, 4, 9);
        EdificioDeOficina e2 = new EdificioDeOficina(12, 5, 7, 20, 5, 10);
        ArrayList<Edificio> edificios = new ArrayList();
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(e1);
        edificios.add(e2);

       
        for (Edificio aux : edificios) {
             
            System.out.println(aux.calcularSuperficie());
            System.out.println(aux.calcularVolumen());
            if (aux instanceof Polideportivo) {
                Polideportivo p = (Polideportivo)aux;
                System.out.println("El polideportivo " + p.getNombre()+ " es del tipo " + p.getTipoDeIntalacion());
            }
            if (aux instanceof EdificioDeOficina){
                EdificioDeOficina e = (EdificioDeOficina) aux;
                e.cantPersonas();
            }
        }

    }

}
