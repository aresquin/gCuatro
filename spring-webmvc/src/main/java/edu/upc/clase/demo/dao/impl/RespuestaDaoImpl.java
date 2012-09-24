package edu.upc.clase.demo.dao.impl;


import edu.upc.clase.demo.dao.RespuestaDao;
import edu.upc.clase.demo.entity.Respuesta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * @author user
 */
@Repository
public class RespuestaDaoImpl extends SimpleJdbcDaoSupport implements RespuestaDao {

    private static Logger log = LoggerFactory.getLogger(RespuestaDaoImpl.class);

    @Autowired
    public RespuestaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }  
     
    @Override
    public Integer enviar(Respuesta respuesta) {
        getJdbcTemplate().update(
                "insert into avisos (descripcion) values (?)",
                respuesta.getContenido());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public Integer eliminar(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}