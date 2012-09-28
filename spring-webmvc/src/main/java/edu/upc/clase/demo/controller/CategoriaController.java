/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.service.CategoriaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Juan Yabiku
 */
@Controller("categoriaController")
public class CategoriaController {
    
    @Autowired
    //private CategoriaService categoriaService;
    private static Logger log = LoggerFactory.getLogger(CategoriaController.class);
    
    
    
}
