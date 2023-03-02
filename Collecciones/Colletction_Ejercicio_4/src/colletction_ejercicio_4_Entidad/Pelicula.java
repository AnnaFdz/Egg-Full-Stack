/*
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package colletction_ejercicio_4_Entidad;

/**
 *
 * @author Anny
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
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

    public Double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionPelicula=" + duracionPelicula + '}';
    }
    
}
