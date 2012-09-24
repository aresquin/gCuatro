/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Pregunta;
import edu.upc.clase.demo.entity.Usuario;


/**
 *
 * @author user
 */
public interface PreguntaDao {
    
    public Integer enviar(Pregunta pregunta);
    public void eliminar(Pregunta pregunta);
    public void responder(Pregunta pregunta);
}
