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
        public void actualizar(PlanNegocio objPlan) {
             log.info("Actualizando Plan");
            plannegocioDao.actualizar(objPlan);
        }

        @Override
        public void eliminar(PlanNegocio objPlan) {
            log.info("Eliminando Plan");
            plannegocioDao.eliminar(objPlan);
        }

        @Override
        public List<PlanNegocio> buscarPlanNegocio() {
            log.info("Buscando todos los usuarios");
            return plannegocioDao.buscarPlanNegocio();
        }

        @Override
        public PlanNegocio buscarPorId(Integer id) {
            log.info("Buscar usuario por id");
            return plannegocioDao.buscarPorId(id);
        }

        @Override
        public Integer insertar(PlanNegocio objPlan) {
             return plannegocioDao.insertar(objPlan);
        }
}
