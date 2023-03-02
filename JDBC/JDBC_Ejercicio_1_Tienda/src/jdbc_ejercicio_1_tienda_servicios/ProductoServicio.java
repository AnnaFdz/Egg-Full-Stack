/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio_1_tienda_servicios;

import java.util.Collection;
import jdbc_ejercicio_1_tienda_entidades.Producto;
import jdbc_ejercicio_1_tienda_persistencia.ProductoDAO;


/**
 *
 * @author Anny
 */
public class ProductoServicio {
    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }

            //Creamos el prodcuto. si x parametros sin codig se pasa x parametro
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

//    public void modificarProducto(int codigo, String nombre, Double precio, int codigofabricante) throws Exception {
//
//        try {
//
//            //Validamos
//            if (codigo < 0) {
//                throw new Exception("Debe indicar el codigo");
//            }
//
//            if (nombre == null || nombre.trim().isEmpty()) {
//                throw new Exception("Debe indicar el nombre");
//            }
//
//            if (codigofabricante < 0) {
//                throw new Exception("Debe indicar el codigo del fabricante");
//            }
//
//            //Buscamos
//            Producto producto = buscarProductoPorCodigo(codigo);
//
//            dao.modificarProducto(producto);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
     public void modificarProducto( int codigo, String nombre, Double precio, int codigofabricante) throws Exception {

        try {

            //Validamos
           

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (codigofabricante < 0) {
                throw new Exception("Debe indicar el codigo del fabricante");
            }

            //Buscamos
            
            Producto producto = buscarProductoPorCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigofabricante);
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            //Verificamos
            if (producto == null) {
                throw new Exception("No se encontró el producto para el código indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {

        try {

            //Validamos 
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarNombreProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarNombreProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarNombrePrecioProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarNombrePrecioProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listar120y202() throws Exception {

        try {

            Collection<Producto> productos = dao.listar120y202();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {

        try {

            Collection<Producto> produc = dao.listarPortatiles();

            return produc;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarBarato() throws Exception {

        try {

            Collection<Producto> productos = dao.listarBarato();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = dao.listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

  

}
