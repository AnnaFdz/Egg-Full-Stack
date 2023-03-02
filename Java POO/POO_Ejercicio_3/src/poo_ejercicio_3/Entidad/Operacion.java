/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_3.Entidad;

/**
 *
 * @author Anny
 */
public class Operacion {
    /*
         /*
         Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
        */
        java.util.Scanner leer = new java.util.Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void pedir() {

        System.out.println("Ingrese el numero 1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        numero2 = leer.nextInt();
    }
//no es necesario pasarlos x parametro
    public int sumar(int numero1, int numero2) {

        int suma;

        suma = numero1 + numero2;
        System.out.println("El resultado es " + suma);
        return suma;
    }

    public int restar(int numero1, int numero2) {

        int resta;

        resta = numero1 - numero2;
        System.out.println("El resultado es " + resta);
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {

        int multiplicacion = 0;

        if (numero1 != 0 && numero2 != 0) {
            multiplicacion = numero1 * numero2;
            System.out.println("El resultado es " + multiplicacion);
        } else {

            System.out.println("Uno de los numeros ingresado es igual a 0, el resultado es " + multiplicacion);
        }

        return multiplicacion;
    }

    public int dividir(int numero1, int numero2) {

        int division = 0;

        if (numero1 != 0 && numero2 != 0) {
            division = numero1 / numero2;
            System.out.println("El resultado es " + division);
        } else {

            System.out.println("Uno de los numeros ingresado es igual a 0, el resultado es " + division);
        }

        return division;
    }

}
