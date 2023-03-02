/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package poo_ejercicio_12_Entidad;

import java.util.Date;

/**
 *
 * @author Anny
 */
public class Persona {

    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void crearPersona() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese el dia de nacimiento de la persona");
        System.out.println("Dia");
        dia = leer.nextInt();
        System.out.println("Mes");
        mes = leer.nextInt();
        System.out.println("Año");
        anio = leer.nextInt();
        nacimiento = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();

    }

    public int calcularEdad() {

        Date fechaActual = new Date();

        if (fechaActual.getDate() >= nacimiento.getDate() && fechaActual.getMonth() >= nacimiento.getMonth()) {
            return fechaActual.getYear() - nacimiento.getYear();
        } else {
            return fechaActual.getYear() - nacimiento.getYear() - 1;
        }
    }
        /*
        Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
         */
    public boolean menorQue(int edad) {
        
    
        return calcularEdad()> edad;
       

    
}
   
    public void mostrarPersona(){
        System.out.println("Nombre: " + nombre + ", nacimiento: " + nacimiento.getDate() + "/" + (nacimiento.getMonth()+1) + "/" + (nacimiento.getYear()+1900) + ", edad: " +calcularEdad());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    
}
