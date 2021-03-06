/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.CategoriaDao;
import edu.upc.clase.demo.dao.impl.CategoriaDaoImpl;
import edu.upc.clase.demo.entity.Categoria;
import edu.upc.clase.demo.service.CategoriaService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Yabiku
 */

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private static Logger log = LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public Integer insertar(Categoria objCategoria) {
        if (!"".equals(objCategoria.getcCatNombre())) {
            log.info("Creando categoria");
            return categoriaDao.insertar(objCategoria);
        }
        return null;
    }

    @Override
    public void actualizar(Categoria objCategoria) {
        log.info("Actualizando categoria");
        categoriaDao.actualizar(objCategoria);
    }

    @Override
    public void eliminar(Categoria objCategoria) {
        log.info("Eliminando categoria");
        categoriaDao.eliminar(objCategoria);
    }

    @Override
    public List<Categoria> buscarCategoria() {
        log.info("Buscando todas las categorias");
        return categoriaDao.buscarCategoria();
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        log.info("Buscando categoria por ID");
        return categoriaDao.buscarPorId(id);
    }
    
    @Override
    public Categoria buscarPorNombre(String nombre) {
        log.info("Buscando categoria por nombre");
        return categoriaDao.buscarPorNombre(nombre);
    }
}
