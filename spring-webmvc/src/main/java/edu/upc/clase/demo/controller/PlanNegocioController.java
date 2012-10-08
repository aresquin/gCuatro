/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.entity.Credential;
import edu.upc.clase.demo.entity.CriterioBusqueda;
import edu.upc.clase.demo.entity.PlanNegocio;
import edu.upc.clase.demo.service.PlanNegocioService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Johan
 */
@Controller("plannegocioController")
public class PlanNegocioController {
     @Autowired
    private PlanNegocioService planNService;
    private static Logger log = LoggerFactory.getLogger(PlanNegocioController.class);
    
    @RequestMapping("/plan/listado")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("plan/lista");
        PlanNegocio objPlan= new PlanNegocio();
        List<PlanNegocio> ListadoPlan = planNService.buscarPlanNegocio(objPlan);
        PlanNegocio criterioBusqueda = new PlanNegocio();
        mav.addObject("criterioBusqueda",criterioBusqueda);
        mav.addObject("ListadoPlanes", ListadoPlan);
        return mav;
    }
    
    @RequestMapping(value = "/plan/buscar", method=RequestMethod.POST)
    public ModelAndView buscar(@ModelAttribute("criterioBusqueda") PlanNegocio objPlan, SessionStatus status) {
        ModelAndView mav = new ModelAndView("plan/lista");
        log.info("resultado = " + planNService.buscarPlanNegocio(objPlan));        
        mav.addObject("criterioBusqueda",objPlan);
        mav.addObject("ListadoPlanes",planNService.buscarPlanNegocio(objPlan));
        return mav;
    }
    
    
    @RequestMapping(value = "/plan/nuevo", method = RequestMethod.GET)
    public ModelAndView NuevoPlan() {
        ModelAndView mav = new ModelAndView("plan/new");
        PlanNegocio objPlan = new PlanNegocio();
        mav.getModelMap().put("Plan", objPlan);
        return mav;
    }

    @RequestMapping(value = "/plan/nuevo", method = RequestMethod.POST)
    public String Create(@ModelAttribute("Plan")PlanNegocio objPlan, SessionStatus status) {    
        planNService.insertar(objPlan);
        status.setComplete();
        return "redirect:/pages/plan/listado";
        
    }
    
    @RequestMapping(value = "/plan/editar", method = RequestMethod.GET)
    public ModelAndView editPlan(@RequestParam("id")Integer id) {    
        ModelAndView mav = new ModelAndView("plan/edit");
        PlanNegocio objPlan = planNService.buscarPorId(id);
        mav.getModelMap().put("Plan", objPlan);
        return mav;        
    }
    @RequestMapping(value="/plan/editar", method=RequestMethod.POST)
    public String update(@ModelAttribute("Plan") PlanNegocio objPlan, SessionStatus status) {
        planNService.actualizar(objPlan);
        status.setComplete();
        return "redirect:/pages/plan/listado";
    }
    
    @RequestMapping("/plan/eliminar")
    public ModelAndView delete(@RequestParam("id")Integer id)
    {
        ModelAndView mav = new ModelAndView("redirect:/pages/plan/listado");
        PlanNegocio objPlan = planNService.buscarPorId(id);
        objPlan.setnEstID(3);
        planNService.cambiarEstado(objPlan);
        return mav;
    }
    
    /*Archivos adjuntos*/
    
    @RequestMapping(value = "/plan/CargarArchivo", method = RequestMethod.GET)
    public ModelAndView listadoArchivos() {
        ModelAndView mav = new ModelAndView("plan/listaArchivo");
        PlanNegocio objPlan= new PlanNegocio();
        objPlan.setnPlaID(1); 
        List<PlanNegocio> ListadoArchivo = planNService.buscarArchivosPlanID(objPlan);
        mav.addObject("ListadoArchivos", ListadoArchivo);
        PlanNegocio criterioBusqueda = new PlanNegocio();
        criterioBusqueda.setnPlaID(1); 
        mav.addObject("fileupload",criterioBusqueda);
        return mav;
    }
    
    
   @RequestMapping(value = "/plan/CargarArchivo", method = RequestMethod.POST)
    public ModelAndView CargarArchivo(@ModelAttribute("fileupload") PlanNegocio objPlan, SessionStatus status) { 
        log.info("Cargaa File: " + objPlan.getcAAdjNombre());
        log.info("Cargaa File: " + objPlan.getnPlaID());
        ModelAndView mav = new ModelAndView("plan/listaArchivo");
        objPlan.setcAAdjExtension("*.DOC"); 
        planNService.insertarArchivo(objPlan);
        status.setComplete();
        return mav;
        
    }
    
   
   
    @RequestMapping("/plan/eliminarArchivo")
    public ModelAndView EliminarArchivo(@RequestParam("id")Integer id)
    {
        ModelAndView mav = new ModelAndView("redirect:/pages/plan/Archivo");
        PlanNegocio objPlan= new PlanNegocio();
        objPlan.setnPlaID(id);
        planNService.eliminarArchivo(objPlan);
       
        return mav;
    }
    
}
