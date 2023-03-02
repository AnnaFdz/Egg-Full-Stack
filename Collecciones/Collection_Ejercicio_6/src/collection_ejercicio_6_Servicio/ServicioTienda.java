/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package collection_ejercicio_6_Servicio;

import collection_ejercicio_6_Entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Anny
 */
public class ServicioTienda {

    private Scanner leer;
    private HashMap<String, Producto> tiendaMap;

    public ServicioTienda() {
        this.leer = new java.util.Scanner(System.in).useDelimiter("\n");
        this.tiendaMap = new HashMap<>();
    }

    public void menu() {
       
        int op = 0;
        String r = "";
        do {
            System.out.println("MENU");
            System.out.println("1. Crear Producto");
            System.out.println("2. Agregar Producto al Mapa");
            System.out.println("3. Crear Productos e incluirlos en el mapa");
            System.out.println("4. Actualizar Precio");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Mostrar Mapa");
            System.out.println("7. Salir");
            System.out.println("Elija opcion:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    crearProducto();

                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    mapaProductos();

                    break;
                case 4:
                    actualizarPrecio();

                    break;
                case 5:
                    eliminaProducto();
                    break;
                case 6:
                    mostrarMapa();
                    break;
                case 7:
                    System.out.println("Seguro que desea salir? s/n");
                    r = leer.next();

                    break;
            }
        } while (!r.equalsIgnoreCase("s"));
    }

    public Producto crearProducto() {
        System.out.println("Ingrese el nombre de un producto");
        String producto = leer.next().toLowerCase();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();

        return new Producto(producto, precio);
    }

    public void mapaProductos() {
        Producto p = new Producto();
        do {
            p = crearProducto();
            tiendaMap.put(p.getNombre_producto(), p);
            System.out.println("Desea seguir agregando productos s/n");

        } while (!"n".equals(leer.next().toLowerCase()));

    }

    public void agregarProducto() {

        System.out.println("Ingrese el nombre de un producto");
        String producto = leer.next().toLowerCase();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();
        tiendaMap.put(producto, new Producto(producto, precio));

    }

    public void mostrarMapa() {
//        for (Map.Entry<String, Producto> aux : tiendaMap.entrySet()) {
//            String key = aux.getKey();
//            Producto value = aux.getValue();
//            System.out.println("llave: " + key + " valor: " + value);
//        }
        System.out.println("Clave\t\t   Nombre del Producto  \tPrecio");
        for (Map.Entry<String, Producto> aux : tiendaMap.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();
            System.out.println(key + "\t  Valor: " + value);
        }
        System.out.println("--------\n");
    }

    public void modificarValor() {
        Producto p = new Producto();
        System.out.println("Ingrese nombre de producto a modificar: ");
        String nombre = leer.next();
        if (tiendaMap.containsKey(nombre)) {

            System.out.println("Ingrese el precio del producto");
            Double precio_nuevo = leer.nextDouble();
            p.setNombre_producto(nombre);
            p.setPrecio(precio_nuevo);

            tiendaMap.put(p.getNombre_producto(), p);
        } else {
            System.out.println("El nombre del producto no figura");
        }


        /*
if (Trabajadores.containsKey(Rut)) {
    System.out.println("Nuevo Nombre de Trabajador: ");
    String name = sc.next();
    System.out.println("Nuevo Cargo de Trabajador: ");
    String cargo = sc.next();
    //Agregamos  Elemento con clave Rut(Sin modificarla)
    Trabajadores.put(Rut, new worker(name,cargo) );            
 }

         */
    }

    public void eliminaProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar ");
        String nombre = leer.next();
        if (tiendaMap.containsKey(nombre)) {
            tiendaMap.remove(nombre);
        } else {
            System.out.println("No hay productos con ese nombre");
        }
    }

    public void actualizarPrecio() {
        Producto p = new Producto();
        System.out.println("Ingrese nombre de producto a modificar: ");
        String nombre = leer.next();
        if (tiendaMap.containsKey(nombre)) {

            System.out.println("Ingrese el precio del producto");
            Double precio_nuevo = leer.nextDouble();
            p.setNombre_producto(nombre);
            p.setPrecio(precio_nuevo);

            tiendaMap.replace(nombre, p);
        } else {
            System.out.println("El nombre del producto no figura");
        }
    }

}
