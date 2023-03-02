/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados. También se creará en
el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
21
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
• Método toString para mostrar los datos de los libros
 */
package collection_ejercicio_extra_3_Servicio;

import collection_ejercicio_extra_3_Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Anny
 */
public class ServicioLibro {

    private Scanner leer;
    private Set<Libro> libros;

    public ServicioLibro() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        //ordena segun como se cargan los nombre sin un orden especifico
        //this.paises = new TreeSet<Pais>(); 
        //treeset con el comparador en el parametro q lo ordena alfabeticamente
        this.libros = new HashSet<Libro>();
    }

    public Libro crearLibro() {
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next().toLowerCase();
        System.out.println("Ingrese el autor");
        String autor = leer.next().toLowerCase();
        //int n_ejemplares = (int) (Math.random()*10);
        //int n_prestados = (int) (Math.random()*10);
        System.out.println("ingrese cantidad de ejemplare");
        int n_ejemplares = leer.nextInt();
        int n_prestados;
        do {
            System.out.println("ingrese cantidad de ejemplare prestados");
            n_prestados = leer.nextInt();

        } while (n_prestados > n_ejemplares);

        return new Libro(titulo, autor, n_ejemplares, n_prestados);

    }

    public void agregarLibro(Libro p) {
        libros.add(p);

    }

    public HashSet<Libro> fabricaLibro() {

        do {
            agregarLibro(crearLibro());
            System.out.println("Desea seguir agregando libros s/n");

        } while (!"n".equals(leer.next().toLowerCase()));
        return (HashSet<Libro>) libros;
    }

    public boolean prestamo() {
        System.out.println("Ingrese el titulo del libro que quiere prestar: ");
        String titulo = leer.next().toLowerCase();

        for (Libro libro : libros) {

            if (titulo.equals(libro.getTitulo_libro())) {
                if (libro.getNumnero_ejemplares() > libro.getNumnero_ejemplares_prestados()) {
                    libro.setNumnero_ejemplares_prestados(libro.getNumnero_ejemplares_prestados() + 1);
                    return true;
                }
            }
        }

        return false;
    }

    public boolean devolucion() {
        System.out.println("Ingrese el titulo del libro que quiere devolver: ");
        String titulo = leer.next().toLowerCase();

        for (Libro libro : libros) {

            if (titulo.equals(libro.getTitulo_libro())) {
                if (libro.getNumnero_ejemplares() >= libro.getNumnero_ejemplares_prestados()) {
                    libro.setNumnero_ejemplares_prestados(libro.getNumnero_ejemplares_prestados() - 1);
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrar() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());

        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear y agregar  libro a la coleccion");
            System.out.println("2.  Prestar un libro ");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    fabricaLibro();

                    break;
                case 2:
                    if (prestamo()) {
                        System.out.println("Se pudo realizar el prestamo exitosamente!");
                    } else {
                        System.out.println("No se pudo realizar la operacion");
                    }
                    break;
                case 3:
                    if (devolucion()) {
                        System.out.println("Se pudo devolver exitosamente!");
                    } else {
                        System.out.println("No se pudo realizar la operacion");
                    }
                    break;
                case 4:
                    mostrar();

            }
        } while (op != 5);
    }
}
