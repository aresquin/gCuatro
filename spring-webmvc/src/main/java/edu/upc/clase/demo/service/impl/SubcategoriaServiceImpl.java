/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.service.impl;

import edu.upc.clase.demo.dao.SubcategoriaDao;
import edu.upc.clase.demo.dao.impl.CategoriaDaoImpl;
import edu.upc.clase.demo.entity.Subcategoria;
import edu.upc.clase.demo.service.SubcategoriaService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Yabiku
 */
@Service
public class SubcategoriaServiceImpl implements SubcategoriaService {
    private static Logger log= LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    @Autowired
    private SubcategoriaDao subCategoriaDao;
            
    @Override
    public Integer insertar (Subcategoria objSubcategoria) {
        if (!"".equals(objSubcategoria.getcSCatNombre())) {
            if (objSubcategoria.getnCatID() > 0) {
                log.info("Creando subcategoria");
                return subCategoriaDao.insertar(objSubcategoria);
            }
            return null;
        }
        return null;
    }
    
    @Override
    public void actualizar(Subcategoria objSubcategoria) {
         log.info("Actualizando subcategoria");
         subCategoriaDao.actualizar(objSubcategoria); 
    }

    @Override
    public void eliminar(Subcategoria objSubcategoria) {
        log.info("Eliminando subcategoria");
        subCategoriaDao.eliminar(objSubcategoria);
    }

    @Override
    public List<Subcategoria> buscarSubCategoria(Integer id) {
        log.info("Buscando todas las subcategoria");
        return subCategoriaDao.buscarSubCategoria(id);
    }

    @Override
    public Subcategoria buscarPorId(Integer id) {
        log.info("Buscando subcategoria por ID");
        return subCategoriaDao.buscarPorId(id);
    }
}
