/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.PlanNegocioDAO;
import edu.upc.clase.demo.entity.PlanNegocio;
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
 * @author Johan
 */
@Repository
public class PlanNegocioImpl extends SimpleJdbcDaoSupport implements PlanNegocioDAO{
    
    private static Logger log= LoggerFactory.getLogger(PlanNegocioImpl.class);
    
    @Autowired
    public PlanNegocioImpl(DataSource dataSource)
    {
        log.info("Asignado el datasource");
        setDataSource(dataSource);                        
    }
    
    @Override
    public Integer insertar(PlanNegocio objPlan)
    {
        getJdbcTemplate().update("insert into plan_negocio( ti_pl_negocio, us_creacion) values(?, ?)"
                , objPlan.getTi_pl_negocio(), objPlan.getUs_creacion() );
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
    
     @Override
    public void actualizar(PlanNegocio objPlan) {
          getJdbcTemplate().update(
                "update usuarios set nombre = ?, correo = ? where id = ?"
               );
    }

    @Override
    public void eliminar(PlanNegocio objPlan) {
       getJdbcTemplate().update("UPDATE Plan_Negocio Set id_estado=? where id_pl_negocio=?",
               objPlan.getId_estado() ,objPlan.getId_usuario() );
    }
    
    @Override
    public List<PlanNegocio> buscarPlanNegocio()
    {
        try{
            return (List<PlanNegocio>) getSimpleJdbcTemplate().queryForObject(
                    "SELECT * FROM Plan_Negocio",
                    new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class));
        } catch(EmptyResultDataAccessException e)
        {
            return null;
        }
   }

    @Override
    public PlanNegocio buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
