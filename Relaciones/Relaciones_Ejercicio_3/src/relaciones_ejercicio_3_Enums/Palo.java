/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_3_Enums;

/**
 *
 * @author Anny
 */
public enum Palo {
    ORO("Oro"), BASTO("Basto"), ESPADA("Espada"), COPA("Copa");
    private String palo;

    private Palo() {
    }

    private Palo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

   
    
}
