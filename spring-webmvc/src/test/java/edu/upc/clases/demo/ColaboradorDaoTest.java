package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.ColaboradorDao;
import edu.upc.clase.demo.entity.Colaborador;
import edu.upc.clase.demo.service.ColaboradorServices;
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
public class ColaboradorDaoTest {
    
    private static Logger log = LoggerFactory.getLogger(ColaboradorDaoTest.class);
    
    @Autowired
    ColaboradorDao colaboradorDao;

    @Autowired
    ColaboradorServices colaboradorServices;
        
    @Test
    public void testInsertarUsuario() {
        Colaborador colaborador = new Colaborador("Antonio","Resquin","Orovio","aresquino@outlook.com","123");
        Integer id = colaboradorDao.insertar(colaborador);
        Assert.assertNotNull(id);
    }

  
    @Test
    public void testActualizarUsuario() {
        Colaborador colaborador = new Colaborador("Johan","Cholan","Farromeque","jcholan@outlook.com","admin");
        Integer id = colaboradorDao.insertar(colaborador);
        colaborador = colaboradorDao.buscarXcodigo(id);
        colaborador.setNombre("Joel");
        colaboradorDao.actualizar(colaborador);
        
        Assert.assertEquals("Joel",colaborador.getNombre() );
   }
    
    @Test
    public void testEliminarUsuario() {
        String correo = "aresquino@outlook.com";
        Colaborador colaborador = new Colaborador(1,correo);
        colaboradorDao.eliminar(colaborador);
        colaborador = colaboradorDao.buscarCorreo(correo);
        Assert.assertNull(colaborador);
    }
    
    @Test
    public void testBuscarPorLetras() {
        Colaborador colaborador = new Colaborador("Antonio","Resquin","Orovio","aresquino@outlook.com","123");
        Integer id = colaboradorDao.insertar(colaborador);
        colaborador = colaboradorDao.buscarXcodigo(-8);
        Assert.assertNull(colaborador);
    }
}
