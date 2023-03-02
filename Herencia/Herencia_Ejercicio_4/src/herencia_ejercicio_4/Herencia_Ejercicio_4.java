/*
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package herencia_ejercicio_4;

import herencia_ejercicio_4_Entidad.Circulo;
import herencia_ejercicio_4_Entidad.Rectangulo;

/**
 *
 * @author Anny
 */
public class Herencia_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo(30d);
        Rectangulo r = new Rectangulo(9d,7d);
        
        System.out.println("La superficie del circulo: "+c.area());
        System.out.println("El perimetro del circulo: "+c.perimetro());
        System.out.println("La superficie del rectangulo: "+r.area());
        System.out.println("El perimetro del rectangulo: "+r.perimetro());
        
    }
    
}
