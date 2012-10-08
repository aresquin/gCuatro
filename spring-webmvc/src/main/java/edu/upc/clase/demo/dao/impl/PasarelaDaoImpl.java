package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.entity.Pasarela;
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

@Repository
public class PasarelaDaoImpl extends SimpleJdbcDaoSupport implements PasarelaDao {

    private static Logger log = LoggerFactory.getLogger(PasarelaDaoImpl.class);

    @Autowired
    public PasarelaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }
    
    @Override
    public Integer insertar(Pasarela pasarela) {

        getJdbcTemplate().update(
        "insert into Pasarela (cPasPais ,nPasNumTarjeta,cPasFecVencimiento ,nPasCodVerificacion ,cPasDireccion) values (?, ?, ?, ?, ?)",
                pasarela.getPais(), pasarela.getNtarjeta(), pasarela.getFecvencimiento(), pasarela.getCodverificacion(), pasarela.getDireccion());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public Pasarela buscarXcodigoCompra(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
    }

    
    
    
     
//    @Override
//    public void actualizar(Pasarela pasarela) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    @Override
    public void eliminar(Pasarela pasarela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pasarela> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pasarela buscarDireccion(String Direccion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pasarela buscarNumTarjeta(Integer ntarjeta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
