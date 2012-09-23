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
    public void actualizar(PlanNegocio objPlan);
    public void eliminar(PlanNegocio objPlan);
    public List<PlanNegocio> buscarPlanNegocio();
    public PlanNegocio buscarPorId(Integer id);
}
