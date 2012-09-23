
package edu.upc.clases.demo;

import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosServices;
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
 * @author operador
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class UsuariosServiceTest {

    private static Logger log = LoggerFactory.getLogger(UsuariosServiceTest.class);

    @Autowired
    private UsuariosServices usuariosServices;
    
    @Test
    public void testAutenticarPasswordVacio() {
        Assert.assertEquals(false,usuariosServices.autenticar("aresquino@outlook.com",""));
    }

    @Test
    public void testAutenticarMinimo() {
        Usuarios usuario = new Usuarios("Antonio","Resquin","Orovio","aresquino@outlook.com","ad");
        Integer id = usuariosServices.insertar(usuario);
        Assert.assertNull(id);
    }

    @Test
    public void testAutenticarElCorreoTieneFormatoAdecuado() {
        Usuarios usuario = new Usuarios("Antonio","Resquin","Orovio","aresquino@outlook.com","ad");
        usuariosServices.insertar(usuario);
        Assert.assertEquals(false,usuariosServices.autenticar("aresquino@outlook.com","123"));
    }    
}