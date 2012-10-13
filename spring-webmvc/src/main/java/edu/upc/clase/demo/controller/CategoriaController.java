/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.entity.Categoria;
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
        List<Categoria> categoria = categoriaService.buscarCategoria();
        Categoria criterioBusqueda = new Categoria();
        mav.addObject("criterioBusqueda",criterioBusqueda);
        mav.addObject("categoria", categoria);
        return mav;
    }
    
    @RequestMapping(value = "/categorias/new", method = RequestMethod.GET)
    public ModelAndView newCategoria() {
        ModelAndView mav = new ModelAndView("categorias/new");
        Categoria categoria = new Categoria();
        mav.getModelMap().put("categoria", categoria);
        return mav;
    }
    
    @RequestMapping(value = "/categorias/new", method = RequestMethod.POST)
    public String createCategoria(@ModelAttribute("categoria") Categoria categoria, SessionStatus status) {
        categoriaService.insertar(categoria);
        status.setComplete();
        return "redirect:/pages/categorias/index";
    }
    
    @RequestMapping(value="/categorias/edit", method=RequestMethod.GET)
    public ModelAndView editCategoria (@RequestParam("nCatID")Integer id) {
        ModelAndView mav = new ModelAndView("categorias/edit");
        Categoria categoria = categoriaService.buscarPorId(id);
        mav.getModelMap().put("categoria", categoria);
        return mav;
    }
    
    @RequestMapping(value="/categorias/edit", method=RequestMethod.POST)
    public String update(@ModelAttribute("categoria") Categoria categoria, SessionStatus status) {
        categoria.setnUsuModi(1);
        categoriaService.actualizar(categoria);
        status.setComplete();
        return "redirect:/pages/categorias/index";
    }
    
    @RequestMapping("/categorias/delete")
    public ModelAndView delete(@RequestParam("nCatID")Integer id)
    {
        ModelAndView mav = new ModelAndView("redirect:/pages/categorias/index");
        Categoria categoria = categoriaService.buscarPorId(id);
        categoria.setnUsuModi(1);
        categoriaService.eliminar(categoria);
        return mav;
    }    
    
    @RequestMapping(value = "/categorias/buscar", method=RequestMethod.POST)
    public ModelAndView buscar(@ModelAttribute("criterioBusqueda") Categoria categoria, SessionStatus status) {
        ModelAndView mav = new ModelAndView("categorias/resultadoBusqueda");
        log.info("resultado = " + categoriaService.buscarPorNombre(categoria.getcCatNombre()));
        mav.getModel().put("categoria",categoriaService.buscarPorNombre(categoria.getcCatNombre()));
        return mav;
    }
}
