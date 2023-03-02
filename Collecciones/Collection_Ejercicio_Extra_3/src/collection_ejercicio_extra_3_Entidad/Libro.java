/*
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
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
package collection_ejercicio_extra_3_Entidad;

import java.util.Objects;

/**
 *
 * @author Anny
 */
public class Libro {
    private String titulo_libro;
    private String autor;
    private int numnero_ejemplares;
    private int numnero_ejemplares_prestados;

    public Libro() {
    }

    public Libro(String titulo_libro, String autor, int numnero_ejemplares, int numnero_ejemplares_prestados) {
        this.titulo_libro = titulo_libro;
        this.autor = autor;
        this.numnero_ejemplares = numnero_ejemplares;
        this.numnero_ejemplares_prestados = numnero_ejemplares_prestados;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumnero_ejemplares() {
        return numnero_ejemplares;
    }

    public void setNumnero_ejemplares(int numnero_ejemplares) {
        this.numnero_ejemplares = numnero_ejemplares;
    }

    public int getNumnero_ejemplares_prestados() {
        return numnero_ejemplares_prestados;
    }

    public void setNumnero_ejemplares_prestados(int numnero_ejemplares_prestados) {
        this.numnero_ejemplares_prestados = numnero_ejemplares_prestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.titulo_libro);
        hash = 71 * hash + Objects.hashCode(this.autor);
        hash = 71 * hash + this.numnero_ejemplares;
        hash = 71 * hash + this.numnero_ejemplares_prestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numnero_ejemplares != other.numnero_ejemplares) {
            return false;
        }
        if (this.numnero_ejemplares_prestados != other.numnero_ejemplares_prestados) {
            return false;
        }
        if (!Objects.equals(this.titulo_libro, other.titulo_libro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo_libro: " + titulo_libro + ", autor:" + autor + ", numnero_ejemplares :" + numnero_ejemplares + ", numnero_ejemplares_prestados :" + numnero_ejemplares_prestados + '}';
    }
    
    
}
