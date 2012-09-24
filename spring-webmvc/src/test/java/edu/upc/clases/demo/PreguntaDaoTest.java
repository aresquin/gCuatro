/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.PreguntaDao;
import edu.upc.clase.demo.entity.Pregunta;
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
 * @author carlos
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional

public class PreguntaDaoTest {
     private static Logger log = LoggerFactory.getLogger(UsuarioDaoTest.class);
    
    @Autowired
    PreguntaDao preguntaDao;
    
       @Test
     public void testEnviarPregunta() {
        Pregunta pregunta = new Pregunta("Cuanto es el precio del plan");
        Integer id = preguntaDao.enviar(pregunta);
        Assert.assertNotNull(id);
    }
     
     @Test
    public void testEliminarPregunta() {
        Pregunta pregunta = new Pregunta("Cuanto es el precio del plan");
        Integer id = preguntaDao.enviar(pregunta);
        preguntaDao.eliminar(pregunta);
        Assert.assertNull(pregunta);
    }
    
}
