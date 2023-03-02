/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ejercicio_extra_extra_5;

import ejercicio_extra_extra_5_Entidad.Triangulo;
import java.util.Arrays;

/**
 *
 * @author Anny
 */
public class Ejercicio_Extra_Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangulo[] vectorTriangulos = new Triangulo[4];
        for (int i = 0; i < vectorTriangulos.length; i++) {
            int base = (int) (Math.random() * 20);
            int lado = (int) (Math.random() * 20);
            vectorTriangulos[i] = new Triangulo(lado, base);
        }
        double mayor = 0;
        int indice=-1;
        for (int i = 0; i < vectorTriangulos.length; i++) {
            System.out.println(vectorTriangulos[i]);
            if (mayor < vectorTriangulos[i].area()) {
                mayor = vectorTriangulos[i].area();
                indice = i;
            }

        }
        System.out.println("Datos del Triangulo con mayor superficie: "+vectorTriangulos[indice].toString());
    }
}
