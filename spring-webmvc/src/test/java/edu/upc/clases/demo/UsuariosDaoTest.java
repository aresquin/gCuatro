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

  
    @Test
    public void testActualizarUsuario() {
        Usuarios usuarios = new Usuarios("Johan","CHolan","Farromeque","gian.corzo@antartec.com","admin");
        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(id);
        usuarios.setNombre("Johan");
        UsuariosDao.actualizar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(id);
        Assert.assertEquals("Johan", usuarios.getNombre());
    }

    @Test
    public void testEliminarUsuario() {
        Usuarios usuarios = new Usuarios("Johan","CHolan","Farromeque","gian.corzo@antartec.com","admin");
        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(id);
        UsuariosDao.eliminar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(id);
        Assert.assertNull(usuarios);
    }

    @Test
    public void testBuscarPorLetras() {
        Usuarios usuarios = new Usuarios("Johan","CHolan","Farromeque","gian.corzo@antartec.com","admin");
        Integer id = UsuariosDao.insertar(usuarios);
        usuarios = UsuariosDao.buscarXcodigo(-8);
        Assert.assertNull(usuarios);
    }
}
