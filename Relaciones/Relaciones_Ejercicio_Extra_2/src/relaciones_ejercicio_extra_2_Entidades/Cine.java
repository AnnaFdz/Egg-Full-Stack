/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_extra_2_Entidades;

import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Cine {
    private Asiento sala[][];
    ArrayList<Espectador> espect = new ArrayList();
    ArrayList<Espectador> admitidos = new ArrayList();
    private Pelicula pelicula;
    private Float precio;

    public Cine() {
    }

    public Cine(Asiento[][] sala, Pelicula pelicula, Float precio) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getEspect() {
        return espect;
    }

    public void setEspect(ArrayList<Espectador> espect) {
        this.espect = espect;
    }

    public ArrayList<Espectador> getAdmitidos() {
        return admitidos;
    }

    public void setAdmitidos(ArrayList<Espectador> admitidos) {
        this.admitidos = admitidos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine" + "sala: " + sala + ", espect: " + espect + ", admitidos: " + admitidos + ", pelicula: " + pelicula + ", precio: " + precio;
    }

   
    
    
}
