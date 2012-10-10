/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.entity.Subcategoria;
import edu.upc.clase.demo.service.SubcategoriaService;
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
 * @author Megu
 */
@Controller("subcategoriaController")
public class SubcategoriaController {
    
    @Autowired
    SubcategoriaService subcategoriaService;
    private static Logger log = LoggerFactory.getLogger(CategoriaController.class);
    public Integer scat = 0;
    
    @RequestMapping("/subcategorias/index")
    public ModelAndView index(@RequestParam("nCatID")Integer id) {
        ModelAndView mav = new ModelAndView("subcategorias/index");
        List<Subcategoria> subcategoria = subcategoriaService.buscarSubCategoria(id);
        scat = subcategoria.get(1).getnCatID();
        mav.addObject("subcategoria", subcategoria);
        return mav;
    }    
    
    @RequestMapping(value = "/subcategorias/new", method = RequestMethod.GET)
    public ModelAndView newSubcategoria() {
        ModelAndView mav = new ModelAndView("subcategorias/new");
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.setnUsuCrea(1);
        subcategoria.setnCatID(scat);
        mav.getModelMap().put("subcategoria", subcategoria);
        return mav;
    }
    
    @RequestMapping(value = "/subcategorias/new", method = RequestMethod.POST)
    public String createCategoria(@ModelAttribute("subcategoria") Subcategoria subcategoria, SessionStatus status) {
        subcategoriaService.insertar(subcategoria);
        status.setComplete();
        return "redirect:/pages/subcategorias/index?nCatID=" + subcategoria.getnCatID();
    }   
    
    @RequestMapping(value="/subcategorias/edit", method=RequestMethod.GET)
    public ModelAndView editCategoria (@RequestParam("nSCatID")Integer id) {
        ModelAndView mav = new ModelAndView("subcategorias/edit");
        Subcategoria subcategoria = subcategoriaService.buscarPorId(id);
        mav.getModelMap().put("subcategoria", subcategoria);
        return mav;
    }
    
    @RequestMapping(value="/subcategorias/edit", method=RequestMethod.POST)
    public String update(@ModelAttribute("subcategoria") Subcategoria subcategoria, SessionStatus status) {
        subcategoria.setnUsuCrea(1);
        subcategoriaService.actualizar(subcategoria);
        status.setComplete();
        return "redirect:/pages/subcategorias/index?nCatID=" + subcategoria.getnCatID();
    }    
    
    @RequestMapping("/subcategorias/delete")
    public ModelAndView delete(@RequestParam("nSCatID")Integer id)
    {
        Subcategoria subcategoria = subcategoriaService.buscarPorId(id);
        subcategoriaService.eliminar(subcategoria);
        ModelAndView mav = new ModelAndView("redirect:/pages/subcategorias/index?nCatID=" + subcategoria.getnCatID());
        return mav;
    }        
}