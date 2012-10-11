package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.entity.PasarelaV;
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
 * @author Aresquin
 */
@Repository
public class PasarelaDaoImpl extends SimpleJdbcDaoSupport implements PasarelaDao {

    private static Logger log = LoggerFactory.getLogger(PasarelaDaoImpl.class);

    @Autowired
    public PasarelaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }
    
    @Override
    public Integer insertar(PasarelaV pasarela) {

        getJdbcTemplate().update(
        "insert into Pasarela (cPasPais ,nPasNumTarjeta,cPasFecVencimiento,nPasCodVerificacion,cPasDireccion) values (?, ?, ?, ?, ?)",
        pasarela.getPais(),pasarela.getNtarjeta(),pasarela.getFecvencimiento(),pasarela.getCodverificacion(),pasarela.getDireccion());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }
    
    @Override
    public void actualizar(PasarelaV pasarela) {
        getJdbcTemplate().update(
                "update Pasarela  set cPasPais  = ?,nPasNumTarjeta = ?, cPasFecVencimiento = ?, nPasCodVerificacion = ?, cPasDireccion = ? where nPasNumTarjeta = ?",
                 pasarela.getPais(),pasarela.getNtarjeta(),pasarela.getFecvencimiento(),pasarela.getCodverificacion(),pasarela.getDireccion(),pasarela.getIdpasarela() );
    }   
    
    @Override
    public PasarelaV buscarXntarjeta(Integer tarjeta) {
            try {
             return getSimpleJdbcTemplate().queryForObject(
                    "select cPasPais ,nPasNumTarjeta ,cPasFecVencimiento ,nPasCodVerificacion ,cPasDireccion  from Pasarela  where nPasNumTarjeta =?",
                    new BeanPropertyRowMapper<PasarelaV>(PasarelaV.class), tarjeta);
        } catch (EmptyResultDataAccessException e) {
            return null;
        } 
    }

    @Override
    public PasarelaV buscarXcodigo(Integer id) {
            try {
             return getSimpleJdbcTemplate().queryForObject(
                    "select cPasPais ,nPasNumTarjeta ,cPasFecVencimiento ,nPasCodVerificacion ,cPasDireccion  from Pasarela  where nPasId =?",
                    new BeanPropertyRowMapper<PasarelaV>(PasarelaV.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        } 
    }

    @Override
    public void eliminar(PasarelaV pasarela) {
       getJdbcTemplate().update(
                "delete from Pasarela where nPasNumTarjeta = ?", pasarela.getNtarjeta());
    }

    @Override
    public List<PasarelaV> buscarTodos() {
         return getSimpleJdbcTemplate().query(
                "select nPasId ,cPasPais ,nPasNumTarjeta ,cPasFecVencimiento ,nPasCodVerificacion,cPasDireccion  from colaboradores",
                new BeanPropertyRowMapper<PasarelaV>(PasarelaV.class));
    }
    
    
}
    


    
    

