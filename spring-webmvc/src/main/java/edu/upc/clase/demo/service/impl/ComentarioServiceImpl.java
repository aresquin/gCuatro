/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service.impl;
import edu.upc.clase.demo.dao.ComentarioDao;
import edu.upc.clase.demo.dao.impl.ComentarioDaoImpl;
import edu.upc.clase.demo.entity.Comentario;
import edu.upc.clase.demo.service.ComentarioService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
public class ComentarioServiceImpl implements ComentarioService {
    
    private static Logger log = LoggerFactory.getLogger(ComentarioDaoImpl.class);
    
    @Autowired
    private ComentarioDao comentarioDao;

    @Override
    public Integer comentar(Comentario objComentario) {
        
        if (!"".equals(objComentario.getcComDescripcion())) {
            log.info("Ingresando comentario");
            return comentarioDao.comentar(objComentario);
        }
        return null;
       /* throw new UnsupportedOperationException("Not supported yet.");*/
    }

    @Override
    public void eliminar(Comentario objComentario) {
         log.info("Eliminando comentario");
        comentarioDao.eliminar(objComentario);
        /*throw new UnsupportedOperationException("Not supported yet.");*/
    }
    
}
