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
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
