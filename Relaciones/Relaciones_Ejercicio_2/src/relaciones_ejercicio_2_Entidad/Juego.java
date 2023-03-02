/*
 *Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package relaciones_ejercicio_2_Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class Juego {
   // ArrayList<Jugador> jugadores = new ArrayList();
     private Scanner leer;
    private ArrayList <Jugador> jugadores;
    private RevolverDeAgua r;

    public Juego() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.jugadores = new ArrayList();
        this.r = r;
    }

    public Juego(Scanner leer, ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.leer = leer;
        this.jugadores = jugadores;
        this.r = r;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }
     public int numeroDeJugadores(){

	System.out.println("Ingrese el numero de jugadores entre (1 y 6)");
	int jug = leer.nextInt();
	if (jug>=1 && jug<=6) {
            return jug;
        }else{
            jug=6;
  
	    return jug;
	}
     }
        public void llenarJuego() {
            
          Integer id;
	String nombre = "jugador";
        int jug = numeroDeJugadores();
	for (int i = 0; i < jug; i++) {
	    id=i+1;
            System.out.println("");
            System.out.println("Ingrese el nombre del jugador numero: " + (i + 1));
            nombre = leer.next();
	    jugadores.add(new Jugador(id, nombre , false));
            
	}  
      r.llenarRevolver(jug);
        ronda();
      
 }
           public ArrayList<Jugador> crearListaDeJugadores(int numeroDeJugadores){
	//---------------crear lista de jugadores---------------
	Integer id;
	String nombre = "jugador";
	for (int i = 0; i < numeroDeJugadores; i++) {
	    id=i+1;
	    jugadores.add(new Jugador(id, nombre , false));
	}
	return jugadores;
    }
    
    public void crearJuego(){
	r = new RevolverDeAgua(); // creo Revolver
	jugadores = new ArrayList<>(); //creo lista de jugadores
	r.llenarRevolver(numeroDeJugadores()); // cargo Revolver
	jugadores = crearListaDeJugadores(numeroDeJugadores());
    }
    
    public void iniciarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
	//determinar # de jugadores
	this.jugadores = jugadores;
	this.r = r;
    }
       public boolean ronda() {
           int numeroRonda=1;
	System.out.println("Ronda"+numeroRonda++);
	for (int i = 0; i < jugadores.size(); i++) {
	    System.out.println(jugadores.get(i).getNombre());
	    System.out.print("Antes:");
	    System.out.println(r.toString());
	    if (jugadores.get(i).disparo(r)) {
		System.out.print("El jugador "+ jugadores.get(i).getNombre()+ " murió."); // Despuès --> ");
		//System.out.println(r.toString());
		System.out.println("");
		System.out.println("FIN!");
		return true;
		//break;
	    } else {
		System.out.print("El jugador "+ jugadores.get(i).getNombre()+ " disparo."); // Despuès --> ");
		//System.out.println(r.toString());
		System.out.println("");
	    }
	}
		
	return false;
    }
    @Override
    public String toString() {
        return "Juego{" + "leer=" + leer + ", jugadores=" + jugadores + ", r=" + r + '}';
    }
    
    
}
