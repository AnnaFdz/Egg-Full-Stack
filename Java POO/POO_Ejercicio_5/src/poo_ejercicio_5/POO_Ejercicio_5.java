/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_5;

import poo_ejercicio_5_Entidades.Cuenta;

/**
 *
 * @author Anny
 */
public class POO_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        . Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
        */
        
        Cuenta cta1 = new Cuenta();
    cta1.crearCuenta();
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Cuanto dinero queres ingresar? ");
        double ingreso = leer.nextDouble();
        cta1.ingresar(ingreso);
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        cta1.retirar(retiro);
        System.out.println("Cuanto quiere retirar por extracion rapida (hasta el 20% de su saldo)");
       retiro = leer.nextDouble();
       cta1.extraccioRapida(retiro);
       cta1.consultarSaldo();
       cta1.consultarDatos();
    }
    
}
