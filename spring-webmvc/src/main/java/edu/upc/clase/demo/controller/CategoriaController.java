/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.entity.Categoria;
import edu.upc.clase.demo.entity.CriterioBusqueda;
import edu.upc.clase.demo.service.CategoriaService;
import java.util.List;
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
 * @author Juan Yabiku
 */
@Controller("categoriaController")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    private static Logger log = LoggerFactory.getLogger(CategoriaController.class);
    
    @RequestMapping("/categorias/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("categorias/index");
        List<Categoria> categorias = categoriaService.buscarCategoria();
        mav.addObject("categorias", categorias);
        return mav;
    }
    
    @RequestMapping(value = "/categorias/new", method = RequestMethod.GET)
    public ModelAndView newCategoria() {
        ModelAndView mav = new ModelAndView("categorias/new");
        Categoria categorias = new Categoria();
        mav.getModelMap().put("categorias", categorias);
        return mav;
    }    
    
    @RequestMapping(value = "/categorias/new", method = RequestMethod.POST)
    public String createUsuario(@ModelAttribute("categorias")Categoria categorias, SessionStatus status) {    
        categoriaService.insertar(categorias);
        status.setComplete();
        return "redirect:/pages/categorias/index";
    }    
    
    @RequestMapping(value="/categorias/edit", method=RequestMethod.POST)
    public String update(@ModelAttribute("categorias") Categoria categorias, SessionStatus status) {
        categoriaService.actualizar(categorias);
        status.setComplete();
        return "redirect:/pages/categorias/index";
    }    
    
    @RequestMapping("/categorias/delete")
    public ModelAndView delete(@RequestParam("nCatID")Integer id)
    {
        ModelAndView mav = new ModelAndView("redirect:/pages/categorias/index");
        Categoria categorias = categoriaService.buscarPorId(id);
        categoriaService.eliminar(categorias);
        return mav;
    }
    
//    @RequestMapping(value = "/categorias/buscar", method=RequestMethod.POST)
//    public ModelAndView buscar(@ModelAttribute("criterioBusqueda") CriterioBusqueda criterio, SessionStatus status) {
//        ModelAndView mav = new ModelAndView("categorias/resultadoBusqueda");
//        log.info("resultado = " + categoriaService.buscarPorNombre(criterio.getcCatNombre()));
//        mav.getModel().put("resultado",categoriaService.buscarPorNombre(criterio.getcCatNombre()));
//        return mav;
//    }
}
