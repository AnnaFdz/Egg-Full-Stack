/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package collection_ejercicio_5_Servicio;

import collection_ejercicio_5_Entidades.Pais;
import collection_ejercicio_5_utilidades.Comparadores;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Anny
 */
public class ServicioPais {

    private Scanner leer;
    private Set<Pais> paises;

    public ServicioPais() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        //ordena segun como se cargan los nombre sin un orden especifico
        //this.paises = new TreeSet<Pais>(); 
        //treeset con el comparador en el parametro q lo ordena alfabeticamente
        this.paises = new TreeSet<Pais>(Comparadores.ordenarPaisAlfabet);
    }

    public Pais crearPais() {
        System.out.println("Ingrese el nombre de un pais");
        String pais = leer.next().toLowerCase();
        return new Pais(pais);

    }

    public void agregarPais(Pais p) {
        paises.add(p);

    }

    public TreeSet<Pais> fabricaPais() {

        do {
            agregarPais(crearPais());
            System.out.println("Desea seguir agregando paises s/n");

        } while (!"n".equals(leer.next().toLowerCase()));
        return (TreeSet<Pais>) paises;
    }

    public void mostrar() {
        for (Pais aux : paises) {
            System.out.println(aux.toString());
        }

    }

    public void eliminarPais() {
        System.out.println("Ingrese el nombre del pais que quiere eliminar: ");
        String paisAEliminar = leer.next().toLowerCase();
        boolean encontrado = false;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombrePais().equalsIgnoreCase(paisAEliminar)) {
                it.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El pais no se encuantra en el conjunto de paises");
        }
    }
}
