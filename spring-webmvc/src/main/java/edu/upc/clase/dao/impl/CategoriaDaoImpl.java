/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.dao.impl;

import edu.upc.clase.dao.CategoriaDao;
import edu.upc.clase.entity.Categoria;
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
    private static Logger log = LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    @Autowired
    public CategoriaDaoImpl(DataSource datasource) {
        log.info("Asignando el datasource");
        setDataSource(datasource);
    }
    
    @Override
    public Integer insertar (Categoria categoria) {
        getJdbcTemplate().update(
                "insert into categorias (no_categoria,ru_imagen,st_categoria,fe_creacion,us_creacion values (?,?,1,SYSDATE(),?)",
                categoria.getNombre(), categoria.getRuta(), categoria.getFcrea(), categoria.getUcrea());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
    
    @Override
    public void actualizar (Categoria categoria) {
        getJdbcTemplate().update(
                "update categorias set no_categoria = ?, ru_imagen = ?, st_categoria = ?, fe_modificacion = SYSDATE(), us_modificacion = ? where id = ?",
                categoria.getNombre(), categoria.getRuta(), categoria.getEstado(), categoria.getUmodifica(), categoria.getCodigo());
    }
    
    @Override
    public void eliminar (Categoria categoria) {
        getJdbcTemplate().update(
                "update categorias set st_categoria = ?, fe_modificacion = SYSDATE(), us_modificacion = ? where id = ?",
                 categoria.getEstado(), categoria.getUmodifica(), categoria.getCodigo());
    }
    
    @Override
        public Categoria buscar(String nombre) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select id_categoria, no_categoria, ru_imagen, st_categoria from categorias where no_categoria=?",
                    new BeanPropertyRowMapper<Categoria>(Categoria.class), nombre);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
