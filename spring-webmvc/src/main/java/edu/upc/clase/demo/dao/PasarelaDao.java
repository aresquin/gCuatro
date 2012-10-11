/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.PasarelaV;
import java.util.List;
/**
 *
 * @author Aresquin
 */
public interface PasarelaDao {
        public Integer insertar(PasarelaV pasarela);
        public PasarelaV buscarXcodigo(Integer id);
        public void actualizar(PasarelaV pasarela);
        public void eliminar(PasarelaV pasarela);
        public List<PasarelaV> buscarTodos();
        public PasarelaV buscarXntarjeta(Integer tarjeta);
        //public PasarelaV buscarCorreo(String correo);
        //public List<Colaborador> buscarPorNombre(String nombre);
    
}
