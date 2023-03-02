/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejercicio_2_Entidades;

/**
 *
 * @author Anny
 */
public class Lavadora extends Electrodomestico {
     private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora: ");
        setCarga(leer.nextInt());
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            super.precio += 500;
        }
    }
}
