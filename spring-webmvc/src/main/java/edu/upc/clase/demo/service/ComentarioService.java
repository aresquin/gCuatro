/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.Comentario;


/**
 *
 * @author user
 */
public interface ComentarioService {
    
        public Integer comentar (Comentario objComentario);
        public void eliminar (Comentario objComentario);
    
}
