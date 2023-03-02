/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_3;

import relaciones_ejercicio_3_Servicio.ServicioBaraja;

/**
 *
 * @author Anny
 */
public class Relaciones_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioBaraja sb = new ServicioBaraja();
       sb.crearBaraja();
       sb.mostrarBarajas();
       sb.baraja();
        
       sb.mostrarBarajas();
       System.out.println("--");
       sb.siguienteCarta();
       sb.cartasDisponibles();
       System.out.println("--");
       sb.darCartas();
       //sb.mostrarBarajas();
       sb.cartasDisponibles();
       System.out.println("--");
       sb.cartasMonton();
       //sb.mostrarBarajas();
       
    }
    
}
