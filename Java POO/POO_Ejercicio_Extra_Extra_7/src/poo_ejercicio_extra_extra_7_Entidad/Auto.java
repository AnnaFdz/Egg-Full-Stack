/*
 * Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package poo_ejercicio_extra_extra_7_Entidad;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Anny
 */
public class Auto {
   java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    private String nombre_duenio;
    private LocalDate vencimiento_carnet;
    private String color_auto;
    private String modelo_auto;
    private int km_motor;

    public Auto() {
    }
    public Auto(String nombre_dueño, LocalDate vencimiento_carnet, String color_auto, String modelo_auto, int km_motor) {
        this.nombre_duenio = nombre_dueño;
        this.vencimiento_carnet = vencimiento_carnet;
        this.color_auto = color_auto;
        this.modelo_auto = modelo_auto;
        this.km_motor = km_motor;
    }

    public String getNombre_dueño() {
        return nombre_duenio;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_duenio = nombre_dueño;
    }

    public LocalDate getVencimiento_carnet() {
        return vencimiento_carnet;
    }

    public void setVencimiento_carnet(LocalDate vencimiento_carnet) {
        this.vencimiento_carnet = vencimiento_carnet;
    }

    public String getColor_auto() {
        return color_auto;
    }

    public void setColor_auto(String color_auto) {
        this.color_auto = color_auto;
    }

    public String getModelo_auto() {
        return modelo_auto;
    }

    public void setModelo_auto(String modelo_auto) {
        this.modelo_auto = modelo_auto;
    }

    public int getKm_motor() {
        return km_motor;
    }

    public void setKm_motor(int km_motor) {
        this.km_motor = km_motor;
    }
    public void cargarFicha(){
        int dia, mes, anio;
        System.out.println("Ingrese los siguientes datos para cargar su ficha: ");    
        System.out.print("Nombre del dueño del vehiculo: ");
        nombre_duenio= leer.next();
        System.out.println("Fecha del vencimiento del carnet: ");
        System.out.print("Dia");
        dia = leer.nextInt();
        System.out.print("Mes");
        mes = leer.nextInt();
        System.out.print("Año");
        anio = leer.nextInt();
        vencimiento_carnet =  LocalDate.of(anio, mes, dia);
        System.out.println(vencimiento_carnet);
        System.out.print("Color del vehiculo: ");
        color_auto= leer.next();
        System.out.print("Modelo del auto: ");
        modelo_auto = leer.next();
        
    }
    public void cambioTitularidad(){
        System.out.println("Ingrese el nuevo titular del auto: ");
        nombre_duenio= leer.next();
        System.out.println("El nuevo titular es "+nombre_duenio);
    }
    public int kmTotal(){
        int km_recorridos=0;
        System.out.println("Ingrese los km recorridos ");
        km_recorridos= leer.nextInt();
        System.out.println("Los km Totales son: ");
        km_motor+=km_recorridos;
        return km_motor;
        
    }
    public void realizarService(){
        if (km_motor>= 10000){
            System.out.println("Ya es necesario realizar Service al vehiculo!!");  
        }else{
            System.out.println("Todavia no es necesario realizar Service al vehiculo ");
        }
    }

    @Override
    public String toString() {
        return "Auto{" + ", nombre_duenio=" + nombre_duenio + ", vencimiento_carnet=" + vencimiento_carnet + ", color_auto=" + color_auto + ", modelo_auto=" + modelo_auto + ", km_motor=" + km_motor + '}';
    }
            
}
