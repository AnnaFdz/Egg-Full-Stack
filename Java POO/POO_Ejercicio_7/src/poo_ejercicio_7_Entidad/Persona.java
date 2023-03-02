/*
 *    /*
        Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.

        
 */
package poo_ejercicio_7_Entidad;

/**
 *
 * @author Anny
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void crearPersona() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Edad de la persona: ");
        edad = leer.nextInt();
        System.out.println("Peso de la persona: ");
        peso = leer.nextFloat();
        System.out.println("Altura de la persona: ");
        altura = leer.nextFloat();
        do {
            System.out.println("Ingrese el sexo de la persona('H' hombre, 'M' mujer, 'O' otro)");
            sexo = leer.next();
        } while (!(sexo.equals("H") || sexo.equals("M") || sexo.equals("O")));
    }

    public int calcularIMC() {

        float calculoImc = (float) (peso / (Math.pow(altura, 2)));
        int imc;

        if (calculoImc < 20) {
            imc = -1;
        } else if (calculoImc > 25) {
            imc = 1;
        } else {
            imc = 0;
        }

        return imc;
    }

    public boolean mayorDeEdad() {

        if (edad > 17) {
            return true;
        } else {
            return false;
        }

    }
}
