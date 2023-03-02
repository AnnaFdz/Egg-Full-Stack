/*
  Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package herencia_ejercicio_extra_2_Entidad;

/**
 *
 * @author Anny
 */
public class EdificioDeOficina extends Edificio {
    private int numOficina;
    private int cantPersona;
    private int numPiso;

    public EdificioDeOficina() {
    }
    
    

    public EdificioDeOficina(int numOficina, int cantPersona, int numPiso) {
        this.numOficina = numOficina;
        this.cantPersona = cantPersona;
        this.numPiso = numPiso;
    }

    public EdificioDeOficina(int numOficina, int cantPersona, int numPiso, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.numOficina = numOficina;
        this.cantPersona = cantPersona;
        this.numPiso = numPiso;
    }

    public int getNumOficina() {
        return numOficina;
    }

    public void setNumOficina(int numOficina) {
        this.numOficina = numOficina;
    }

    public int getCantPersona() {
        return cantPersona;
    }

    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "EdificioDeOficina{" + "numOficina=" + numOficina + ", cantPersona=" + cantPersona + ", numPiso=" + numPiso + '}';
    }
    

    @Override
    public float calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public float calcularVolumen() {
        return ancho*largo*alto;
    }
    public void cantPersonas(){
        System.out.println("cantidad de personas por piso: "+cantPersona);
        System.out.println("cantidad de persnas por edificio: "+ cantPersona*numPiso);
    }
}
