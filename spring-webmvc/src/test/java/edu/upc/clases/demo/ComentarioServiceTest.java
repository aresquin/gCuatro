/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;
import edu.upc.clase.demo.entity.Comentario;
import edu.upc.clase.demo.service.ComentarioService;
import java.util.Date;
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
 * @author user
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class ComentarioServiceTest {
     private static Logger log = LoggerFactory.getLogger(ComentarioServiceTest.class);
    
    @Autowired
    ComentarioService comentarioService;
    Date fecha = new Date();
    Integer iRes=0;
 
    
    @Test
    public void debeValidarComentarioVacio() {
       Comentario objComentario = new Comentario();
        objComentario.setnComID(1);
        objComentario.setnPlaID(1);
        objComentario.setnUsuID(1);
        objComentario.setcComDescripcion("gfhfgh");
        objComentario.setcComFecCrea(fecha);
        Integer id = comentarioService.comentar(objComentario);
        Assert.assertNotNull(id);
    }
    
}
