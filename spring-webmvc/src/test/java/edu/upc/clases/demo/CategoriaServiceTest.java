/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.entity.Categoria;
import edu.upc.clase.service.CategoriaService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Juan Yabiku
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class CategoriaServiceTest {
    private static Logger log = LoggerFactory.getLogger(UsuarioServiceTest.class);

    @Autowired
    private CategoriaService categoriaService;

    @Test
    public void debeValidarNombreVacio() {
        Assert.assertEquals(false, categoriaService.validar("CAT007",""));
    }
}
