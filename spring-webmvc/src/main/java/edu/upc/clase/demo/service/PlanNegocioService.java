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
    public Integer insertar(PlanNegocio plannegocio);
    public void actualizar(PlanNegocio plannegocio);
    public void eliminar(PlanNegocio plannegocio);
    public List<PlanNegocio> buscarPlanNegocio();
    public PlanNegocio buscarPorId(Integer id);
    
}
