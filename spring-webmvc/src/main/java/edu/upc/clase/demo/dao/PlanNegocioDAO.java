/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.PlanNegocio;
import java.util.List;
/**
 *
 * @author Johan
 */
public interface PlanNegocioDAO {
    public Integer insertar(PlanNegocio objPlan);
    public Integer actualizar(PlanNegocio objPlan);
    public Integer cambiarEstado(PlanNegocio objPlan);
    public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan);
    public PlanNegocio buscarPorId(Integer id);
    /*Detalle Plan de Negocio Archivos Adjuntos*/
    
    public Integer insertarArchivo(PlanNegocio objPlan);
    public Integer eliminarArchivo(PlanNegocio objPlan);
    
}
