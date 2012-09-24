/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.CategoriaDao;
import edu.upc.clase.demo.entity.Categoria;
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
 * @author Juan Yabiku
 */
@Repository
public class CategoriaDaoImpl extends SimpleJdbcDaoSupport implements CategoriaDao {

    private static Logger log= LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    @Autowired
    public CategoriaDaoImpl (DataSource datasource) {
        log.info("Asignando el datasource");
        setDataSource(datasource);
    }   
    
    @Override
    public Integer insertar(Categoria objCategoria) {
        getJdbcTemplate().update("insert into categorias (no_categoria, ru_imagen, st_categoria, fe_creacion, us_creacion)"
                + " values (?, ?, ?, ?, ?)", objCategoria.getNombre(), objCategoria.getRuta(), objCategoria.getEstado(), 
                objCategoria.getFe_crea(), objCategoria.getUs_crea());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }

    @Override
    public void actualizar(Categoria objCategoria) {
        getJdbcTemplate().update("update categorias set no_categoria = ?, ru_imagen = ?, fe_modificacion = SYSDATE(),"
                + " us_modificacion = ? WHERE id_categoria = ?", objCategoria.getNombre(), objCategoria.getRuta(), 
                objCategoria.getUs_modi(), objCategoria.getId());
    }

    @Override
    public void eliminar(Categoria objCategoria) {
        getJdbcTemplate().update("update categorias set st_categoria = ?, fe_modificacion = SYSDATE(),"
                + " us_modificacion = ? WHERE id_categoria = ?", objCategoria.getEstado(), objCategoria.getUs_modi(), 
                objCategoria.getId());
     }

    @Override
    public List<Categoria> buscarCategoria() {
        try {
            return (List<Categoria>) getSimpleJdbcTemplate().queryForObject(
                    "select * from categorias", new BeanPropertyRowMapper<Categoria>(Categoria.class));
        } catch(EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
