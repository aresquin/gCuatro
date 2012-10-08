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
        CriterioBusqueda criterioBusqueda = new CriterioBusqueda();
        mav.addObject("ListadoPlanes", ListadoPlan);
        return mav;
    }
    
    
}
