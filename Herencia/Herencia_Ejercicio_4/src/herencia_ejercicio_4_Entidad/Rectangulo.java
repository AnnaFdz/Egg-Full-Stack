/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_4_Entidad;

import herencia_ejercicio_4_Interfaz.CalculosFormas;

/**
 *
 * @author Anny
 */
public class Rectangulo implements CalculosFormas{
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return (base + altura) * 2;
        
    }

    @Override
    public double area() {
        return base * altura;
       
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
