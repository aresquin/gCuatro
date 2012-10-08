/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.ComentarioDao;
import edu.upc.clase.demo.entity.Comentario;
import java.util.List;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;


/**
 *
 * @author carlos
 */
@Repository
public class ComentarioDaoImpl extends SimpleJdbcDaoSupport implements ComentarioDao {

    private static Logger log = LoggerFactory.getLogger(ComentarioDaoImpl.class);

    @Autowired
    public ComentarioDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }  
     
    @Override
    /**public Integer comentar(Comentario objComentario) {
        getJdbcTemplate().update(
                "insert into Comentario (cComDescripcion) values (?)",
                objComentario.getcComDescripcion());
               
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }*/
      public Integer comentar(Comentario objComentario) {
        getJdbcTemplate().update("insert into Comentario(cComDescripcion,nPlaID,nUsuID,cComFecCrea)"
                + " values (?, ?, ?, SYSDATE())", objComentario.getcComDescripcion(), objComentario.getnPlaID(), objComentario.getnUsuID());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    
    @Override
    public Integer eliminar(Comentario objComentario) {
         return getJdbcTemplate().update("DELETE FROM Comentario where nComID =?",
               objComentario.getnComID() );
     
        
    }
}
