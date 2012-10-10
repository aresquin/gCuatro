/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.SubcategoriaDao;
import edu.upc.clase.demo.entity.Subcategoria;
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
public class SubcategoriaDaoImpl extends SimpleJdbcDaoSupport implements SubcategoriaDao {
    
    private static Logger log= LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    @Autowired
    public SubcategoriaDaoImpl(DataSource datasource) {
        log.info("Asignando el datasource");
        setDataSource(datasource);       
    }
    
    @Override
    public Integer insertar (Subcategoria objSubcategoria) {
        getJdbcTemplate().update("insert into Subcategoria (cSCatNombre,nCatID,cSCatFecCrea,nUsuCrea) "
                + "values (?,?,SYSDATE(),?)", objSubcategoria.getcSCatNombre(), objSubcategoria.getnCatID(),
                objSubcategoria.getnUsuCrea());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }
    
    @Override
    public void actualizar(Subcategoria objSubcategoria) {
        getJdbcTemplate().update("update Subcategoria set cSCatNombre = ?, cSCatFecModi = SYSDATE(), nUsuModi = ? "
                + "WHERE nSCatID = ?", objSubcategoria.getcSCatNombre(), objSubcategoria.getnUsuCrea(), 
                objSubcategoria.getnSCatID());
    }

    @Override
    public void eliminar(Subcategoria objSubcategoria) {
        getJdbcTemplate().update("delete from Subcategoria WHERE nSCatID=?", objSubcategoria.getnSCatID());
     }

    @Override
    public List<Subcategoria> buscarSubCategoria(Integer id) {
        try {
            return getSimpleJdbcTemplate().query(
                    "select * from Subcategoria where nCatID=?", 
                    new BeanPropertyRowMapper<Subcategoria>(Subcategoria.class), id);
        } catch(EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Subcategoria buscarPorId(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select * from Subcategoria where nSCatID=?",
                    new BeanPropertyRowMapper<Subcategoria>(Subcategoria.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
