/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.PlanNegocioDAO;
import edu.upc.clase.demo.dao.impl.PlanNegocioImpl;
import edu.upc.clase.demo.entity.PlanNegocio;
import edu.upc.clase.demo.service.PlanNegocioService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Johan
 */
    @Service
    public class PlanNegocioServiceImpl implements PlanNegocioService {
        
        private static Logger log = LoggerFactory.getLogger(PlanNegocioImpl.class);    
    
        @Autowired
        private PlanNegocioDAO plannegocioDao;
    
        @Override
        public Integer actualizar(PlanNegocio objPlan) {
             log.info("Actualizando plan");
            return plannegocioDao.actualizar(objPlan);
        }

        @Override
        public Integer cambiarEstado(PlanNegocio objPlan) {
            log.info("Cambiando el estado del plan");
            return plannegocioDao.cambiarEstado(objPlan);
        }

        @Override
        public List<PlanNegocio> buscarPlanNegocio(PlanNegocio objPlan) {
            log.info("Buscando todos los planes");
            return plannegocioDao.buscarPlanNegocio(objPlan);
        }

        @Override
        public PlanNegocio buscarPorId(Integer id) {
            log.info("Buscar plan por id");
            return plannegocioDao.buscarPorId(id);
        }

        @Override
        public Integer insertar(PlanNegocio objPlan) {
            log.info("Registrando un nuevo plan");
             return plannegocioDao.insertar(objPlan);
        }
}
