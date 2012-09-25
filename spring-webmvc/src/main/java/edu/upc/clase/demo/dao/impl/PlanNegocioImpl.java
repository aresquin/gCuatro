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
        getJdbcTemplate().update("insert into plan_negocio( cPlaTitulo"
                + ", nCatID, cPlaVision, cPlaRazon, cPlaTiempo, nPlaTotal  "
                + ", nPlaNeto, nPlaROI, nPlaPreVenta, nEstID  "
                + ", nUsuCrea, nPlaFecCrea) "
                + " values(?, ?, ?)"
                , objPlan.getCPlaTitulo()
                , objPlan.getnCatID(), objPlan.getCPlaVision(), objPlan.getCPlaRazon(), objPlan.getCPlaTiempo(), objPlan.getNPlaInvTotal()
                , objPlan.getNPlaNeto(), objPlan.getNPlaROI(), objPlan.getNPlaPreVenta(), objPlan.getNEstID()
                , objPlan.getNUsuCrea(), objPlan.getNPlaFecCrea() );
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
    
    @Override
    public Integer actualizar(PlanNegocio objPlan) {
          return getJdbcTemplate().update(
                "update Plan_Negocio set cPlaTitulo = ?"
                  + " , nCatID=?, cPlaVision=?, cPlaRazon=?, cPlaTiempo=?, nPlaTotal=? "
                  + " , nPlaNeto=?, nPlaROI=?, nPlaPreVenta=?, nEstID=?  "
                  + " , nUsuModi=?, cPlaFecModi=? where nPlaID = ?", objPlan.getCPlaTitulo(),
                  objPlan.getnCatID(), objPlan.getCPlaVision(), objPlan.getCPlaRazon(), objPlan.getCPlaTiempo(), objPlan.getNPlaInvTotal()
                , objPlan.getNPlaNeto(), objPlan.getNPlaROI(), objPlan.getNPlaPreVenta(), objPlan.getNEstID()
                , objPlan.getNUsuModi(), objPlan.getCPlaFecModi(), objPlan.getNPlaID());
    }

    @Override
    public Integer cambiarEstado(PlanNegocio objPlan) {
      return getJdbcTemplate().update("UPDATE Plan_Negocio Set nEstID=?"
              +" , nUsuModi=?, cPlaFecModi=? where nPlaID=?",
               objPlan.getNEstID() , objPlan.getNUsuModi(), 
               objPlan.getCPlaFecModi(), objPlan.getNPlaID() );
    }
    
    @Override
    public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan)
    {
        try{
            Map<String, Object> parametros= new HashMap<String, Object>();
            parametros.put("nPlanID", objPlan.getNPlaID());
            parametros.put("cPlanTitulo", objPlan.getCPlaTitulo());
            parametros.put("nCatID", objPlan.getnCatID());
            parametros.put("nEstID", objPlan.getNEstID());
            return (List<PlanNegocio>) getSimpleJdbcTemplate().queryForObject(
                    
                    "SELECT * FROM Plan_Negocio WHERE 1=1 "
                    + " AND (:cPlanTitulo='' or cPlaTitulo like %:cPlanTitulo%)"
                    + " AND (:nCatID=0  or nCatID=:nCatID) "
                    + " AND (:nEstID=-1 or nEstID=:nEstID) ",
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
                    "SELECT * FROM Plan_Negocio where where nPlaID=?", 
                    new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), id);
        } catch(EmptyResultDataAccessException e)
        {
            return null;
        }
    }
    
    
    /* Archivos Adjuntos */
    @Override
    public Integer obtenerSecuencia(PlanNegocio objPlan)
    {
         /*Obtener la secuencia*/
        PlanNegocio objPlan1;
        objPlan1 = getSimpleJdbcTemplate().queryForObject(
            "SELECT isnull(max(nAAdjSecuencia)+1,0) FROM Archivo_Adjunto "
            + " WHERE cAAdjNombre=? and cAAdjExtension=? ", 
            new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), 
            objPlan.getCAAdjNombre() , objPlan.getCAAdjExtension() );
        
        return objPlan1.getNAAdjSecuencia();
    }
    
    
    @Override
    public Integer insertarArchivo(PlanNegocio objPlan)
    {
       
        objPlan.setNAAdjSecuencia(obtenerSecuencia(objPlan));
        getJdbcTemplate().update("insert into Archivo_Adjunto( nPlaID"
                + ", nAAdjSecuencia, cAAdjNombre, cAAdjExtension) values(?, ?, ?, ?)"
                , objPlan.getNPlaID(), objPlan.getNAAdjSecuencia(), objPlan.getCAAdjNombre()
                , objPlan.getCAAdjExtension());
        return getSimpleJdbcTemplate().queryForInt("call identity()");
    }
    
    @Override
    public Integer eliminarArchivo(PlanNegocio objPlan) {
      return getJdbcTemplate().update("DELETE Archivo_Adjunto where nAAdjID =?",
               objPlan.getNAAdjID() );
    }
    
    
}
