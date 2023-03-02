/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_extra_3;

import herencia_ejercicio_extra_3_Entidad.Alojamiento;
import herencia_ejercicio_extra_3_Entidad.Camping;
import herencia_ejercicio_extra_3_Entidad.ExtraHotelero;
import herencia_ejercicio_extra_3_Entidad.Hotel;
import herencia_ejercicio_extra_3_Entidad.Hotel_Cinco;
import herencia_ejercicio_extra_3_Entidad.Hotel_Cuatro;
import herencia_ejercicio_extra_3_Entidad.Residencia;
import herencia_ejercicio_extra_3_Utilidad.Comparador;
import static herencia_ejercicio_extra_3_Utilidad.Comparador.precioDeMasCaroABarato;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anny
 */
public class Herencia_Ejercicio_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel_Cuatro cuatroe1 = new Hotel_Cuatro("b", "De Todo un poco", 80, 45, 90, 2, 10, "Playa Serena", "Av Bunge 526", "Pinamar", "Tadeo Ramirez");
        Hotel_Cuatro cuatroe2 = new Hotel_Cuatro("a", "JapanSushi", 100, 50, 120, 3, 20, "Paraiso", "Cortes 123", "Cancun", "Luis Sanchez");
        Hotel_Cinco cincoe3 = new Hotel_Cinco(50, 10, 16, "a", "one", 40, 100, 8, 6, 500, "Hilton", "Mitre 1240", "Tucuman", "Carlos Guzman");
        Hotel_Cinco cincoe4 = new Hotel_Cinco(90, 17, 15, "b", "one_one", 30, 100, 5, 4, 600, "Alejandro", "Belgrano 1240", "Salta", "Sandra Guzman");
        cuatroe1.precio();
        cuatroe2.precio();
        cincoe3.precio();
        cincoe4.precio();
        Camping c1 = new Camping(15, 2, "si", "no", 600, "Camping Victoria", "Junin 920", "Gualeguaychu", "Jacobo Santamarìa");
        Camping c2 = new Camping(18, 1, "no", "no", 550, "Camping Mendoza", "San Martin 523", "Godoy Cruz", "Humberto Galindez");
        Camping c3 = new Camping(23, 1, "si", "si", 1000, "Camping Hornero", "Av Pueyrredon 1150", "San Lorenzo", "Sonia Fascia");

        Residencia r1 = new Residencia(4, "si", "no", "si", 200, "El descanso", "Av Enrique Shaw 433", "Pinamar", "Carlos Quesada");
        Residencia r2 = new Residencia(5, "si", "si", "si", 250, "Brisa de Verano", "Abedul 230", "Carilò", "Patricia Castro");
        Residencia r3 = new Residencia(3, "no", "si", "no", 450, "Saint Tropez", "Av Libertador 690", "Pinamar", "José María Capaccioli");

        ArrayList<Hotel> hoteles = new ArrayList();
        hoteles.add(cuatroe1);
        hoteles.add(cuatroe2);
        hoteles.add(cincoe3);
        hoteles.add(cincoe4);

        ArrayList<ExtraHotelero> extrahoteles = new ArrayList();
        extrahoteles.add(c1);
        extrahoteles.add(c2);
        extrahoteles.add(c3);
        extrahoteles.add(r1);
        extrahoteles.add(r2);
        extrahoteles.add(r3);
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        alojamientos.addAll(hoteles);
        alojamientos.addAll(extrahoteles);
        System.out.println("Todos los alojamientos:  ");
        for (Alojamiento aux : alojamientos) {
            System.out.println(aux);

        }
        Collections.sort(hoteles, Comparador.precioDeMasCaroABarato);
        System.out.println();
        System.out.println("\"los hoteles del mas caro al mas barato \"");
        
        for (Hotel aux : hoteles) {
            System.out.println(aux.getNombre()+" $ "+aux.getPrecioHabitaciones());

        }
         System.out.println();
        for (ExtraHotelero aux : extrahoteles) {
            if(aux instanceof Camping){
                Camping c = (Camping)aux;
                if (c.getRestaurant_si_no().equals("si")){
                    System.out.println("el camping "+c.getNombre()+" tiene restaurante");
                }
            }
            if (aux instanceof Residencia) {
                Residencia r = (Residencia) aux;
                if(r.getDescuetoGremios().equals("si")){
                    System.out.println("la residencia "+r.getNombre()+" tiene descuento para gremios");
                }
                        
                    
                }
            
        }
    }

}
