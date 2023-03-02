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
public class ExtraHotelero extends Alojamiento {
    protected String privado_o_No;
    protected Integer mtCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(String privado_o_No, Integer mtCuadrados) {
        this.privado_o_No = privado_o_No;
        this.mtCuadrados = mtCuadrados;
    }

    public ExtraHotelero(String privado_o_No, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado_o_No = privado_o_No;
        this.mtCuadrados = mtCuadrados;
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
        return "ExtraHotelero: " +"nombre: " + nombre + ", direccion: " + direccion + ", localidad: " + localidad + ", gerente: " + gerente + "privado_o_No: " + privado_o_No + ", mtCuadrados: " + mtCuadrados;
    }
    
    
}
