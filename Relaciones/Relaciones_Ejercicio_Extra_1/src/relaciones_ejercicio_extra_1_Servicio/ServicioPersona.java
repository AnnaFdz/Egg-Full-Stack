/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_extra_1_Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import relaciones_ejercicio_extra_1_Entidades.Perro;

import relaciones_ejercicio_extra_1_Entidades.Persona;

/**
 *
 * @author Anny
 */
public class ServicioPersona {
      private Scanner leer;
    private List<Persona> personas;

    public ServicioPersona() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        
        this.personas = new ArrayList<Persona>();
    }
    public Persona crearPersona() {
        Persona x = new Persona();
        System.out.println("Ingrese el nombre: ");
        x.setNombre(leer.next());
        System.out.println("Ingrese apellido: ");
        x.setApellido(leer.next());
        System.out.println("Ingrese edad: ");
        x.setEdad(leer.nextInt());
        System.out.println("Ingrese DNI: ");
        x.setDni(leer.nextInt());
        
        
        return x;

    }
     public Perro crearPerro() {
        Perro p = new Perro();
        System.out.println("Ingrese el nombre del perro");
        p.setNombre(leer.next());
        System.out.println("Ingrese raza");
        p.setRaza(leer.next());
         System.out.println("Ingrese el tamaño del perro");
         p.setTamanio(leer.next());
        System.out.println("Ingrese la edad del perro");
        p.setEdad(leer.nextInt());
       
        return p;
     }
    
}
