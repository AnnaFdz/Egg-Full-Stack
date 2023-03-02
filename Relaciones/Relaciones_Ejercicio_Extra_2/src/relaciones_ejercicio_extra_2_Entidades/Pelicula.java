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
public class Pelicula {
 
    private String titulo, director;
    private int edadMin;
    private float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int edadMin, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMin = edadMin;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + "titulo: " + titulo + ", director: " + director + ", edad minima: " + edadMin + ", duracion: " + duracion;
    }
    
}