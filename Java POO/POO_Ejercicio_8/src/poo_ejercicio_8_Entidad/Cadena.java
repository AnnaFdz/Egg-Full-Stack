/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_8_Entidad;

/**
 *
 * @author Anny
 */
public class Cadena {

    /*
     Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
 
        private String frase;
        private Integer longitud;

        public String getFrase() {
            return frase;
        }

        public void setFrase(String frase) {
            this.frase = frase;
            this.longitud = this.frase.length();
        }

        public void mostrarVocales() {
            int cont = 0;
        
            char[] charA = this.frase.toCharArray();
            for (char c : charA) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    cont++;
                }
            }
            System.out.println("la frase contiene " + cont + " vocales");
        }
        /*
        public int mostrarVocales() {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("A") || frase.substring(i, i + 1).equalsIgnoreCase("E") || frase.substring(i, i + 1).equalsIgnoreCase("I") || frase.substring(i, i + 1).equalsIgnoreCase("O") || frase.substring(i, i + 1).equalsIgnoreCase("U")) {
                cont++;
            }
        }
        return cont;
    }

        */
/*
        public void invertirFrase(){
        for (int i = long ; i>0; i--){
        sout (frase.substrin(i-1,i))
        */
        public void invertirFrase() {
            String esarf = "";
            char[] charA = this.frase.toCharArray();
            for (int i = 0; i < charA.length; i++) {
                esarf = esarf + charA[charA.length - 1 - i];
            }
            System.out.println(esarf);
        }
/*
        public void vecesrepetido(letra){
        for (int i = 0 ; i>lon; i++){
        if (letra.equalignorecasse(frase.substrin(i,i+1))
        cont++;
        */
        public void vecesRepetido(String car) {
            int cont = 0;
            char[] charA = this.frase.toCharArray();
            for (char c : charA) {
                if (c == car.charAt(0)) {
                    cont++;
                }
            }
            System.out.println("el caracter " + car + " se repite " + cont + " veces");
        }

        public void compararLongitud(String fra) {
            if (this.longitud == fra.length()) {
                System.out.println("las fraces tienen la misma logitud");
            } else {
                System.out.println("las fraces NO tienen la misma longitud");
            }
        }

        public void unirFrases(String fra) {
            System.out.println(this.frase.concat(fra));
        }
/*
        this.frase.replace("a",letra);
        sout
        */
        public void reemplazar(String letra) {
            String nuevaF = "";
            char[] charA = this.frase.toCharArray();
            for (char c : charA) {
                if (c == 'a') {
                    c = letra.charAt(0);
                }
                nuevaF = nuevaF + c;
            }
            System.out.println("la nueva frase queda como: " + nuevaF);
        }

        public boolean contiene(String letra) {
            return this.frase.contains(letra);
        }
    }
