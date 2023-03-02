/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

/**
 *
 * @author Anny
 */
public class practica_for_mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String [][] matriz = {{"a","b","c"}, {"d","e","f"}, {"g","h","i"}}  ;
        
       String aux = ""; 
        for (String[] fila : matriz) {
            aux= "";
            for (String elemento : fila) {
                aux = aux  + elemento + " ";
                
            }
            System.out.println(aux);
        }
        
    }
    
}
