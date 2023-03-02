/*
 *• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package colletction_ejercicio_4_utilidades;

import colletction_ejercicio_4_Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Anny
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPelisPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracionPelicula().compareTo(t.getDuracionPelicula());
              
        }
    };
    public static Comparator<Pelicula> ordenarPelisPorDuracionAsce = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracionPelicula().compareTo(t1.getDuracionPelicula());
              
        }
    };
    public static Comparator<Pelicula> ordenarPelisPorTituloAlfab= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
              
        }
    };
    public static Comparator<Pelicula> ordenarPelisPorDirectorAlfab= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
              
        }
    };
            }