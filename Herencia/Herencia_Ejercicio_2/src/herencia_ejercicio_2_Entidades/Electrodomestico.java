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
public class Electrodomestico {
 
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        }
        return "blanco";
    }

    protected void crearElectrodomestico() {
        setPrecio(1000d);
        System.out.println("Ingrese el peso: ");
        setPeso(leer.nextDouble());
        System.out.println("Ingrese el color: ");
        setColor(comprobarColor(leer.next()));
        System.out.println("Ingrese el consumo: ");
        setConsumo(comprobarConsumoEnergetico(leer.next().charAt(0)));
    }

    protected void precioFinal() {
        switch (this.consumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            default:
                this.precio += 100;
        }
        if (this.peso > 1 && this.peso < 19) {
            this.precio += 100;
        }
        if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        }
        if (this.peso > 80) {
            this.precio += 1000;
        }

    }
}
