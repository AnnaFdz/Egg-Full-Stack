/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio_extra_1_Persistencia;

import java.util.ArrayList;
import java.util.Collection;
import jdbc_ejercicio_extra_1_Entidades.Casa;
import jdbc_ejercicio_extra_1_Entidades.Familia;

/**
 *
 * @author Anny
 */
public final class FamiliaDAO extends DAO {

    private Familia familia;
    
     
    public void guardarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia");
            }

            String sql = "INSERT INTO Familias (id_familia, nombre, edad_minima, edad_maxima, num_hijos, email, id_casa_familia)"
                    + "VALUES ( " + familia.getId_familia()+ " , '" + familia.getNombre()+ " , '"+
                    familia.getEdad_minima()+ " , '"+familia.getEdad_maxima()+ " , '"+
                    familia.getNum_hijos()+ " , '"+familia.getEmail()+ " , '"+familia.getCasa().getId_casa()+ "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Familia buscarFamiliaPorId(int id_familia) throws Exception {
        try {

            String sql = "SELECT * FROM Familias "
                    + " WHERE id_familia = '" + id_familia + "'";

            consultarBase(sql);

            Familia familia = null;
            while (resultado.next()) {
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                int idCasa = resultado.getInt(7);
                Casa casa = CasaServicio.buscarCasaPorId(idCasa);
                familia.setCasa(casa);
            }
            desconectarBase();
            return familia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Familia buscarFamiliaPorNombre(String nombre) throws Exception {
        try {

            String sql = "SELECT * FROM Familias "
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Familia familia = null;
            while (resultado.next()) {
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                int idCasa = resultado.getInt(7);
                Casa casa = CasaServicio.buscarCasaPorId(idCasa);
                familia.setCasa(casa);
            }
            desconectarBase();
            return familia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
  public void modificarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia que desea modificar");
            }
            String sql = "UPDATE Familias SET "
                    + " nombre = '" + familia.getNombre()+ "' , edad_minima = '" + familia.getEdad_minima()+ "' , edad_maxima = " + familia.getEdad_maxima()
                    +"' , num_hijos = '" + familia.getNum_hijos()+"' , email = '" + familia.getEmail()+
                    "' , id_casa_familia '" + familia.getCasa().getId_casa()
                    + " WHERE id_familia = '" + familia.getId_familia() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    public void eliminarFamilia(int id_familia) throws Exception {
        try {
            String sql = "DELETE FROM Familias WHERE id_familia = " + id_familia + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Familia> listarFamilias() throws Exception {
        try {
            String sql = "SELECT * FROM familias ";
            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                int idCasa = resultado.getInt(7);
                Casa casa = CasaServicio.buscarCasaPorId(idCasa);
                familia.setCasa(casa);
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
