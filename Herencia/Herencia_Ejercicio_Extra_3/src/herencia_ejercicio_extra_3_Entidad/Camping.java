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
public class Camping extends ExtraHotelero {
    private Integer capacidadMaxCarpas;
    private Integer cantBaniosDisponible;
    private String restaurant_si_no;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantBañosDisponible, String restaurant_si_no) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponible = cantBañosDisponible;
        this.restaurant_si_no = restaurant_si_no;
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantBañosDisponible, String restaurant_si_no, String privado_o_No, Integer mtCuadrados) {
        super(privado_o_No, mtCuadrados);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponible = cantBañosDisponible;
        this.restaurant_si_no = restaurant_si_no;
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantBañosDisponible, String restaurant_si_no, String privado_o_No, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado_o_No, mtCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponible = cantBañosDisponible;
        this.restaurant_si_no = restaurant_si_no;
    }

    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantBañosDisponible() {
        return cantBaniosDisponible;
    }

    public void setCantBañosDisponible(Integer cantBañosDisponible) {
        this.cantBaniosDisponible = cantBañosDisponible;
    }

    public String getRestaurant_si_no() {
        return restaurant_si_no;
    }

    public void setRestaurant_si_no(String restaurant_si_no) {
        this.restaurant_si_no = restaurant_si_no;
    }

    public String getPrivado_o_No() {
        return privado_o_No;
    }

    public void setPrivado_o_No(String privado_o_No) {
        this.privado_o_No = privado_o_No;
    }

    public Integer getMtCuadrados() {
        return mtCuadrados;
    }

    public void setMtCuadrados(Integer mtCuadrados) {
        this.mtCuadrados = mtCuadrados;
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
        return "Camping: "+ "nombre: " + nombre + ", direccion: " + direccion + ", localidad: " + localidad + ", gerente: " + gerente + "capacidadMaxCarpas: " + capacidadMaxCarpas + ", cantBaniosDisponible: " + cantBaniosDisponible + ", restaurant_si_no: " + restaurant_si_no;
    }
    
    
}
