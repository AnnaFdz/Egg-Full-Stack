/*
 *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package collection_ejercicio_1_Servicio;

import collection_ejercicio_1_Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class ServicioAlumno {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public ServicioAlumno() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }

    public Alumno crearAlumnos() {

        int nota1, nota2, nota3;

        ArrayList<Integer> notasLista = new ArrayList();

        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();

        notasLista.add(nota1 = (int) (Math.random() * 11));
        notasLista.add(nota2 = (int) (Math.random() * 11));
        notasLista.add(nota3 = (int) (Math.random() * 11));

        return new Alumno(nombre, notasLista);

    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);

    }

    public void fabricaAlumno() {
        String r;
        System.out.println("Crear alumno");

        do {
            agregarAlumno(crearAlumnos());
            System.out.println("Desea seguir creando s/n");
            r = leer.next().toLowerCase();

        } while (!"n".equals(r));

    }

    public Integer calcularPromedio(ArrayList notasLista) {
        Integer promedio ,   suma=0;
        
       for (int i = 0; i < alumnos.size(); i++) {
           Alumno a = alumnos.get(i);
           System.out.println(notasLista.get(i));
           suma = suma +(int) notasLista.get(i);
        }
       promedio = (int)suma/3;
       return promedio;
     
    }
public void mostrar (){
    for (Alumno alumno : alumnos) {
        System.out.println(alumno);
    }
}
        
    public void notaFinal(String alumnoNombre) {
        
        for (int i = 0; i < alumnos.size(); i++) {
           Alumno a = alumnos.get(i);
            if (a.getNombre().equals(alumnoNombre)){
                System.out.println("Promedio Final del alumno"+calcularPromedio(a.getNota()));
                
            }
        }
    }

}
