package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.AvisoDao;
import edu.upc.clase.demo.entity.Aviso;
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
 * @author gian
 */
@Repository
public class AvisoDaoImpl extends SimpleJdbcDaoSupport implements AvisoDao {

    private static Logger log = LoggerFactory.getLogger(AvisoDaoImpl.class);

    @Autowired
    public AvisoDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Aviso aviso) {
        getJdbcTemplate().update(
                "insert into avisos (titulo,descripcion) values (?, ?)",
                aviso.getTitulo(), aviso.getDescripcion());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public void actualizar(Aviso Aviso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Aviso Aviso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Aviso> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,titulo,descripcion from avisos",
                new BeanPropertyRowMapper<Aviso>(Aviso.class));
    }

    @Override
    public Aviso buscarPorId(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id, titulo, descripcion from avisos where id=?",
                    new BeanPropertyRowMapper<Aviso>(Aviso.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


}