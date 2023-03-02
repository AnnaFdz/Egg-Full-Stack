/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_2;

import relaciones_ejercicio_2_Entidad.Juego;

/**
 *
 * @author Anny
 */
public class Relaciones_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("------------Ruleta Rusa de Agua------------");
        System.out.println("");
        System.out.println("");

        Juego j = new Juego();
j.llenarJuego();
       boolean fin = false;
	j.crearJuego();
//	System.out.println(j.toString());
	j.iniciarJuego(j.getJugadores(), j.getR());
	System.out.println(j.toString());
	
	while (!fin) {
	    if (j.ronda()) {
//		System.out.println("");
//		System.out.println(j.toString());
		//System.out.println("FIN!!!!!!!!!");
		fin=true;
	    } else {
//		System.out.println("");
//		System.out.println(j.toString());
		System.out.println("Proxima ronda");
	    }
	}
	System.out.println("");
	System.out.println(j.toString());
    }
    
    
}
