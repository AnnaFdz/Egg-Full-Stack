/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package poo_ejercicio_12;

import poo_ejercicio_12_Entidad.Persona;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona();
        java.util.Scanner leer = new java.util.Scanner(System.in);
        p1.crearPersona();
        p1.calcularEdad();
        System.out.println("Ingrese una edad para comparar: ");
        int edad= leer.nextInt();
        if(p1.menorQue(edad)== false){
        System.out.println(p1.getNombre()+" es mayor que la edad ingresada para comparar");
        }else
            System.out.println(p1.getNombre()+" es menor que la edad ingresada para comparar");
       
        p1.mostrarPersona();
       
        
    }
    
}
