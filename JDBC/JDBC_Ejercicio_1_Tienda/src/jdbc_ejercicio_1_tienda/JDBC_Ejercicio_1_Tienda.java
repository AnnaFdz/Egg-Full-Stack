/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio_1_tienda;

import java.util.ArrayList;
import jdbc_ejercicio_1_tienda_entidades.Producto;
import jdbc_ejercicio_1_tienda_servicios.FabricanteServicio;
import jdbc_ejercicio_1_tienda_servicios.ProductoServicio;
import jdbc_ejercicio_1_tienda_servicios.Servicio;

/**
 *
 * @author Anny
 */
public class JDBC_Ejercicio_1_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Servicio s = new Servicio();
        s.menu();
  }

}
