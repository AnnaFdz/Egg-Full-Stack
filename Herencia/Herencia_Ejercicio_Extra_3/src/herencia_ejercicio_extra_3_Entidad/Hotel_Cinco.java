/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_extra_3_Entidad;

import herencia_ejercicio_extra_3_Entidad_Interfaz.CalculoPrecio;

/**
 *
 * @author Anny
 */
public class Hotel_Cinco extends Hotel_Cuatro implements CalculoPrecio {
    private Integer cantidadSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel_Cinco() {
    }

    public Hotel_Cinco(Integer cantidadSalonesConf, Integer cantSuites, Integer cantLimosinas) {
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel_Cinco(Integer cantidadSalonesConf, Integer cantSuites, Integer cantLimosinas, String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant) {
        super(Gimnacio, nombreRestaurant, capacidadRestaurant);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel_Cinco(Integer cantidadSalonesConf, Integer cantSuites, Integer cantLimosinas, String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones) {
        super(Gimnacio, nombreRestaurant, capacidadRestaurant, cantidadHabitaciones, numCamas, cantidadpisos, precioHabitaciones);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel_Cinco(Integer cantidadSalonesConf, Integer cantSuites, Integer cantLimosinas, String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(Gimnacio, nombreRestaurant, capacidadRestaurant, cantidadHabitaciones, numCamas, cantidadpisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public int precio() {
        this.precioHabitaciones = super.precio()+(cantLimosinas*15);
        return precioHabitaciones; 
    }
    
    @Override
    public String toString() {
        return "Hotel_Cinco: "+ "nombre: " + nombre + ", direccion: " + direccion + ", localidad: " + localidad + ", gerente: " + gerente + " cantidadSalonesConf: " + cantidadSalonesConf + ", cantSuites: " + cantSuites + ", cantLimosinas: " + cantLimosinas+" precio: "+precioHabitaciones;
    }

            
}
