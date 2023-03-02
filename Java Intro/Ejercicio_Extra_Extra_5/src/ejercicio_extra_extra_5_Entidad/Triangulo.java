/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ejercicio_extra_extra_5_Entidad;

/**
 *
 * @author Anny
 */
public class Triangulo {
   

    private int lado;
    private int base;

    public Triangulo() {
    }

    public Triangulo(int lado, int base) {
        this.lado = lado;
        this.base = base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double area() {
        double altura = Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2) / 4));
        return base * altura / 2;
    }

    public double perimetro() {
        return lado + lado + base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + ", base=" + base + '}';
    }

}
