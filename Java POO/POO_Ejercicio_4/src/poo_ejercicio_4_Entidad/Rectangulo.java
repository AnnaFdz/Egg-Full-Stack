/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio_4_Entidad;

/**
 *
 * @author Anny
 */
public class Rectangulo {
    /*
    . Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
    */
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo(){
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        base= leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura= leer.nextDouble();
    }
    public double superficieRectangulo(){
        
        
        return base * altura;
        
        
    }
    public double perimetroRectangulo(){
        
        
        return (base + altura)*2;
    }
    public void dubujarRectangulo(){
        
    
        for (int i =1; i <= altura; i++) {
            for (int j =1; j <= base; j++) {
                
              if(i == 1 || i == altura || j == 1 || j == base){
                  
                  System.out.print("* ");
                  
              } else{
                  System.out.print("  ");
              } 
                
            }
            System.out.println();
        }
     
        
    }
}
