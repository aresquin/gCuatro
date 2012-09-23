package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.UsuariosDao;
import edu.upc.clase.demo.entity.Usuarios;
import edu.upc.clase.demo.service.UsuariosServices;
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
 * @author gian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class UsuariosDaoTest {
    
    private static Logger log = LoggerFactory.getLogger(UsuariosDaoTest.class);
    
    @Autowired
    UsuariosDao UsuariosDao;

    @Autowired
    UsuariosServices UsuariosServices;
        
    @Test
    public void testInsertarUsuario() {
        Usuarios usuarios = new Usuarios("Antonio","Resquin","Orovio","aresquino@outlook.com","123");
        Integer id = UsuariosDao.insertar(usuarios);
        Assert.assertNotNull(id);
    }

    /**
     * Quiero probar que despues de haber registrado un valor, lo pueda actualizar
     * Primero registro, luego grabo, luego busco, actualizo.
     */
//    @Test
//    public void testActualizarUsuario() {
//        Usuario usuario = new Usuario("Giancarlo Corzo","gian.corzo@antartec.com","admin");
//        Integer id = usuarioDao.insertar(usuario);
//        usuario = usuarioDao.buscar(id);
//        usuario.setNombre("Javier Corzo");
//        usuarioDao.actualizar(usuario);
//        usuario = usuarioDao.buscar(id);
//        Assert.assertEquals("Javier Corzo", usuario.getNombre());
//    }
//
//    @Test
//    public void testEliminarUsuario() {
//        Usuario usuario = new Usuario("Giancarlo Corzo","gian.corzo@antartec.com","admin");
//        Integer id = usuarioDao.insertar(usuario);
//        usuario = usuarioDao.buscar(id);
//        usuarioDao.eliminar(usuario);
//        usuario = usuarioDao.buscar(id);
//        Assert.assertNull(usuario);
//    }
//
//    @Test
//    public void testBuscarPorLetras() {
//        Usuario usuario = new Usuario("Giancarlo Corzo","gian.corzo@antartec.com","admin");
//        Integer id = usuarioDao.insertar(usuario);
//        usuario = usuarioDao.buscar(-8);
//        Assert.assertNull(usuario);
//    }
}
