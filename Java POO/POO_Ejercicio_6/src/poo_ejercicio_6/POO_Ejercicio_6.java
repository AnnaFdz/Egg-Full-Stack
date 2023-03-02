/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada

 */
package poo_ejercicio_6;

import poo_ejercicio_6_Entidad.Cafetera;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        Cafetera caft1 = new Cafetera(300, 0);
       caft1.llenarCafetera();
        System.out.println("Ingrese el tamaño de su taza: ");
        int taza;
       caft1.servirTaza( taza=leer.nextInt());
        caft1.vaciarCafetera();
        System.out.println("Cafe a agregar: ");
        int cafe;
        caft1.agregarCafe(cafe= leer.nextInt());
        System.out.println(caft1.toString());
    }
    
}
