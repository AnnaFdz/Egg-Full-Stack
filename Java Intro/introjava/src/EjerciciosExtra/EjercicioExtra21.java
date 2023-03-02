/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author Anny
 */
public class EjercicioExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
 Los profesores del curso de programaciÃ³n de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prÃ¡cticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo prÃ¡ctico evaluativo 10%
Segundo trabajo prÃ¡ctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int contador = 0;
        double nota1, nota2, nota3, nota4;
        double[] arreglo = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno: " + (i + 1));
            System.out.println("Nota primer trabajo practico evaluativo: ");
            nota1 = sc.nextDouble();
            nota1 = notas(nota1);
            System.out.println("Nota segundo trabajo practico evaluativo: ");
            nota2 = sc.nextDouble();
            nota2 = notas(nota2);
            System.out.println("Nota primer Integrador: ");
            nota3 = sc.nextDouble();
            nota3 = notas(nota3);
            System.out.println("Nota segundo Integrador: ");
            nota4 = sc.nextDouble();
            nota4 = notas(nota4);
            arreglo[i] = nota1 * 0.1 +nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
            if (arreglo[i] >= 7) {
                contador++;
            }

        }
        System.out.println("La cantidad de alumnos aprobados es " + contador + " y desaprobados es " + (10-contador));
    }

    public static double notas(double nota) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no es vÃ¡lida");
            System.out.println("Ingrese otra nota");
            nota = sc.nextDouble();
        }
        return nota;
    }
}
