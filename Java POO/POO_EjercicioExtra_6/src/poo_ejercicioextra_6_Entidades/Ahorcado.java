/*
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main
 */
package poo_ejercicioextra_6_Entidades;



/**
 *
 * @author Anny
 */
public class Ahorcado {
    
    java.util.Scanner leer = new java.util.Scanner(System.in);
    public String[] palabra;
    public String[] descubierto;
    public String[] intentado;
    public int aciertos;
    public int limite;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int aciertos, int limite) {
        this.palabra = palabra;
        this.aciertos = aciertos;
        this.limite = limite;
    }

    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
     * mÃ¡xima. Con la palabra del usuario, pone la longitud de la palabra, como
     * la longitud del vector. DespuÃ©s ingresa la palabra en el vector, letra
     * por letra, quedando cada letra de la palabra en un Ã­ndice del vector. Y
     * tambiÃ©n, guarda en cantidad de jugadas mÃ¡ximas, el valor que ingresÃ³ el
     * usuario y encontradas en 0.
     */
    
    private void inicializar(Ahorcado x){
        System.out.println("Ingrese una palabra");
        String pala = leer.next();
        x.palabra = new String[pala.length()];
        for (int i = 0; i < pala.length(); i++) {
            x.palabra[i] = pala.substring(i, i + 1);
        }

        x.descubierto = new String[pala.length()];
        for (int i = 0; i < pala.length(); i++) {
            x.descubierto[i] = "-";
        }
        
        x.intentado = new String[26];
        for (int i = 0; i < 26; i++) {
            x.intentado[i] = "-";
        }
    }
    
    public void crearJuego(Ahorcado x) {
        x.inicializar(x);
        
        System.out.println("Cuantos intentos desea tener?");
        x.limite = leer.nextInt();

        x.aciertos = 0;
    }

    public void longitud(Ahorcado x) {
        System.out.println(x.palabra.length);
    }

    /**
     * MÃ©todo buscar(letra): este mÃ©todo recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. TambiÃ©n informarÃ¡
     * si la letra estaba o no.
     */
    public boolean buscar(String letra, Ahorcado x) {
        boolean hallado = false;

        
        for (int i = 0; i < x.palabra.length; i++) {
            if (x.descubierto[i].equals(letra)) {
                System.out.println("La letra ya a sido descubierta");
                hallado = true;
                break;
            }
        }
        
        //Revisa si la letra fue ingresada anteriormente.
        if (!hallado) {
            for (int i = 0; i < 26; i++) {
                if (x.intentado[i].equals(letra)) {
                    hallado = true;
                    System.out.println("La letra ya a sido intentada");
                }
            }
            
        }
        
        
        if (!hallado) {
            for (int i = 0; i < x.palabra.length; i++) {
                if (x.palabra[i].equals(letra)) {
                    hallado = true;
                    
                    x.aciertos++;
                }
            }
            
        }

        for (int i = 0; i < x.palabra.length; i++) {
            if (x.palabra[i].equals(letra)) {
                x.descubierto[i] = x.palabra[i];
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (x.intentado[i].equals("-")) {
                x.intentado[i] = letra;
                break;
            }
        }

        if (hallado == false) {
            x.limite--;
        } else System.out.println("Letra encontrada!");
        return hallado;
    }

    /**
     * MÃ©todo encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * mÃ©todo ademÃ¡s deberÃ¡ devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no estÃ©, se le
     * restarÃ¡ uno a sus oportunidades.
     */
    public boolean encontradas(String letra, Ahorcado x) {
        int hallado = 0;

        for (int i = 0; i < x.palabra.length; i++) {
            if (x.palabra[i].equals(letra)) {
                hallado++;
            }
        }

        return true;
    }

}
