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
public class Asiento {
  
    private String ubicacion;
    private Espectador espect;
    
    public Asiento(String ubicacion, Espectador espect) {
        this.ubicacion = ubicacion;
        this.espect = espect;
    }

    public Asiento() {
    }

    public Asiento(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Espectador getEspect() {
        return espect;
    }

    public void setEspect(Espectador espect) {
        this.espect = espect;
    }

    @Override
    public String toString() {
        
        String espacioVacio= ubicacion.toString();
        
        if (espect==null) {
            espacioVacio= " ";
            
        }else{
            espacioVacio= "X";
        }
        return ubicacion +" "+ espacioVacio+ " ";
    }
   
  
}
