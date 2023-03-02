/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_3_Entidad;

import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Baraja {

    private ArrayList<Carta> cartas;
    

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{: " + "cartas: " + cartas;
    }

}
