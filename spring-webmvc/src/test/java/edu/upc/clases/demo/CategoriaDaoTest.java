/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.CategoriaDao;
import edu.upc.clase.demo.entity.Categoria;
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
public class CategoriaDaoTest {
    private static Logger log = LoggerFactory.getLogger(CategoriaDaoTest.class);
    
    @Autowired
    CategoriaDao categoriaDao;
    
    @Test
    public void debeInsertarCategoria() {
        Categoria categoria = new Categoria ("Madedera", "../image/madedera.jpg", 1, "24/09/2012 00:00:00", "jp_yabiku@hotmail.com");
        Integer id = categoriaDao.insertar(categoria);
        Assert.assertNotNull(id);
    }
    
}
