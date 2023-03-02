/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio_extra_1_Persistencia;

import java.util.ArrayList;
import java.util.Collection;
import jdbc_ejercicio_extra_1_Entidades.Casa;

/**
 *
 * @author Anny
 */
public final class CasaDAO extends DAO {
    private Casa casa;
    
     public void guardarCasa(Casa casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("Debe indicar la casa");
            }

            String sql = "INSERT INTO Casas (id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda)"
                    + "VALUES ( " + casa.getId_casa()+ " , '" + casa.getCalle()+ " , '"+casa.getNumero()+ " , '"+
                    casa.getCodigo_postal()+ " , '"+casa.getCiudad()+ " , '"+
                    casa.getPais()+ " , '"+casa.getFecha_desde()+ " , '"+casa.getFecha_hasta()+ " , '"+ casa.getTiempo_minimo()+ " , '"+casa.getTiempo_maximo()+ " , '"+casa.getTipo_vivienda()+ "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Casa buscarCasaPorId(int id_casa) throws Exception {
        try {

            String sql = "SELECT * FROM Fasas "
                    + " WHERE id_casas = '" + id_casa + "'";

            consultarBase(sql);

            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
            }
            desconectarBase();
            return casa;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    
  public void modificarCasa(int id_casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("Debe indicar la casa que desea modificar");
            }
            String sql = "UPDATE Familias SET "
                    + " calle = '" + casa.getCalle()+ "' , numero = '" + casa.getNumero()+ "' , codigo_postal = " + casa.getCodigo_postal()
                    +"' , ciudad = '" + casa.getCiudad()+"' , pais = '" + casa.getPais()+
                    "' , fecha_desde'" + casa.getFecha_desde() +
                    "' , fecha_hasta'"+casa.getFecha_hasta()+
                    "' , tiempo_minimo'" + casa.getTiempo_minimo()+
                    "' , tiempo_maximo'" + casa.getTiempo_maximo()+
                    "' , tipo_vivienda'" + casa.getTipo_vivienda()                   + " WHERE id_familia = '" + casa.getId_casa() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    public void eliminarCasa (int id_casa) throws Exception {
        try {
            String sql = "DELETE FROM casas WHERE id_casa = " + id_casa + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM familias ";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}