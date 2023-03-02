/*
 *Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package relaciones_ejercicio_2_Entidad;

/**
 *
 * @author Anny
 */
public class RevolverDeAgua {
    private int posicion_actual;
    private int posicion_agua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }
    public void llenarRevolver(int jugadores){
        this.posicion_actual = (int) (Math.random() * jugadores + 1);
	this.posicion_agua = (int) (Math.random() * jugadores + 1);
    }
    public boolean mojar(){
        //devuelve true si es =
        return (posicion_actual== posicion_agua);
        
        
    }
    public void siguienteChorro(){
        if (posicion_actual>=1 && posicion_actual<6) {
	   posicion_actual++;	    
	}
	else{
	    posicion_actual=1;
	}
    }

    @Override
    public String toString() {
        return "RevolverDeAgua; " + "posicion_actual: " + posicion_actual + ", posicion_agua: " + posicion_agua;
    }
    

    
}
