/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_3_Entidad;

import relaciones_ejercicio_3_Enums.Palo;

/**
 *
 * @author Anny
 */
public class Carta {
    private Integer numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(Integer numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

   

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + "numero: " + numero + ", palo: " + palo.getPalo();
    }

   
    
}
