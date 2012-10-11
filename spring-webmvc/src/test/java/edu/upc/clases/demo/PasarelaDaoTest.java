package edu.upc.clases.demo;
import edu.upc.clase.demo.dao.PasarelaDao;
import edu.upc.clase.demo.entity.PasarelaV;
//import edu.upc.clase.demo.service.PasarelaServices;
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
public class PasarelaDaoTest {
    private static Logger log = LoggerFactory.getLogger(PasarelaDaoTest.class);
    
    @Autowired
    PasarelaDao pasarelaDao;

    @Test
    public void testInsertarPasarela() {
        PasarelaV pasarela = new PasarelaV("Peru",123456789,"12/12",123,"av.mexico");
        Integer id = pasarelaDao.insertar(pasarela);
        Assert.assertNotNull(id);
    }
    
    @Test
    public void testActualizarPasarela() {
        PasarelaV pasarela = new PasarelaV("Peru",123456789,"09/15",321,"av.Peru");
        Integer id = pasarelaDao.insertar(pasarela);
        pasarela = pasarelaDao.buscarXcodigo(id);
        pasarela.setPais("Chile");
        pasarelaDao.actualizar(pasarela);
        Assert.assertEquals("Chile",pasarela.getPais());
   }
    
     @Test
    public void testBuscarPorNumTarjeta() {
        PasarelaV pasarela = new PasarelaV("Peru",987654321,"09/15",321,"av.Peru");
        pasarelaDao.insertar(pasarela);
        pasarela = pasarelaDao.buscarXntarjeta(987654321);
        Assert.assertNotNull(pasarela);
    }
    
    @Test
    public void testEliminarPasarela() {
        Integer ntarjeta = 987654321;
        PasarelaV pasarela = new PasarelaV(ntarjeta);
        pasarelaDao.eliminar(pasarela);
        pasarela = pasarelaDao.buscarXntarjeta(ntarjeta);
        Assert.assertNull(pasarela);
    }
    
     
}
