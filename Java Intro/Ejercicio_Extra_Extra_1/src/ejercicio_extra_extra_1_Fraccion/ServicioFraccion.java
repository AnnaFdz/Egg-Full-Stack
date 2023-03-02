 /*
 *Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicio_extra_extra_1_Fraccion;

/**
 *
 * @author Anny
 */
public class ServicioFraccion {
    java.util.Scanner leer = new java.util.Scanner(System.in);
    
    public Fraccion crearFraccion (){
        System.out.println("Ingrese una fraccion");
        System.out.print("numerador:");
        int n1 = leer.nextInt();
         System.out.print("denominador:");
        int d1 = leer.nextInt();
         System.out.println("Ingrese una fraccion");
        System.out.print("numerador:");
        int n2 = leer.nextInt();
         System.out.print("denominador:");
        int d2 = leer.nextInt();
        return new Fraccion(n1, n2, d1, d2);
      
    }
    public void sumar(Fraccion x){
        if (x.getDenominador1() == x.getDenominador2()){
            x.setN3(x.getNumerador1()+x.getNumerador2());
            
        } else {
            x.setD3(x.getDenominador1() * x.getDenominador2());
             x.setN3(x.getNumerador1() * x.getDenominador2()+x.getNumerador2()* x.getDenominador1());
        }
    }
    public void restar(Fraccion x){
        if (x.getDenominador1() == x.getDenominador2()){
            x.setN3(x.getNumerador1()-x.getNumerador2());
            
        } else {
            x.setD3(x.getDenominador1() * x.getDenominador2());
             x.setN3(x.getNumerador1() * x.getDenominador2()-x.getNumerador2()* x.getDenominador1());
        }
    }
    public void multiplicar(Fraccion x){
        
            x.setD3(x.getDenominador1() * x.getDenominador2());
             x.setN3(x.getNumerador1() * x.getNumerador2());
       
    }
public void dividir(Fraccion x){
        
            x.setD3(x.getDenominador1() * x.getNumerador2());
             x.setN3(x.getNumerador1() * x.getDenominador2() );
       
    }
    public void menu(Fraccion x){
        int opc;
        do {
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("Suma(1)");
        System.out.println("Resta(2)");
        System.out.println("Multiplicacion(3)");
        System.out.println("Division(4)");
         opc = leer.nextInt();
        switch (opc) {
            case 1:
                sumar(x);
                break;
            case 2:
                restar(x);
                break;
            case 3:
                multiplicar(x);
                break;
            case 4:
                dividir(x);
                break;
            case 5:
                break;
            
        }
        System.out.println("");
        if (opc !=5){
 System.out.println(x.getN3()+"/"+x.getD3());
        }
    } while (opc!= 5);
        
}
}
