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
public class Residencia extends ExtraHotelero {
    private Integer cantHabitaciones;
    private String descuetoGremios;
    private String campoDeportivosi_no;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, String descuetoGremios, String campoDeportivosi_no) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuetoGremios = descuetoGremios;
        this.campoDeportivosi_no = campoDeportivosi_no;
    }

    public Residencia(Integer cantHabitaciones, String descuetoGremios, String campoDeportivosi_no, String privado_o_No, Integer mtCuadrados) {
        super(privado_o_No, mtCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descuetoGremios = descuetoGremios;
        this.campoDeportivosi_no = campoDeportivosi_no;
    }

    public Residencia(Integer cantHabitaciones, String descuetoGremios, String campoDeportivosi_no, String privado_o_No, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado_o_No, mtCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuetoGremios = descuetoGremios;
        this.campoDeportivosi_no = campoDeportivosi_no;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public String getDescuetoGremios() {
        return descuetoGremios;
    }

    public void setDescuetoGremios(String descuetoGremios) {
        this.descuetoGremios = descuetoGremios;
    }

    public String getCampoDeportivosi_no() {
        return campoDeportivosi_no;
    }

    public void setCampoDeportivosi_no(String campoDeportivosi_no) {
        this.campoDeportivosi_no = campoDeportivosi_no;
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
        return "Residencia: "+"nombre: " + nombre + ", direccion: " + direccion + ", localidad: " + localidad + ", gerente: " + gerente + "cantHabitaciones: " + cantHabitaciones + ", descuetoGremios: " + descuetoGremios + ", campoDeportivosi_no: " + campoDeportivosi_no;
    }
    
    
    
}
