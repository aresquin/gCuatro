/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service;

import edu.upc.clase.demo.entity.PlanNegocio;
import java.util.List;

/**
 *
 * @author Johan
 */
public interface PlanNegocioService {
    public String insertar(PlanNegocio plannegocio);
    public String actualizar(PlanNegocio plannegocio);
    public String cambiarEstado(PlanNegocio plannegocio);
    public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan);
    public PlanNegocio buscarPorId(Integer id);
            
    /* Archivos Adjuntos*/
    
    public Integer obtenerSecuencia(PlanNegocio objPlan);    
    public Integer insertarArchivo(PlanNegocio objPlan);
    public Integer eliminarArchivo(PlanNegocio objPlan);
    public List<PlanNegocio> buscarArchivosPlanID(PlanNegocio objPlan);
    
    
    
    
}
