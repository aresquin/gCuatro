package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.entity.Pasarela;
import edu.upc.clase.demo.service.PasarelaServices;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class PasarelaDaoTest {
     private static Logger log = LoggerFactory.getLogger(PasarelaDaoTest.class);
    
    @Autowired
    PasarelaDao pasarelaDao;

    @Autowired
    PasarelaServices pasarelaServices;
        
    @Test
    public void testInsertarDatos() {
        Pasarela pasarela = new Pasarela("Peru",123456789,"08/10",123,"Jr. Ancash 3682");
        Integer id = pasarelaDao.insertar(pasarela);
        Assert.assertNotNull(id);
    }
}




