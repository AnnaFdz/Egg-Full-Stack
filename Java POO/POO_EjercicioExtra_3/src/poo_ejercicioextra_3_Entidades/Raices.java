/*
  Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b 
 */
package poo_ejercicioextra_3_Entidades;

/**
 *
 * @author Anny
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return (Math.pow(b, 2) - 4 * a * c);

    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;

    }
 public boolean tieneRaiz() {
        return getDiscriminante() == 0;

    }
//     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
//en el caso en que se tenga una única solución posible. 
    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Primera solucion :"+((-b - Math.sqrt(getDiscriminante())) / (2 * a)));
            System.out.println("Segunda solucion :"+((-b + Math.sqrt(getDiscriminante())) / (2 * a)));
        }
    }
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
//de no existir solución, se mostrará un mensaje. 
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b 
// */
    public void obtenerRaiz() {
        if (tieneRaiz()){
            System.out.println(-b / (2 * a));

        }
            
    }
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
            
        }else {
            System.out.println("No tiene raices");
        }
        
        
    }
    
}
