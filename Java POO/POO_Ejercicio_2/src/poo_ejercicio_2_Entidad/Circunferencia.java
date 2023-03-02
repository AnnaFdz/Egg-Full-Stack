/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_2_Entidad;

/**
 *
 * @author Anny
 */
public class Circunferencia {

    /*
     Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
     */
    private double radio;
    private double perimetro;
    private double area;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void crearCircunferencia() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        this.radio = leer.nextDouble();
        area= area(radio);
       perimetro = perimetro(radio);
    }

    public double area(double radio) {
        return (Math.PI) * (Math.pow(radio, 2));

    }

    public double perimetro(double radio) {
        return 2 * (Math.PI) * radio;

    }
// /*calcular area*/
//   public double crearArea(double radio){
//            area=(Math.PI)*(Math.pow(radio,2));
//            return area;
//            
//   }
//   /*calcular perimetro*/
//   public double crearPerimetro(double radio){
//        perimetro=2*(Math.PI)*radio;
//            return perimetro;
//   }
}
