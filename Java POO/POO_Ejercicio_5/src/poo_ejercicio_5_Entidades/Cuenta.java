/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_5_Entidades;

/**
 *
 * @author Anny
 */
public class Cuenta {

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
    public int numeroCuenta;
    public long DNI;
    public double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void crearCuenta() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI: ");
        DNI = leer.nextLong();
        System.out.println("Ingrese su saldo actual: ");
        saldoActual = leer.nextDouble();
    }

    public double ingresar(double ingreso) {
        return saldoActual = saldoActual + ingreso;

    }

    public double retirar(double retiro) {
        if (saldoActual < retiro) {
            return saldoActual=0 ;
        } else {
             saldoActual = saldoActual - retiro;
        }
        return saldoActual;

    }
    public double extraccioRapida(double retiro){
        if (retiro>(saldoActual*0.20)){
            System.out.println("No se puede retirar mas del 20% del saldo actual");
            return saldoActual;
        } else{
          return  saldoActual=saldoActual-retiro;
                    
        }
    }
    public void consultarSaldo(){
        System.out.println(saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("Numero de cuenta: "+numeroCuenta+"- DNI del cliente: "+DNI+"- saldo actual: "+saldoActual);
    }
    
}