/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_1_Entidad;

/**
 *
 * @author Anny
 */
public class Perro extends Animal {

    public Perro(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
    }
    
    
    
}
