/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ejercicio_extra_2_Entidad;

/**
 *
 * @author Anny
 */
public class CantanteFamoso implements Comparable<CantanteFamoso> {

    /*
    Crear una clase llamada CantanteFamoso. Esta clase guardarÃ¡ cantantes famosos y
tendrÃ¡ como atributos el nombre y discoConMasVentas.
Se debe, ademÃ¡s, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con mÃ¡s ventas por pantalla. 
Una vez agregado los 5, en otro bucle, crear un menÃº que le de la opciÃ³n al usuario de
agregar un cantante mÃ¡s, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberÃ¡ mostrar la lista con todos los
cambios.
     */
    private String nombre;
    private String discoMVentas;
    
    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoMVentas) {
        this.nombre = nombre;
        this.discoMVentas = discoMVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMVentas() {
        return discoMVentas;
    }

    public void setDiscoMVentas(String discoMVentas) {
        this.discoMVentas = discoMVentas;
    }
    
    
    @Override
    public int compareTo(CantanteFamoso t) {
        return t.getNombre().compareTo(this.nombre);
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoMVentas=" + discoMVentas + '}';
    }

}
