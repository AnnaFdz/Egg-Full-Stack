/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_extra_2_Entidades;

/**
 *
 * @author Anny
 */
public class Espectador {
    private String nombreEspectador;
    private int edad;
    private float dinero;

    public Espectador() {
    }

    public Espectador(String nombreEspectador, int edad, float dinero) {
        this.nombreEspectador = nombreEspectador;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombreEspectador() {
        return nombreEspectador;
    }

    public void setNombreEspectador(String nombreEspectador) {
        this.nombreEspectador = nombreEspectador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

   

    @Override
    public String toString() {
        return nombreEspectador +" " + "edad: " + edad + " $: " + dinero ;
    }
    
    
    
}
