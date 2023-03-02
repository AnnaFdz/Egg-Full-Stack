/*
  Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre
 */
package herencia_ejercicio_extra_2_Entidad;

/**
 *
 * @author Anny
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoDeIntalacion;

    public Polideportivo() {
    }
    
    public Polideportivo(String nombre, String tipoDeIntalacion) {
        this.nombre = nombre;
        this.tipoDeIntalacion = tipoDeIntalacion;
    }

    public Polideportivo(String nombre, String tipoDeIntalacion, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeIntalacion = tipoDeIntalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeIntalacion() {
        return tipoDeIntalacion;
    }

    public void setTipoDeIntalacion(String tipoDeIntalacion) {
        this.tipoDeIntalacion = tipoDeIntalacion;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoDeIntalacion=" + tipoDeIntalacion + '}';
    }

    @Override
    public float calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public float calcularVolumen() {
        return ancho*largo*alto;
    }

   

   
    
}
