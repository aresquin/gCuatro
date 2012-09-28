/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.CategoriaDao;
import edu.upc.clase.demo.entity.Categoria;
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
 * @author Juan Yabiku
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class CategoriaDaoTest {
    private static Logger log = LoggerFactory.getLogger(CategoriaDaoTest.class);
    
    @Autowired
    CategoriaDao categoriaDao;
    
    @Test
    public void debeInsertarCategoria() {
        Categoria categoria = new Categoria("Madedera", "../image/madedera.jpg", 1, 1);
        Integer id = categoriaDao.insertar(categoria);
        Assert.assertNotNull(id);
    }

    //@Test
    public void debeActualizarCategoria () {
        Categoria categoria = new Categoria("Madedera", "../image/madedera.jpg", 1, 1);
        Integer id = categoriaDao.insertar(categoria);
        categoria = categoriaDao.buscarPorId(id);
        categoria.setNombre("Orfebreria");
        categoriaDao.actualizar(categoria);
        Assert.assertEquals("Orfebreria", categoria.getNombre());
    }
    
    //@Test
    public void debeEliminarCategoria () {
        Categoria categoria = new Categoria("Madedera", "../image/madedera.jpg", 1, 1);
        Integer id = categoriaDao.insertar(categoria);
        categoria = categoriaDao.buscarPorId(id);
        categoriaDao.eliminar(categoria);
        categoria = categoriaDao.buscarPorId(id);
        Assert.assertNull(categoria);
    }
    
    @Test
    public void debeBuscarPorID() {
        Categoria categoria = new Categoria("Madedera", "../image/madedera.jpg", 1, 1);
        Integer id = categoriaDao.insertar(categoria);
        categoria = categoriaDao.buscarPorId(-1);
        Assert.assertNull(categoria);
    }
}