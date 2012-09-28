/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.SubcategoriaDao;
import edu.upc.clase.demo.entity.Subcategoria;
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
public class SubcategoriaDaoTest {
    private static Logger log = LoggerFactory.getLogger(CategoriaDaoTest.class);
    
    @Autowired
    SubcategoriaDao subCategoriaDao;
    
    @Test
    public void debeInsertarSubCategoria() {
        Subcategoria subCategoria = new Subcategoria("Industrial", 1, 1);
        Integer id = subCategoriaDao.insertar(subCategoria);
        Assert.assertNotNull(id);
    }

    //@Test
    public void debeActualizarSubCategoria () {
        Subcategoria subCategoria = new Subcategoria("Industrial", 1, 1);
        Integer id = subCategoriaDao.insertar(subCategoria);
        subCategoria = subCategoriaDao.buscarPorId(id);
        subCategoria.setNombre("Empresarial");
        subCategoriaDao.actualizar(subCategoria);
        Assert.assertEquals("Empresarial", subCategoria.getNombre());
    }
    
    //@Test
    public void debeEliminarSubCategoria () {
        Subcategoria subCategoria = new Subcategoria("Industrial", 1, 1);
        Integer id = subCategoriaDao.insertar(subCategoria);
        subCategoria = subCategoriaDao.buscarPorId(id);
        subCategoriaDao.eliminar(subCategoria);
        subCategoria = subCategoriaDao.buscarPorId(id);
        Assert.assertNull(subCategoria);
    }
    
    @Test
    public void debeBuscarPorID() {
        Subcategoria subCategoria = new Subcategoria("Industrial", 1, 1);
        Integer id = subCategoriaDao.insertar(subCategoria);
        subCategoria = subCategoriaDao.buscarPorId(-1);
        Assert.assertNull(subCategoria);
    }
}
