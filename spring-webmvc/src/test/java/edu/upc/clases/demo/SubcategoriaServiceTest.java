/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.entity.Subcategoria;
import edu.upc.clase.demo.service.SubcategoriaService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Juan Yabiku
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class SubcategoriaServiceTest {
    
    private static Logger log = LoggerFactory.getLogger(CategoriaServiceTest.class);
    
    @Autowired
    private SubcategoriaService subCategoriaService;
    
    @Test
    public void debeValidarNombreNulo () {
        Subcategoria subCategoria = new Subcategoria("",1,1);
        Integer id = subCategoriaService.insertar(subCategoria);
        Assert.assertNull(id);
    }
    
    @Test
    public void debeValidarCategoriaNula () {
        Subcategoria subCategoria = new Subcategoria("Tienda",0,1);
        Integer id = subCategoriaService.insertar(subCategoria);
        Assert.assertNull(id);
    }
}
