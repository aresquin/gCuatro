/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Respuesta;

/**
 *
 * @author user
 */
public interface RespuestaDao {
    
    public Integer enviar(Respuesta respuesta);
    public Integer eliminar(Respuesta respuesta);
   
}
