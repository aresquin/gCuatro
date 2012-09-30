/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Comentario;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface ComentarioDao {
    
    public Integer comentar(Comentario objComentario);
    public Integer eliminar(Comentario objComentario);
    
}
