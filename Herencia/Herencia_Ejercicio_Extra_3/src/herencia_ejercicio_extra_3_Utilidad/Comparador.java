/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_extra_3_Utilidad;


import herencia_ejercicio_extra_3_Entidad.Hotel;
import java.util.Comparator;

/**
 *
 * @author Anny
 */
public class Comparador {
    public static Comparator <Hotel> precioDeMasCaroABarato = new Comparator <Hotel>(){
       
        @Override
        public int compare(Hotel t, Hotel t1) {
           return t1.getPrecioHabitaciones().compareTo(t.getPrecioHabitaciones());
        }
        
    };
}
