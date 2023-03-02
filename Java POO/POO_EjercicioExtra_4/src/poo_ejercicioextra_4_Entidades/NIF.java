/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su 
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra 
(String o char) que le corresponde. Dispondrá de los siguientes métodos: 
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. 
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en 
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que 
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número 
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en 
un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package poo_ejercicioextra_4_Entidades;

/**
 *
 * @author Anny
 */
public class NIF {

    private long DNI;
    private char letra;

    public NIF() {
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese su DNI");
        DNI = leer.nextLong();
        char[] letras = {'R', 'T', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = letras[(int) DNI % 23];

    }

    public void mostrar() {
        String DNIString = String.valueOf(DNI);
        int longitud = DNIString.length();
        String aux = ("NIF: ");
        while (longitud != 8) {
            aux += 0;
            longitud++;
        }
        System.out.println(aux + DNI + "-" + letra);

       // return String.valueOf(DNI) + "-" + letra;

    }
}
