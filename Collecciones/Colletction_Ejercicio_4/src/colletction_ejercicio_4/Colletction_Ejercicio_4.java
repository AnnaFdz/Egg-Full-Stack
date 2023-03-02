/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colletction_ejercicio_4;

import colletction_ejercicio_4_Entidad.Pelicula;
import colletction_ejercicio_4_Servicio.ServicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Colletction_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        //ArrayList <Pelicula> peliculas1 = new ArrayList();

        sp.fabricaPeliculas();
        sp.mostrar();
        System.out.println("-------------");
        System.out.println("pelis mayo 1h");
        sp.mostrarPelisMayorUnaHr();

        System.out.println("-------------");
        System.out.println("duracion desc");
        sp.OrdenarPorDuracionDesc();
        sp.mostrar();
        System.out.println("-------------");
        System.out.println("duracion asce");
        sp.OrdenarPelisPorDuracionAsce();

        sp.mostrar();
        System.out.println("-------------");
        System.out.println("titulo alfabetico");
        sp.OrdenarPelisPorTituloAsce();
        sp.mostrar();
        System.out.println("-------------");
        System.out.println("direct alfabetico");
        sp.OrdenarPelisPorDirectorAsce();
        sp.mostrar();

    }

}
