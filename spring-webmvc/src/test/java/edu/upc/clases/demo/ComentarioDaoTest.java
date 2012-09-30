/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;
import edu.upc.clase.demo.dao.ComentarioDao;
import edu.upc.clase.demo.entity.Comentario;
import java.util.Date;
import org.junit.*;
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

public class ComentarioDaoTest {
     private static Logger log = LoggerFactory.getLogger(ComentarioDaoTest.class);
    
    @Autowired
    ComentarioDao comentarioDao;
    Date fecha = new Date();
    Integer iRes = 0;
    
     @Test
    public void debeInsertarComentario() {
        Comentario objComentario = new Comentario();
        objComentario.setnComID(1);
        objComentario.setcComDescripcion("comentario de un plan");
        objComentario.setcComFecCrea(fecha);
        Integer id = comentarioDao.comentar(objComentario);
        Assert.assertNotNull(id);
    }
  @Test
    public void testEliminarComentario() {
        
        Comentario objComentario = new Comentario();
        objComentario.setnComID(1);
        objComentario.setcComDescripcion("comentario de un plan");
        Integer id= comentarioDao.eliminar(objComentario);
        Assert.assertNotNull(id);
    }
}
