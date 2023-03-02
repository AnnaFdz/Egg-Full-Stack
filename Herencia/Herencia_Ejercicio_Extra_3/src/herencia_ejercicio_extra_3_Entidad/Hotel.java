/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_extra_3_Entidad;

/**
 *
 * @author Anny
 */
public class Hotel extends Alojamiento {
    protected Integer cantidadHabitaciones;
    protected Integer numCamas;
    protected Integer cantidadpisos;
    protected Integer precioHabitaciones;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadpisos = cantidadpisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Hotel(Integer cantidadHabitaciones, Integer numCamas, Integer cantidadpisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadpisos = cantidadpisos;
        this.precioHabitaciones = precioHabitaciones;
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
    public String toString() {
        return "Hotel: " + "cantidadHabitaciones: " + cantidadHabitaciones + ", numCamas=" + numCamas + ", cantidadpisos=" + cantidadpisos + ", precioHabitaciones=" + precioHabitaciones;
    }
    
    
    
    
}
