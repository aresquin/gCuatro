
package edu.upc.clases.demo;

import edu.upc.clase.demo.entity.Colaborador;
import edu.upc.clase.demo.service.ColaboradorServices;
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
 * @author aresquin
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class ColaboradorServiceTest {

    private static Logger log = LoggerFactory.getLogger(ColaboradorServiceTest.class);

    @Autowired
    private ColaboradorServices colaboradorServices;
    
    //Validar Login
    @Test
    public void testValidarLogin() {
        Assert.assertEquals(false,colaboradorServices.autenticar("aresquino@outlook.com","123"));
    }
    
    //Validar Formato de Correo
    @Test 
    public void testValidarCorreo(){
        Assert.assertEquals(true, colaboradorServices.validarCorreo("aresquin@outlook.com"));
    }

    //Validar Longitud de Contraseña
    @Test
    public void testValidarLongitudContrasena() {
       Assert.assertEquals(false, colaboradorServices.validarContrasena("123456"));
    }

    //Validar 
    @Test
    public void testAutenticar() {
        Colaborador colaborador = new Colaborador("Antonio","Resquin","Orovio","aresquino@outlook.com","ad");
        colaboradorServices.insertar(colaborador);
        Assert.assertEquals(false,colaboradorServices.autenticar("aresquino@outlook.com","123"));
    }    
}