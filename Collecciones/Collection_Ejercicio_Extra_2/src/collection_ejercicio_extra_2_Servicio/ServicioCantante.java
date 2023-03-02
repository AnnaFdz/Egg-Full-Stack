/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ejercicio_extra_2_Servicio;

import collection_ejercicio_extra_2_Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class ServicioCantante {
     
    private Scanner leer;
    private ArrayList<CantanteFamoso> cantantes;

    public ServicioCantante() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        this.cantantes = new ArrayList<CantanteFamoso>();
    }

    
    public void definirCantante(){
        CantanteFamoso p;
        System.out.println("Ingrese el nombre del cantante y su disco mas vendido");
        String nombre = leer.next(), disco=leer.next();
        cantantes.add(new CantanteFamoso(nombre, disco));
    }
    
    public void mostrarCantantes(){
        
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante.toString());
        }
    }
    
    public void borrarCantante(){
        System.out.println("Que cantante desea eliminar?");
        String a = leer.next(),h;
        int t=0;
        
        for (int i = 0; i < cantantes.size(); i++) {
            if (cantantes.get(i).getNombre()
                    .equals(a)) {
                t=i;
            }
        }
        
        cantantes.remove(t);
//       Iterator it = cantantes.iterator();
//        while (it.hasNext()) {
//            String aux = it.hasNext();
//            if (aux.getClass().equals(a)) {
//                it.remove();
//            }
//        }

        
        
        
    }
}
