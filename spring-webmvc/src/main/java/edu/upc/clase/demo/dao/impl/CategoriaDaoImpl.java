/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.CategoriaDao;
import edu.upc.clase.demo.entity.Categoria;
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
        getJdbcTemplate().update("insert into Categoria (cCatNombre,sCatRutaImagen,nEstID,cCatFecCrea,nUsuCrea)"
                + " values (?, ?, 1, SYSDATE(), ?)", objCategoria.getcCatNombre(), objCategoria.getsCatRutaImagen(), 
                objCategoria.getnUsuCrea());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void actualizar(Categoria objCategoria) {
        getJdbcTemplate().update("update Categoria set cCatNombre = ?, sCatRutaImagen = ?, cCatFecModi = SYSDATE(),"
                + " nUsuModi = ? WHERE nCatID = ?", objCategoria.getcCatNombre(), objCategoria.getsCatRutaImagen(), 
                objCategoria.getnUsuModi(), objCategoria.getnCatID());
    }

    @Override
    public void eliminar(Categoria objCategoria) {
        getJdbcTemplate().update("update Categoria set nEstID=2, cCatFecModi=SYSDATE(), nUsuModi=? WHERE nCatID=?"
                , objCategoria.getnUsuModi(), objCategoria.getnCatID());
     }

    @Override
    public List<Categoria> buscarCategoria() {
        try {
            return (List<Categoria>) getSimpleJdbcTemplate().queryForObject(
                    "select * from Categoria", new BeanPropertyRowMapper<Categoria>(Categoria.class));
        } catch(EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select cCatNombre, sCatRutaImagen from Categoria where nCatID=? and nEstID=1",
                    new BeanPropertyRowMapper<Categoria>(Categoria.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
