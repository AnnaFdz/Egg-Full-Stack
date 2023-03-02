/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_3_Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import relaciones_ejercicio_3_Entidad.Baraja;
import relaciones_ejercicio_3_Entidad.Carta;
import relaciones_ejercicio_3_Enums.Palo;

/**
 *
 * @author Anny
 */
public class ServicioBaraja {

    private java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    private Baraja mazo = new Baraja();
    private Baraja cartas_dadas = new Baraja();

    public Baraja crearBaraja() {
        int cont = 0;
        ArrayList<Carta> c = new ArrayList();
        ArrayList<Carta> dadas = new ArrayList();
        //x cada palo (oro, copa, espada, basto) le asigna 10 num (xq 9 y 8 no cuenbtan  no ejecuta nngun bloque d codigo)
        for (Palo aux : Palo.values()) {
            String p = aux.getPalo();
            for (int i = 0; i < 12; i++) {
                cont = i + 1;
                if ((cont == 8) || (cont == 9)) {
                    //no ejecuta ningun bloquede codigo
                } else {
                    //x cada num crea una carta y la agrega al array
                    Carta ca = new Carta(Integer.valueOf(cont), aux);
                    c.add(ca);
                }
            }

        }
        cartas_dadas.setCartas(dadas);
        mazo.setCartas(c);
        System.out.println("listo");
        return mazo;
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void baraja() {
        Collections.shuffle(mazo.getCartas());

    }

    // siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
//se haya llegado al final, se indica al usuario que no hay más cartas
    public void siguienteCarta() {
        if (mazo.getCartas().isEmpty()) {
            System.out.println("no quedan cartas en el mazo");
        } else {
            Carta ca = mazo.getCartas().get(0);
            System.out.println("la carta es: " + mazo.getCartas().get(0).toString());
        }
    }

    // cartasDisponibles(): indica el número de cartas que aún se puede repartir
    public void cartasDisponibles() {
        System.out.println("cartas disponibles: " + mazo.getCartas().size());
    }

    /*
     darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario
     */
    public void darCartas() {
        System.out.println("cuantas cartas quiere?");
        int cantidad = leer.nextInt();
        if (cantidad <= mazo.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("le corresponden " + mazo.getCartas().get(i).toString());
            }
            for (int i = 0; i < cantidad; i++) {
                cartas_dadas.getCartas().add(mazo.getCartas().get(i));
                mazo.getCartas().remove(i);

            }

        } else {
            System.out.println("no hay suficientes cartas");
            cartasDisponibles();
        }
    }

    /*
     cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
     */
    public void cartasMonton() {
        if (cartas_dadas.getCartas().isEmpty()) {
            System.out.println("no quedan cartas en el mazo");
        } else {
            System.out.println("cartas q van saliendo");
            String saliendo = "";
            int cont = 0;
            for (Carta carta : cartas_dadas.getCartas()) {
                System.out.println(carta);
            }

//            for (Object aux : cartas_dadas.getCartas()) {
//                saliendo = saliendo.concat(aux.toString() + " ");
//                cont++;
//                if (cont == 10) {
//                    System.out.println(saliendo);
//                    saliendo = "";
//                    cont = 0;
//                }
//            }
        }
    }

    /*
     mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBarajas() {
        if (mazo.getCartas().isEmpty()) {
            System.out.println("no hay mas cartas");
        } else {
            System.out.println("cartas ");
            String pozo = "";
            int cont = 0;

            for (Object aux : mazo.getCartas()) {
                pozo = pozo.concat(aux.toString() + " ");
                cont++;
                if (cont == 10) {
                    System.out.println(pozo);
                    pozo = "";
                    cont = 0;
                }
            }
        }
    }
      public void menu(){
          Byte op=0;
          do {
            System.out.println("Que desea realizar?");
            System.out.println("---------------");
            System.out.println("1) Crear Baraja");
            System.out.println("2) Barajar");
            System.out.println("3) Siguiente Carta");
            System.out.println("4)Ver Cartas Disponibles");
            System.out.println("5) Dar Cartas");
            System.out.println("6) Ver Descartadas");
            System.out.println("7) Ver Baraja");
            System.out.println("8) Salir");
            op= leer.nextByte();
            
            System.out.println("");
            System.out.println("");
            switch (op) {
                case 1:
                    crearBaraja();
                    break;
                case 2:
                    baraja();
                    break;
                case 3:
                    siguienteCarta();
                    break;
                case 4:
                    cartasDisponibles();
                    break;
                case 5:
                    darCartas();
                    break;
                case 6:
                    cartasMonton();
                    break;

            }
            System.out.println("");
            System.out.println("");
        } while (op != 8);
      }
}
