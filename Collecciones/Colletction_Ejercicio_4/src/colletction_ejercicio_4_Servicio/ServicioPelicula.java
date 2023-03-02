/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colletction_ejercicio_4_Servicio;

import colletction_ejercicio_4_Entidad.Pelicula;
import colletction_ejercicio_4_utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class ServicioPelicula {

    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList<Pelicula>();
    }

    public Pelicula crearPeliculas() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Escriba la duracion en horas de la pelicula");
        Double duracion = leer.nextDouble();

        return new Pelicula(titulo, director, duracion);

    }

    public ArrayList<Pelicula> fabricaPeliculas() {

        System.out.println("Crear pelicula");

        do {
            peliculas.add(crearPeliculas());
            System.out.println("Desea seguir creando s/n");

        } while (!"n".equals(leer.next().toLowerCase()));
        return peliculas;
    }

    public void mostrar() {
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarPelisMayorUnaHr() {
        for (Pelicula aux : peliculas) {
            if (aux.getDuracionPelicula() > 1.0) {
                System.out.println(aux.toString());
            }
        }

    }

    public void OrdenarPorDuracionDesc() {

        Collections.sort(peliculas, Comparadores.ordenarPelisPorDuracionDesc);

    }

    public void OrdenarPelisPorDuracionAsce() {
        Collections.sort(peliculas, Comparadores.ordenarPelisPorDuracionAsce);

    }

    public void OrdenarPelisPorTituloAsce() {

        Collections.sort(peliculas, Comparadores.ordenarPelisPorTituloAlfab);

    }

    public void OrdenarPelisPorDirectorAsce() {

        Collections.sort(peliculas, Comparadores.ordenarPelisPorDirectorAlfab);

    }
}
