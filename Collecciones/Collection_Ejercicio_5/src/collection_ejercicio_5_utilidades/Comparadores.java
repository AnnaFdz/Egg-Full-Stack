/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ejercicio_5_utilidades;

import collection_ejercicio_5_Entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author Anny
 */
public class Comparadores {

    public static Comparator<Pais> ordenarPaisAlfabet = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return  t.getNombrePais().compareTo(t1.getNombrePais());
        }
    };
}
