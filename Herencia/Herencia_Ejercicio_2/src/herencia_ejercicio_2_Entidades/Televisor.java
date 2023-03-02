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
public class Televisor extends Electrodomestico{
     private Integer resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del TV: ");
        setResolucion(leer.nextInt());
        System.out.println("Posee sintonizador TDT? s/n");
        if(leer.next().equals("s")){
            setSintonizador(true);
        }
        else{
            setSintonizador(false);
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            super.precio *= 1.3 ;
        }
        if(this.sintonizador){
            super.precio+=500d;
        }
    }
}
