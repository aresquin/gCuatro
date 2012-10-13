package edu.upc.clases.demo;
import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.entity.PasarelaV;
import edu.upc.clase.demo.service.PasarelaService;
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
 * @author Aresquin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class PasarelaServiceTest {
    private static Logger log = LoggerFactory.getLogger(PasarelaDaoTest.class);
    
    @Autowired
    PasarelaDao pasarelaDao;

    @Autowired
    PasarelaService pasarelaService;
    
    //Validar Numero de Tarjeta
    @Test 
    public void testValidarNumTarjeta(){
        Assert.assertEquals(false,pasarelaService.ValidarLongTarjeta(123456) );
    }
   
}
