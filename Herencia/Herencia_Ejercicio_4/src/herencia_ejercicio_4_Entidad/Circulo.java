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
public class Circulo implements CalculosFormas {
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    @Override
    public double perimetro() {
        return PI * radio*2;
    
    }

    @Override
    public double area() {
        return  PI * Math.pow(radio,2);
        
    }
    
}
