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
public class Hotel_Cuatro extends Hotel implements CalculoPrecio {

    private String gimnasio;
    private String nombreRestaurant;
    private Integer capacidadRestaurant;

    public Hotel_Cuatro() {
    }

    public Hotel_Cuatro(String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant) {
        this.gimnasio = Gimnacio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Hotel_Cuatro(String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones) {
        super(cantidadHabitaciones, numCamas, cantidadpisos, precioHabitaciones);
        this.gimnasio = Gimnacio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Hotel_Cuatro(String Gimnacio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numCamas, cantidadpisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = Gimnacio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public String getGimnacio() {
        return gimnasio;
    }

    public void setGimnacio(String Gimnacio) {
        this.gimnasio = Gimnacio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantidadpisos() {
        return cantidadpisos;
    }

    public void setCantidadpisos(Integer cantidadpisos) {
        this.cantidadpisos = cantidadpisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public int precio() {
        int var = 0;
        int vag = 0;

        if (capacidadRestaurant < 30) {
            var = 10;
        }

        if (capacidadRestaurant >= 30 && capacidadRestaurant <= 50) {
            var = 30;
        }

        if (capacidadRestaurant > 50) {
            var = 50;
        }

        if ("a".equalsIgnoreCase(gimnasio)) {
            vag = 50;
        }

        if ("b".equalsIgnoreCase(gimnasio)) {
            vag = 30;
        }

        this.precioHabitaciones= (precioHabitaciones+50 + (1 * numCamas) + var + vag);
        return precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel_Cuatro: " + " nombre: " + nombre + ", direccion:" + direccion + ", localidad: " + localidad + ", gerente: " + gerente + ", Gimnacio: " + gimnasio + ", nombreRestaurant: " + nombreRestaurant + ", capacidadRestaurant: " + capacidadRestaurant+", precio: "+precioHabitaciones;
    }
}


