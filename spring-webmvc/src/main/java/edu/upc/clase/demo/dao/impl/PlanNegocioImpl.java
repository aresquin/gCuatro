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
        getJdbcTemplate().update("insert into plannegocio( cPlaTitulo"
                + ", nCatID, cPlaVision, cPlaRazon, cPlaTiempo, nPlaInvTotal  "
                + ", nPlaNeto, nPlaROI, nPlaPreVenta, nEstID  "
                + ", nUsuCrea, cPlaFecCrea) "
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                , objPlan.getcPlaTitulo()
                , objPlan.getnCatID(), objPlan.getcPlaVision(), objPlan.getcPlaRazon(), objPlan.getcPlaTiempo(), objPlan.getnPlaInvTotal()
                , objPlan.getnPlaNeto(), objPlan.getnPlaROI(), objPlan.getnPlaPreVenta(), objPlan.getnEstID()
                , objPlan.getnUsuCrea(), objPlan.getcPlaFecCrea() );
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }
    
    @Override
    public Integer actualizar(PlanNegocio objPlan) {
          return getJdbcTemplate().update(
                "update PlanNegocio set cPlaTitulo = ?"
                  + " , nCatID=?, cPlaVision=?, cPlaRazon=?, cPlaTiempo=?, nPlaInvTotal=? "
                  + " , nPlaNeto=?, nPlaROI=?, nPlaPreVenta=?, nEstID=?  "
                  + " , nUsuModi=?, cPlaFecModi=? where nPlaID = ?", objPlan.getcPlaTitulo(),
                  objPlan.getnCatID(), objPlan.getcPlaVision(), objPlan.getcPlaRazon(), objPlan.getcPlaTiempo(), objPlan.getnPlaInvTotal()
                , objPlan.getnPlaNeto(), objPlan.getnPlaROI(), objPlan.getnPlaPreVenta(), objPlan.getnEstID()
                , objPlan.getnUsuModi(), objPlan.getcPlaFecModi(), objPlan.getnPlaID());
    }

    @Override
    public Integer cambiarEstado(PlanNegocio objPlan) {
      return getJdbcTemplate().update("UPDATE PlanNegocio Set nEstID=?"
              +" , nUsuModi=?, cPlaFecModi=? where nPlaID=?",
               objPlan.getnEstID() , objPlan.getnUsuModi(), 
               objPlan.getcPlaFecModi(), objPlan.getnPlaID() );
    }
    
    @Override
    public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan)
    {
        try{
            Map<String, Object> parametros= new HashMap<String, Object>();
            parametros.put("nPlanID", objPlan.getnPlaID());
            parametros.put("cPlanTitulo", objPlan.getcPlaTitulo());
            parametros.put("nCatID", objPlan.getnCatID());
            parametros.put("nEstID", objPlan.getnEstID());
            return (List<PlanNegocio>) getSimpleJdbcTemplate().queryForObject(
                    
                    "SELECT * FROM PlanNegocio WHERE 1=1 ",
                    //+ " AND (:cPlanTitulo='' or cPlaTitulo like %:cPlanTitulo%)"
                    //+ " AND (:cPlanTitulo='' or cPlaTitulo =:cPlanTitulo)"
                    //+ " AND (:nCatID=0  or nCatID=:nCatID) "
                    //+ " AND (:nEstID=-1 or nEstID=:nEstID) ",
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
                    "SELECT * FROM PlanNegocio where nPlaID=?", 
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
            "SELECT max(ifnull(nAAdjSecuencia,0))+1 FROM Archivo_Adjunto "
            + " WHERE cAAdjNombre=?", 
            new BeanPropertyRowMapper<PlanNegocio>(PlanNegocio.class), 
            objPlan.getcAAdjNombre() );
        
        return objPlan1.getnAAdjSecuencia();
    }
    
    
    @Override
    public Integer insertarArchivo(PlanNegocio objPlan)
    {
       
        objPlan.setnAAdjSecuencia(obtenerSecuencia(objPlan));
        getJdbcTemplate().update("insert into Archivo_Adjunto( nPlaID"
                + ", nAAdjSecuencia, cAAdjNombre, cAAdjExtension) values(?, ?, ?, ?)"
                , objPlan.getnPlaID(), objPlan.getnAAdjSecuencia(), objPlan.getcAAdjNombre()
                , objPlan.getcAAdjExtension());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }
    
    @Override
    public Integer eliminarArchivo(PlanNegocio objPlan) {
      return getJdbcTemplate().update("DELETE FROM Archivo_Adjunto where nAAdjID =?",
               objPlan.getnAAdjID() );
    }
    
    
}
