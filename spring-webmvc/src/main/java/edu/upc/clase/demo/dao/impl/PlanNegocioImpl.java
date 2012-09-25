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
        getJdbcTemplate().update("insert into plan_negocio( ti_pl_negocio"
                + ", us_creacion, fe_creacion) values(?, ?, ?)"
                , objPlan.getTi_pl_negocio(), objPlan.getUs_creacion(), objPlan.getFe_creacion() );
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
    
    @Override
    public Integer actualizar(PlanNegocio objPlan) {
          return getJdbcTemplate().update(
                "update Plan_Negocio set ti_pl_negocio = ?, us_modificacion=?"
                  + " ,fe_modificacion=? where id = ?", objPlan.getTi_pl_negocio(),
                  objPlan.getUs_modificacion(), objPlan.getFe_modificacion());
    }

    @Override
    public Integer cambiarEstado(PlanNegocio objPlan) {
      return getJdbcTemplate().update("UPDATE Plan_Negocio Set id_estado=?, us_modificacion=?"
              +" ,fe_modificacion=? where id_pl_negocio=?",
               objPlan.getId_estado() , objPlan.getUs_modificacion(), 
               objPlan.getFe_modificacion(), objPlan.getId_pl_negocio() );
    }
    
    @Override
    public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan)
    {
        try{
            Map<String, Object> parametros= new HashMap<String, Object>();
            parametros.put("nPlanID", objPlan.getId_pl_negocio());
            parametros.put("cPlanTitulo", objPlan.getTi_pl_negocio());
            parametros.put("nCatID", objPlan.getId_categoria());
            parametros.put("cPlanEstado", objPlan.getId_estado());
            return (List<PlanNegocio>) getSimpleJdbcTemplate().queryForObject(
                    
                    "SELECT * FROM Plan_Negocio WHERE 1=1 "
                    + " AND (:cPlanTitulo='' or ti_pl_negocio like %:cPlanTitulo%)"
                    + " AND (:nCatID=0  or =:nCatID) "
                    + " AND (:cPlanEstado='' or id_estado=:cPlanEstado)",
                    new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), parametros);
        } catch(EmptyResultDataAccessException e)
        {
            return null;
        }
   }

    @Override
    public PlanNegocio buscarPorId(Integer id) {
      try{
            return getSimpleJdbcTemplate().queryForObject(
                    "SELECT * FROM Plan_Negocio where where id_pl_negocio=?", 
                    new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), id);
        } catch(EmptyResultDataAccessException e)
        {
            return null;
        }
    }
    /*Detalle de plan de negocio*/
    @Override
    public Integer insertarArchivo(PlanNegocio objPlan)
    {
        /*Obtener la secuencia*/
        PlanNegocio objPlan1;
        objPlan1 = getSimpleJdbcTemplate().queryForObject(
                    "SELECT isnull(max(id_secuencia)+1,0) FROM detalle_planegocio "
                + " where where no_archivo=? and ti_archivo=?", 
                    new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), objPlan.getNo_archivo()
                , objPlan.getTi_archivo() );
        objPlan.setId_secuencia(objPlan1.getId_secuencia());
        
        getJdbcTemplate().update("insert into detalle_planegocio( id_pl_negocio"
                + ", id_secuencia, no_archivo, ti_archivo) values(?, ?, ?, ?)"
                , objPlan.getId_pl_negocio(), objPlan.getId_secuencia(), objPlan.getNo_archivo()
                , objPlan.getTi_archivo());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
     @Override
    public Integer eliminarArchivo(PlanNegocio objPlan) {
      return getJdbcTemplate().update("DELETE detalle_planegocio where id_det_plnegocio =?",
               objPlan.getId_det_plnegocio() );
    }
    
    
}
