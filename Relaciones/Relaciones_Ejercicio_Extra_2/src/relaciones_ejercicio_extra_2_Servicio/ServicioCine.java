/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejercicio_extra_2_Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones_ejercicio_extra_2_Entidades.Asiento;
import relaciones_ejercicio_extra_2_Entidades.Cine;
import relaciones_ejercicio_extra_2_Entidades.Espectador;
import relaciones_ejercicio_extra_2_Entidades.Pelicula;


/**
 *
 * @author Anny
 */
public class ServicioCine {

    private Scanner leer;
    private Cine c = new Cine();

    public ServicioCine() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
    }


    public void crearEspectadores() {
        ArrayList<Espectador> espect = new ArrayList();
        String resp;

        do {
            Espectador e = new Espectador();

            System.out.println("Ingrese nombre");
            e.setNombreEspectador(leer.next());
            System.out.println("Ingrese edad");
            e.setEdad(leer.nextInt());
            System.out.println("Ingrese cantidad de dinero disponible");
            e.setDinero(leer.nextFloat());

            espect.add(e);

            System.out.println("Desea agregar otro espectador (S/N)");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("s"));
    }

    public ArrayList<Espectador> espectadoresAuto() {
        ArrayList<Espectador> espect = new ArrayList();
        int cant = 0;

        do {
            System.out.println("Ingrese la cantidad de espectadores para la función");
            cant = leer.nextInt();

        } while (cant < 0 && cant > 48);

        /*
                double precioFinal = precio - (precio * descuento);
        System.out.println(precioFinal); // Resultado => 2.8049999999999997 si no imprime 2.805

        precioFinal = Math.round(precioFinal * 100) / 100d;
        System.out.println(precioFinal); // Resultado => 2.81
         */
        for (int i = 0; i < cant; i++) {
            Espectador e = new Espectador("Espectador " + (i + 1), (int) (Math.random() * (90 + 10)), ((Math.round(((float) Math.random() * 1000) * 100))) / 100f);

            espect.add(e);
        }

//        for (Espectador espectador : espect) {
//            System.out.println(espectador);
//        }
        return espect;
    }

    public void crearAsiento() {
        
        Asiento[][] sala = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                int filas = 8 - i;
                String aux = "";

                switch (j) {

                    case 0:
                        aux = "A" + filas;

                        break;
                    case 1:
                        aux = "B" + filas;

                        break;
                    case 2:
                        aux = "C" + filas;

                        break;
                    case 3:
                        aux = "D" + filas;

                        break;
                    case 4:
                        aux = "E" + filas;

                        break;
                    case 5:
                        aux = "F" + filas;

                        break;
                }
                sala[i][j] = new Asiento(aux, null);
            }
        }
          c.setSala(sala);
         
       
        
    }

    

    public void mostrarSala() {
        //Cine c = new Cine();
        Asiento[][] sala = c.getSala();
//ArrayList<Espectador> espect = new ArrayList();
//espectadoresAuto();
//        crearAsientos();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j].toString());
            }
            System.out.println(" ");
        }
    }

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el titulo de la pelicula");
        String t = leer.next();
        System.out.println("Ingrese el director");
        String d = leer.next();
        System.out.println("Ingrese la edad minima");
        int ed = leer.nextInt();
        System.out.println("Ingrese la duracion de la pelicula");
        float dur = leer.nextFloat();

        return new Pelicula(t, d, ed, dur);

    }

    public void simulacionCine() {
      
        c.setPelicula(crearPelicula());
        System.out.println("Precio de la entrada: ");
        c.setPrecio(leer.nextFloat());

        //crearEspectadores();
        
        ArrayList<Espectador> espect = espectadoresAuto();
ArrayList<Espectador> admitidos = new ArrayList();

crearAsiento();
        for (Espectador aux : espect) {
            if (aux.getEdad() >= c.getPelicula().getEdadMin() && aux.getDinero() >= c.getPrecio()) {
                aux.setDinero(aux.getDinero() - c.getPrecio());
                
                admitidos.add(aux);
                  
            }

        }
        int posicionI, posicionJ;
        
        Asiento[][] sala1 = c.getSala();
        for (Espectador aux : admitidos) {
            do {                
                posicionI= (int)(Math.random()*8);
                posicionJ= (int)(Math.random()*6);
                
                
            } while (sala1[posicionI][posicionJ].getEspect()!= null);
            sala1[posicionI][posicionJ].setEspect(aux);
               
        }
      
    }


}
