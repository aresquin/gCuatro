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
    
        
        public String ValidarDatos(PlanNegocio objPlan)
        {
           String sMsg="";
            if (objPlan.getcPlaTitulo().equals(""))
            {
                sMsg="Debe ingresar un titulo del plan";
            }
            else if (objPlan.getnCatID().equals(0))
            {
                sMsg="Debe elegir una categoria";
            }
            else if (objPlan.getcPlaVision().equals(""))
            {
                sMsg="Debe ingresar un descripcion de vision";
            }
            else if (objPlan.getcPlaTiempo().equals(""))
            {
                sMsg="Debe ingresar un tiempo";
            }
            else if (objPlan.getnPlaInvTotal()==0.00)
            {
                sMsg="Debe ingresar un monto de inversion";
            }
           else if (objPlan.getnPlaPreVenta()==0.00)
            {
                sMsg="Debe ingresar un precio de venta";
            }
            return sMsg;
        }
        
        @Override
        public Integer insertar(PlanNegocio objPlan) {
            String sMsg=ValidarDatos(objPlan);
            if (sMsg.equals(""))
            {
                
                log.info("Registrando un nuevo plan");
                return plannegocioDao.insertar(objPlan);
            }
            else
            {
                log.info(sMsg);
                return 0;
            }
            
            
        }
        
        @Override
        public Integer actualizar(PlanNegocio objPlan) {
           String sMsg=ValidarDatos(objPlan);
            if (sMsg.equals(""))
            {
                log.info("Actualizando plan");
                return plannegocioDao.actualizar(objPlan);
            } 
            else
            {
                log.info(sMsg);
                return 0;
            }
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
            PlanNegocio objReturn= new PlanNegocio();
            if (id==0)
            {
                log.info("Debe ingresar un código");
                objReturn=null;
                
            }
            else if (id!=0)
            {
                log.info("Buscando por ID");
                objReturn =plannegocioDao.buscarPorId(id);
            }
            return objReturn;
            
        }

        
        @Override
        public Integer obtenerSecuencia(PlanNegocio objPlan) {
            log.info("Obteniendo la secuencia de Archivo Adjunto");
            return plannegocioDao.obtenerSecuencia(objPlan);
        }
        
        @Override
        public Integer insertarArchivo(PlanNegocio objPlan) {
            String sMsg="";
            if(objPlan.getcAAdjNombre().trim().equals(""))
            {
                sMsg="Debe ingresar un archivo a cargar";
            }
            
            if(sMsg.equals(""))
            {
                log.info("Registrando un archivo adjunto");
                return plannegocioDao.insertarArchivo(objPlan);
            }
            else
            {
                log.info(sMsg);
                return 0;
            } 
        }
          
        @Override
        public Integer eliminarArchivo(PlanNegocio objPlan) {
             String sMsg="";
            if(objPlan.getcAAdjNombre().trim().equals(""))
            {
                sMsg="Debe elegir un archivo a eliminar";
            }
            
            if(sMsg.equals(""))
            {
                log.info("Eliminando un archivo adjunto");
                return plannegocioDao.eliminarArchivo(objPlan);
            }
            else
            {
                log.info(sMsg);
                return 0;
            } 
            
        }
        
       
}
