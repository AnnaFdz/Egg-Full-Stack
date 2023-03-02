/*
 *A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package poo_ejercicio_7;

import poo_ejercicio_7_Entidad.Persona;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        int imc;
        int cont_dpi = 0, cont_pi = 0, cont_epi = 0, cont_mende = 0, cont_mayde = 0;

        p1.crearPersona();
        p1.calcularIMC();
        p1.mayorDeEdad();
        imc = p1.calcularIMC();

        if (imc == -1) {
            System.out.println("Se encuentra debajo del peso ideal");
            cont_dpi++;
        } else if (imc == 0) {
            System.out.println("Se encuentra en el peso ideal");
            cont_pi++;
        } else {
            System.out.println("Se encuentra por encima del peso ideal");
            cont_epi++;
        }

        if (p1.mayorDeEdad()) {
            System.out.println("Es mayor de edad");
            cont_mayde++;
        } else {
            System.out.println("Es menor de edad");
            cont_mende++;
        }

        p2.crearPersona();
        p2.calcularIMC();
        p2.mayorDeEdad();
        imc = p2.calcularIMC();
        if (imc == -1) {
            System.out.println("Se encuentra debajo del peso ideal");
            cont_dpi++;
        } else if (imc == 0) {
            System.out.println("Se encuentra en el peso ideal");
            cont_pi++;
        } else {
            System.out.println("Se encuentra por encima del peso ideal");
            cont_epi++;
        }

        if (p2.mayorDeEdad()) {
            System.out.println("Es mayor de edad");
            cont_mayde++;
        } else {
            System.out.println("Es menor de edad");
            cont_mende++;
        }

        p3.crearPersona();
        p3.calcularIMC();
        p3.mayorDeEdad();
        imc = p3.calcularIMC();
        if (imc == -1) {
            System.out.println("Se encuentra debajo del peso ideal");
            cont_dpi++;
        } else if (imc == 0) {
            System.out.println("Se encuentra en el peso ideal");
            cont_pi++;
        } else {
            System.out.println("Se encuentra por encima del peso ideal");
            cont_epi++;
        }

        if (p3.mayorDeEdad()) {
            System.out.println("Es mayor de edad");
            cont_mayde++;
        } else {
            System.out.println("Es menor de edad");
            cont_mende++;
        }

        p4.crearPersona();
        p4.calcularIMC();
        p4.mayorDeEdad();
        imc = p4.calcularIMC();
        if (imc == -1) {
            System.out.println("Se encuentra debajo del peso ideal");
            cont_dpi++;
        } else if (imc == 0) {
            System.out.println("Se encuentra en el peso ideal");
            cont_pi++;
        } else {
            System.out.println("Se encuentra por encima del peso ideal");
            cont_epi++;
        }

        if (p4.mayorDeEdad()) {
            System.out.println("Es mayor de edad");
            cont_mayde++;
        } else {
            System.out.println("Es menor de edad");
            cont_mende++;
        }
        System.out.println("El porcentaje de personas por debajo del peso ideal es: " + (cont_dpi * 100) / 4+"%");
        System.out.println("El porcentaje de personas con del peso ideal es: " + (cont_pi * 100) / 4+"%");
        System.out.println("El porcentaje de personas por encima del peso ideal es: " + (cont_epi * 100) / 4+"%");
        System.out.println("El porcentaje de las personas mayores de edad es: " + (cont_mayde * 100) / 4+"%");
        System.out.println("El porcentaje de las personas menores de edad es: " + (cont_mende * 100) / 4+"%");

    }

}
