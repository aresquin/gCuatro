/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.entity.CriterioBusqueda;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import sun.usagetracker.UsageTrackerClient;

@Controller("usuariosController")
public class UsuariosController {
    
   @Autowired
    private UsuariosService usuariosService;
    private static Logger log = LoggerFactory.getLogger(UsuariosController.class);
    
    @RequestMapping("/usuarios1/index")
    public ModelAndView index() {
         ModelAndView mav = new ModelAndView("usuarios1/index");
         List<Usuarios> usuarios = usuariosService.buscarTodos();
         mav.addObject("usuarios", usuarios);
       
       return mav;
   }
    
}
