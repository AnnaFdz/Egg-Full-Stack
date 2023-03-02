/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1_Entidad;

/**
 *
 * @author Anny
 */
public class Libro {

    /*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
     */
    public long ISBN;
    public String titulo;
    public String autor;
    public int paginas;
//constructor vacios

    public Libro() {

    }
    //constructor con parameros, todoso los atributos

    public Libro(long ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getISBN() {
        return this.ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void llenarLibro() {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir ISBN: ");
        this.ISBN = leer.nextLong();
        System.out.println("Introducir Titulo: ");
        this.titulo = leer.next();
        System.out.println("Introducir autor: ");
        this.autor = leer.next();
        System.out.println("Introducir numero de paginas");
        this.paginas = leer.nextInt();

    }
    public void mostrarLibro() {
        System.out.println(ISBN+" "+titulo+" "+autor+" "+paginas);
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

}
